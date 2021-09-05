package dao;

import java.util.List;

import entities.Product;

public interface ProductDAO {
	void insertCategory(Product category);
	void deleteCategory(Long id);
	void updateCategory(Product category);
	List<Product> findAll();
	Product findById(Long id);
}
