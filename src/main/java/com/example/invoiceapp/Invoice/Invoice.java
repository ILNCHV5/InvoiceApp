package com.example.invoiceapp.Invoice;

import com.example.invoiceapp.Buyer.Buyer;
import com.example.invoiceapp.ItemTab.ItemTab;
import com.example.invoiceapp.Seller.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date", nullable = false, length = 100)
    private LocalDate date = java.time.LocalDate.now();

    @Column(name = "total")
    private double total;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "tabfk", referencedColumnName = "id")
    private ItemTab tabfk;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sellerfk", referencedColumnName = "id")
    private Seller sellerfk;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyerfk",referencedColumnName = "id")
    private  Buyer buyerfk;

    public double setTotal(){
        try {
            return tabfk.calculateTotal();
        }catch (Exception e){
            System.out.println("Cant fetch total");
        }
        return 0;
    }


}
