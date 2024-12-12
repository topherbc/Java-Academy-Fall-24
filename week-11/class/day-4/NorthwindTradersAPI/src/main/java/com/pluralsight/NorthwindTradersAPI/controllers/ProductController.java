package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private final List<Product> products;

    public ProductController() {
        this.products = new ArrayList<>();
        this.products.add(new Product(1, 2, "Rubix Cube", 100.00));
        this.products.add(new Product(2, 5, "Chess Board", 50.00));
        this.products.add(new Product(3, 10, "Playing Cards", 10.00));
        this.products.add(new Product(4, 7, "Jigsaw Puzzle", 25.00));
        this.products.add(new Product(5, 3, "Monopoly", 75.00));
        this.products.add(new Product(6, 4, "Lego Set", 150.00));
        this.products.add(new Product(7, 8, "Dominoes", 20.00));
        this.products.add(new Product(8, 6, "Scrabble", 60.00));
        this.products.add(new Product(9, 12, "Uno Cards", 15.00));
        this.products.add(new Product(10, 1, "Kite", 30.00));
    }

    @RequestMapping(path="/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return this.products;
    }

    @RequestMapping(path="/products/{id}", method = RequestMethod.GET)
    public Product getAProduct(@PathVariable int id) {
        return this.products.get(id-1);
    }
}
