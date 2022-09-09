package com.example.invoiceapp.Buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BuyerService  {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers() {
        ArrayList<Buyer> list = new ArrayList<>();
        buyerRepository.findAll().stream().forEach(iv -> list.add(iv));
        return list;
    }

    public Optional<Buyer> getBuyer(int id) {
        return buyerRepository.findById(id);
    }

    public void addBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    public void updateBuyer(Buyer buyer, int id) {
        buyerRepository.save(buyer);
    }

    public void deleteBuyer(Buyer buyer, int id) {
        buyerRepository.delete(buyer);
    }

}
