package com.pluralsight.NorthWindsTradersApi.controller;

import com.pluralsight.NorthWindsTradersApi.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//import org.springframework.web.bind.annotation.RequestMethod;

public class ProductsController {

    @RequestMapping(path="/product", method= RequestMethod.GET)


    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Minute Maid", 1, 4.77));
        products.add(new Product(2, "Fruit snacks", 2, 3.54));
        products.add(new Product(3,"Turkey", 3,6.99));

        return products;
    }

//    @RequestMapping(path="/product", method= RequestMethod.GET)

//    public List<Product> productSearch() {
//        List<Product> products = new ArrayList<>();
//    }
}
