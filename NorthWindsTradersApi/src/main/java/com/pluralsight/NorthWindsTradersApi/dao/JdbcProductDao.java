package com.pluralsight.NorthWindsTradersApi.dao;

import com.pluralsight.NorthWindsTradersApi.model.Product;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;


@Component
public class JdbcProductDao implements ProductDao{

    private DataSource dataSource;

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product add(Product product) {
        return null;
    }
}
