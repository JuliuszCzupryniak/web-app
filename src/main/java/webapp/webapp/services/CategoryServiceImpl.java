package webapp.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.webapp.dtos.CategoryResponse;
import webapp.webapp.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryResponse> getAll() {
        return StreamSupport.stream(categoryRepository.findAll().spliterator(), false)
                .map(category -> new CategoryResponse(category.getId_category(),category.getName_category(),category.getImage_catgeory()))
                .collect(Collectors.toList());
    }
}
