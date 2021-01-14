package webapp.webapp.services;

import webapp.webapp.dtos.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAll();
}
