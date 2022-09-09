package com.example.invoiceapp.Seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getAllSellers() {
        ArrayList<Seller> list = new ArrayList<>();
        sellerRepository.findAll().stream().forEach(seller -> list.add(seller));
        return list;
    }

    public Optional<Seller> getSeller(int id) {
        return sellerRepository.findById(id);
    }

    public void addSeller(Seller seller) {
        sellerRepository.save(seller);
    }

    public void updateSeller(Seller seller, int id) {
        sellerRepository.save(seller);
    }

    public void deleteSeller(Seller seller, int id) {
        sellerRepository.delete(seller);
    }
}
