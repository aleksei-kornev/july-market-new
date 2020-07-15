package com.geekbrains.july.market.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//коммент для коммита
@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public Category(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
