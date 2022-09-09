package com.example.invoiceapp.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InvoiceController  {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/invoices")
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/invoices/{id}")
    public Optional<Invoice> getInvoice(@PathVariable int id) {
        return invoiceService.getInvoice(id);
    }

    @PostMapping("/invoices")
    public void postInvoice(@RequestBody Invoice invoice) {
        invoiceService.addInvoice(invoice);
    }

    @PutMapping("/invoices/{id}")
    public void updateInvoice(@RequestBody Invoice invoice, @PathVariable int id) {
        invoiceService.updateInvoice(invoice, id);
    }

    @DeleteMapping("/invoices/{id}")
    public void deleteInvoice(@RequestBody Invoice invoice, @PathVariable int id) {
        invoiceService.deleteInvoice(invoice,id);
    }
}
