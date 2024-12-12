package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private final List<Category> categories;

    public CategoryController() {
        this.categories = new ArrayList<>();
        this.categories.add(new Category(1, "Stuff"));
        this.categories.add(new Category(2, "Things"));
        this.categories.add(new Category(3, "Objects"));
    }

    @RequestMapping(path="/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return this.categories;
    }

    @RequestMapping(path="/categories/{id}", method = RequestMethod.GET)
    public Category getACategory(@PathVariable int id) {
        return this.categories.get(id-1);
    }

}
