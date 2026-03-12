package com.synergy;

import com.synergy.controller.Controller;
import com.synergy.controller.DesktopController;
import com.synergy.controller.WebController;
import com.synergy.repository.PostgreSQLProductRepository;
import com.synergy.repository.ProductFactory;
import com.synergy.repository.ProductRepository;

public class Main {

    /**
     * Поскольку это программа является учебной, здесь не была реализована реальная
     * логика захода клиента (браузер, десктоп и прочее).
     */
    public static void main(String[] args) {
        final ProductRepository productRepository = new PostgreSQLProductRepository();
        final Controller desktopController = new DesktopController();
        final Controller webController = new WebController();

        desktopController.run();
        //webController.run();

        productRepository.save(ProductFactory.createProduct(0, "Телефон", 11_500));
        productRepository.save(ProductFactory.createProduct(1, "Телевизор", 25_000));
    }
}
