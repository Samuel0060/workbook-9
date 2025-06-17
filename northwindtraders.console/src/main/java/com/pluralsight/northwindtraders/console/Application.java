package com.pluralsight.northwindtraders.console;

import com.pluralsight.northwindtraders.console.dao.SimpleProductDao;
import com.pluralsight.northwindtraders.console.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	SimpleProductDao productDao;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


		List<Product> products = productDao.getAll();
		System.out.println(products);
	}
}
