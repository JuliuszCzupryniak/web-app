package webapp.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.webapp.dtos.CategoryRequest;
import webapp.webapp.dtos.ProductResponse;
import webapp.webapp.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponse> getAll() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map(product -> new ProductResponse(product.getId_product(),product.getName_product(),product.getPrice_product(),product.getImage_product(),product.getId_category()))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductResponse> getAllFromCategory(CategoryRequest categoryRequest) {
        return StreamSupport.stream(productRepository.findProductsByIdCategory(categoryRequest.getId_category()).spliterator(), false)
                .map(product -> new ProductResponse(product.getId_product(),product.getName_product(),product.getPrice_product(),product.getImage_product(),product.getId_category()))
                .collect(Collectors.toList());
    }
}
