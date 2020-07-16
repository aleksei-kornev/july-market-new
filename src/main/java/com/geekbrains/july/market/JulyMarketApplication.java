package com.geekbrains.july.market;

import com.geekbrains.july.market.models.Basket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JulyMarketApplication {
	// Домашнее задание:
	// 1. Реализуйте корзину в виде бина (корзина не сущность, а обычный Спринг бин)
	// 2. Необходимо добавлять товары в корзину, удалять их оттуда, просматривать
	// список товаров в корзине


	public static void main(String[] args) {
		SpringApplication.run(JulyMarketApplication.class, args);
	}
}