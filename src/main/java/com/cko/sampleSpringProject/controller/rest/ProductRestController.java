package com.cko.sampleSpringProject.controller.rest;

import com.cko.sampleSpringProject.dao.FilmDAO;
import com.cko.sampleSpringProject.dao.ProductDAO;
import com.cko.sampleSpringProject.model.Film;
import com.cko.sampleSpringProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    ProductDAO productDAO;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product) {
        productDAO.save(product);
    }
    /*@GetMapping("/get")
    public */

}
