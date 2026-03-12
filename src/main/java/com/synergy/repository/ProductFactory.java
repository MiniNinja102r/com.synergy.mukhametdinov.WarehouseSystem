package com.synergy.repository;

import com.synergy.entity.Product;
import com.synergy.exception.NullableProductException;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class ProductFactory {

    public static Product createProduct(int id, String name, double price) {
        return createProduct(id, name, price, 1);
    }

    public static Product createProduct(int id, String name, double price, int quantity) {
        if (name == null) {
            throw new NullableProductException("Продукт не может быть без имени.");
        }

        return new Product(id, name, price, quantity);
    }
}
