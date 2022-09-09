package com.example.invoiceapp.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        ArrayList <Invoice> list = new ArrayList<>();
        invoiceRepository.findAll().stream().forEach(iv -> list.add(iv));
        return list;
    }

    public Optional<Invoice> getInvoice(int id) {
        return invoiceRepository.findById(id);
    }

    public void addInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void updateInvoice(Invoice invoice, int id) {
        invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Invoice invoice, Object ID) {
        invoiceRepository.delete(invoice);
    }
}
