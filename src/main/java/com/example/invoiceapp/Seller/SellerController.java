package com.example.invoiceapp.Seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/invoices/sellers")
    public List<Seller> getAllSellers() {
        return sellerService.getAllSellers();
    }

    @GetMapping("/invoices/sellers/{id}")
    public Optional<Seller> getSeller(@PathVariable int id) {
        return sellerService.getSeller(id);
    }

    @PostMapping("/invoices/sellers")
    public void postSeller(@RequestBody Seller seller) {
        sellerService.addSeller(seller);
    }

    @PutMapping("/invoices/sellers/{id}")
    public void updateSeller(@RequestBody Seller seller, @PathVariable int id) {
        sellerService.updateSeller(seller, id);
    }

    @DeleteMapping("/invoices/sellers/{id}")
    public void deleteSeller(@RequestBody Seller seller, @PathVariable int id) {
        sellerService.deleteSeller(seller, id);
    }
}
