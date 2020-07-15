package com.geekbrains.july.market.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    @Column(name = "id_categories")
    private int id_categories;

    public Product(Long id, String title, int price, int id_categories) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.id_categories = id_categories;
    }
}
