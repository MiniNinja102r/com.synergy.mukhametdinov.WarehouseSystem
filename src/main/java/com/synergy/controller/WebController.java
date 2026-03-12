package com.synergy.controller;

import com.synergy.repository.PostgreSQLProductRepository;
import com.synergy.repository.ProductFactory;
import com.synergy.repository.ProductRepository;

public final class WebController {

    public static void main(String[] args) {
        final ProductRepository productRepository = new PostgreSQLProductRepository();

        System.out.println("Запущена веб-версия складского помещения");

        productRepository.save(ProductFactory.createProduct(1, "Телевизор", 25_000));
    }
}
