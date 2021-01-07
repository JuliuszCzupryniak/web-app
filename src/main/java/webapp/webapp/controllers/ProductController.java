package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.entities.Product;
import webapp.webapp.repositories.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/api/entities/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return (List<Product>) productRepository.findAll();
    }
}
