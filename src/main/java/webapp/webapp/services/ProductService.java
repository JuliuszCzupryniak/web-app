package webapp.webapp.services;

import webapp.webapp.dtos.CategoryRequest;
import webapp.webapp.dtos.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAll();
    List<ProductResponse> getAllFromCategory(CategoryRequest categoryRequest);
}
