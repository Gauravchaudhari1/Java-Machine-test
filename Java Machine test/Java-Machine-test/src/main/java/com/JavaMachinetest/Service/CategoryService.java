package com.JavaMachinetest.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.JavaMachinetest.Entity.Category;
import com.JavaMachinetest.Repository.CategoryRepository;





@Service
public class CategoryService {
	

	    @Autowired
	    private CategoryRepository categoryRepository;

	    public Page<Category> getAllCategories(Pageable pageable) {
	        return categoryRepository.findAll(pageable);
	    }

	    public Category saveCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id).orElse(null);
	    }

	    public Category updateCategory(Long id, Category category) {
	        category.setId(id);
	        return categoryRepository.save(category);
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }


	
}
