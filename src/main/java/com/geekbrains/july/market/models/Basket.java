package com.geekbrains.july.market.models;

import com.geekbrains.july.market.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class Basket {
    private List<Product> listOfProducts;

    public void addProduct (Product product) {
        listOfProducts.add(product);
    }

    public void removeProduct (Long id) {
        Iterator<Product> productIterator = listOfProducts.iterator();
        while(productIterator.hasNext()) {
            Product nextProduct = productIterator.next();
            if (nextProduct.getId().equals(id)) {
                productIterator.remove();
            }
        }
    }

    public List<Product> getListOfProducts () {
        return this.listOfProducts;
    }

    @PostConstruct
    public void init() {
        this.listOfProducts = new ArrayList<Product>();
        for (int i = 0; i < 3; i++) {
            this.listOfProducts.add(new Product(Long.parseLong(Integer.toString(i)), "тест", i*10));
        }
    }
}
