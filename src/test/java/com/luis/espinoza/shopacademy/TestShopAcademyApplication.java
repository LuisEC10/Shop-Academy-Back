package com.luis.espinoza.shopacademy;

import org.springframework.boot.SpringApplication;

public class TestShopAcademyApplication {

    public static void main(String[] args) {
        SpringApplication.from(ShopAcademyApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
