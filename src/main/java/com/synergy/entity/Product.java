package com.synergy.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@EqualsAndHashCode(callSuper = false)
public final class Product extends BaseEntity {
    final String name;
    final double price;
    final int quantity;

    public Product(int id, String name, double price, int quantity) {
        super(id);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
