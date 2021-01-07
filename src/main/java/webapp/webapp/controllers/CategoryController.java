package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.entities.Category;
import webapp.webapp.repositories.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping("/api/entities/")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return (List<Category>) categoryRepository.findAll();
    }
}
