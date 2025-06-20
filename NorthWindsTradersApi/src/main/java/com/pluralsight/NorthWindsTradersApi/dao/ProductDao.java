package com.pluralsight.NorthWindsTradersApi.dao;

import com.pluralsight.NorthWindsTradersApi.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductDao {

    List<Product> getAll();

    Product add(Product product);
}
