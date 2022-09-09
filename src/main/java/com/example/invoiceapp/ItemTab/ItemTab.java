package com.example.invoiceapp.ItemTab;

import com.example.invoiceapp.Item.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "itemtabs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemTab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "tabfk")
    private int tabfk;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "tablink", referencedColumnName = "id")
    private List<Item> items = new ArrayList<>();

    public double calculateTotal() {
        if (this.items.size() != 0) {
            double total = 0;
            for (Item item : this.items) {
                total = total + item.getPrice();
            }
            return total;
        }
        return 0;
    }



}
