package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.dao.CategoryDao;
import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private CategoryDao categoryDao;

    @Autowired
    public CategoryController(CategoryDao categoryDao) {
       this.categoryDao = categoryDao;
    }

    @RequestMapping(path="/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return this.categoryDao.getAll();
    }

    @RequestMapping(path="/categories/{id}", method = RequestMethod.GET)
    public Category getACategory(@PathVariable int id) {
        return this.categoryDao.getById(id);
    }

}
