package com.synergy.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@Getter
public final class Product {
    final int id;
    final String name;
    final double price;
    final int quantity;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }
}
