package com.example.demo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
class Reverse {
    @RequestMapping
    public static String omdraaien(String original) {
        return new StringBuilder(original).reverse().toString();
    }


}