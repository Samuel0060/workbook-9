package com.pluralsight.northwindtraders.console.dao;

import com.pluralsight.northwindtraders.console.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDao implements ProductDao{

    private DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String sql = """
                SELECT *
                FROM products""";

        try(
                Connection connection = dataSource.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet result = stmt.executeQuery(sql)) {

            while (result.next()) {
                Product product = new Product();

                product.setProductID(result.getInt("productID"));
                product.setName(result.getString("Name"));
                product.setCategory(result.getString("category"));
                product.setPrice(result.getDouble("price"));

                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product add(Product product) {
        return null;
    }
}
