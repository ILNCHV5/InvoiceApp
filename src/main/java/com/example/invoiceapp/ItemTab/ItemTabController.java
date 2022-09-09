package com.example.invoiceapp.ItemTab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemTabController {

    @Autowired
    private ItemTabService itemTabService;

    @GetMapping("invoices/itemtabs")
    public List<ItemTab> getAllItemTabs() {
        return itemTabService.getAllTabs();
    }

    @GetMapping("invoices/itemtabs/{id}")
    public Optional<ItemTab> getItemTab(@PathVariable int id) {
        System.out.println("ba ba tyi gica");
        return itemTabService.getItemTab(id);
    }

    @PostMapping("invoices/itemtabs")
    public void postItemTab(@RequestBody ItemTab itemTab) {
        itemTabService.addItemTab(itemTab);
    }

    @PutMapping("invoices/itemtabs/{id}")
    public void updateItemTab(@RequestBody ItemTab itemTab, @PathVariable int id) {
        itemTabService.updateItemTab(itemTab,id);
    }

    @DeleteMapping("invoices/itemtabs/{id}")
    public void deleteItemTab(@RequestBody ItemTab itemTab, @PathVariable int id) {
        itemTabService.deleteItemTab(itemTab,id);
    }
}
