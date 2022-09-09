package com.example.invoiceapp.Buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping("/invoices/buyers")
    public List<Buyer> getAllBuyers() {
        return buyerService.getAllBuyers();
    }

    @GetMapping("/invoices/buyers/{id}")
    public Optional<Buyer> getBuyer(@PathVariable int id) {
        return buyerService.getBuyer(id);
    }

    @PostMapping("/invoices/buyers")
    public void postBuyer(@RequestBody Buyer buyer) {
        buyerService.addBuyer(buyer);
    }

    @PutMapping("/invoices/buyers/{id}")
    public void updateBuyer(@RequestBody Buyer buyer, @PathVariable int id) {
        buyerService.updateBuyer(buyer, id);
    }

    @DeleteMapping("/invoices/buyers/{id}")
    public void deleteBuyer(@RequestBody Buyer buyer, @PathVariable int id) {
        buyerService.deleteBuyer(buyer, id);
    }
}
