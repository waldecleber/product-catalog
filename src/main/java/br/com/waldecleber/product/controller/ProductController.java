package br.com.waldecleber.product.controller;

import br.com.waldecleber.product.repository.ProductRepository;
import br.com.waldecleber.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/teste")
    String teste() {
        return "teste";
    }
}
