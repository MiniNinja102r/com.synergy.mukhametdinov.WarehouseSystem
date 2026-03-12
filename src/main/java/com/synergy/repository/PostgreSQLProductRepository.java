package com.synergy.repository;

import com.synergy.entity.Product;

public final class PostgreSQLProductRepository implements ProductRepository {

    @Override
    public void save(Product product) {
        if (product == null) {
            System.out.println("Не удалось сохранить продукт, не был найден");
            return;
        }
        System.out.println("Продукт " + product + " был сохранен.");
    }
}
