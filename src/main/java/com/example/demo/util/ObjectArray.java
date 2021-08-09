package com.example.demo.util;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@Getter
class Product{
    private final int prodNumberID;
    private final String description;
}

public class ObjectArray {
    public Product[] creatCart(){
        Product[] cart = new Product[5];
        String[] producNames = {"Coffee","Computer","Apple","Dress","Fairy-tale book"};
        Product p1 = new Product(1, "Coffee");
        Product p2 = new Product(2, "Computer");
        Product p3 = new Product(3, "Apple");
        Product p4 = new Product(4, "Dress");
        Product p5 = new Product(5, "Fairy-tale book");
        for(int i = 1; i < cart.length; i++){
            cart[i] = new Product(i,producNames[i-1]);
        }
        return cart;
    }


}
