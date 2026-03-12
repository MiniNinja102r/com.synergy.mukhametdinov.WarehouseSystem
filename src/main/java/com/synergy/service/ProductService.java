package com.synergy.service;

import com.synergy.entity.Product;
import com.synergy.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public final class ProductService {
    final ProductRepository repository;

    public void addProduct(Product product) {
        repository.save(product);
    }
}
