package dao;

import java.util.List;

import entities.Category;

public interface CategoryDAO {
	void insertCategory(Category category);
	void deleteCategory(Long id);
	void updateCategory(Category category);
	List<Category> findAll();
	Category findById(Long id);
}
