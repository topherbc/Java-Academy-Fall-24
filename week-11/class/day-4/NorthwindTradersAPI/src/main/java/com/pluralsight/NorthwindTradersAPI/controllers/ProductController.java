package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.dao.ProductDao;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao) {
       this.productDao = productDao;
    }

    @RequestMapping(path="/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return this.productDao.getAll();
    }

    @RequestMapping(path="/products/{id}", method = RequestMethod.GET)
    public Product getAProduct(@PathVariable int id) {
        return this.productDao.getById(id);
    }

    @RequestMapping(path="/products", method = RequestMethod.POST)
    public boolean addAProduct(@RequestBody Product product) {
        return this.productDao.insert(product);
    }
}
