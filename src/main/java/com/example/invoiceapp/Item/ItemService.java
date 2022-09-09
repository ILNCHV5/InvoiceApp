package com.example.invoiceapp.Item;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        ArrayList<Item> list = new ArrayList<>();
        itemRepository.findAll().forEach(item -> list.add(item));
        return list;
    }

    public Optional<Item> getItem(int id) {
        return itemRepository.findById(id);
    }

    public void addItem(Item item) {

        itemRepository.save(item);
    }

    public void updateItem(Item item, int id) {
        itemRepository.save(item);
    }

    public void deleteItem(Item item, int id) {
        itemRepository.delete(item);
    }
}
