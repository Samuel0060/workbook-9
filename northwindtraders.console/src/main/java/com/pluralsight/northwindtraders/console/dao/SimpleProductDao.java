package com.pluralsight.northwindtraders.console.dao;

import com.pluralsight.northwindtraders.console.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao{
   private List<Product> products = new ArrayList<>();
   private int lastProductID = 3;

    public SimpleProductDao() {

        products.add(new Product(1, "Capn Crunch", "Cereal", 5.99));
        products.add(new Product(2, "Cinnamon Toast Crunch", "Cereal", 4.99));
        products.add(new Product(3, "Trix", "Cereal", 3.99));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product add(Product product) {
        if (product.getProductID() == 0) {
            product.setProductID(lastProductID++);
            lastProductID++;
        }
        products.add(product);
        return product;
    }
}
