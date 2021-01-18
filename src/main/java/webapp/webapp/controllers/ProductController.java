package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.dtos.CategoryRequest;
import webapp.webapp.dtos.ProductResponse;
import webapp.webapp.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products_by_category")
    public ResponseEntity<List<ProductResponse>> getProducts(@RequestBody CategoryRequest categoryRequest){
        return new ResponseEntity<List<ProductResponse>>(productService.getAllFromCategory(categoryRequest),HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponse>> getAllProducts(){
        return new ResponseEntity<List<ProductResponse>>(productService.getAll(),HttpStatus.OK);
    }
}
