package com.geekbrains.july.market.controllers;

import com.geekbrains.july.market.entities.Category;
import com.geekbrains.july.market.entities.Product;
import com.geekbrains.july.market.models.Basket;
import com.geekbrains.july.market.services.CategoriesService;
import com.geekbrains.july.market.services.ProductsService;
import com.geekbrains.july.market.utils.ProductFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/basket")
public class BasketController {
    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.geekbrains.july.market.models");
    Basket basket = context.getBean(Basket.class);

    @GetMapping
    public String basketPage() {
        return "basket";
    }

    @GetMapping("/remove/{id}")
    public String removeProduct(@PathVariable Long id) {
        basket.removeProduct(id);
        return "redirect:/basket/";
    }
}