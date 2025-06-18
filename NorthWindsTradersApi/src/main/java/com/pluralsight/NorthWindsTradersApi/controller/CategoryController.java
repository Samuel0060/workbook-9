package com.pluralsight.NorthWindsTradersApi.controller;

import com.pluralsight.NorthWindsTradersApi.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {

    @RequestMapping(path="/category", method= RequestMethod.GET)
    public List<Category> getAllCategories() {
        List<Category> categories = new ArrayList<>();

            categories.add(new Category(1, "Drinka"));
            categories.add(new Category(2, "Sweets"));
            categories.add(new Category(3, "Deli"));

            return categories;
    }
}
