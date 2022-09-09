package com.example.invoiceapp.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    Item findByDescription(String description);

}
