package com.example.invoiceapp.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/invoices/itemtabs/{tab_id}/items")
    public List<Item> getAllItems(@PathVariable String tab_id) {
        return itemService.getAllItems();
    }

    @GetMapping("/invoices/itemtabs/{tab_id}/items/{id}")
    public Optional<Item> getItem(@PathVariable int id, @PathVariable String tab_id) {
        return itemService.getItem(id);
    }

    @PostMapping("/invoices/itemtabs/{tab_id}/items")
    public void addItem(@RequestBody Item item, @PathVariable String tab_id) {
        itemService.addItem(item);
    }

    @PutMapping("/invoices/itemtabs/{tab_id}/items/{id}")
    public void updateItem(@RequestBody Item item, @PathVariable int id, @PathVariable String tab_id) {
        itemService.updateItem(item,id);
    }

    @DeleteMapping("/invoices/itemtabs/{tab_id}/items/{id}")
    public void deleteItem(@RequestBody Item item, @PathVariable int id, @PathVariable String tab_id) {
        itemService.deleteItem(item,id);
    }
}
