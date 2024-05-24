package com.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.model.Category;
import com.ms.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository catRepo;
	
	//Save Category
	public void addCategory(Category category) {
		catRepo.save(category);
	}
	
	//Get All Category
	public List<Category> getAllCategories() {
		return catRepo.findAll();
	}
	
	//Get Single Category By Id
		public Optional<Category> getCategoryById(int id) {
			return catRepo.findById(id);
		}
	
	//Remove Category
	public void removeCategoryById(int id) {
		catRepo.deleteById(id);
	}
}
