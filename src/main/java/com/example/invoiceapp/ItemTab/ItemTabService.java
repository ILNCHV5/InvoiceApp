package com.example.invoiceapp.ItemTab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemTabService {

    @Autowired
    private ItemTabRepository itemTabRepository;

    public Optional<ItemTab> getItemTab(int id) {
        return itemTabRepository.findById(id);
    }

    public List<ItemTab> getAllTabs(){
        List<ItemTab> list = new ArrayList<>();
        for(ItemTab itemTab: itemTabRepository.findAll()){
            list.add(itemTab);
        }
        return list;
    }

    public void addItemTab(ItemTab itemTab) {
        itemTabRepository.save(itemTab);
    }

    public void updateItemTab(ItemTab itemTab, int id) {
        itemTabRepository.save(itemTab);
    }

    public void deleteItemTab(ItemTab itemTab, int id) {
        itemTabRepository.delete(itemTab);
    }
}
