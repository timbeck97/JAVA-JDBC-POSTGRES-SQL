package dao;

import java.util.List;

import entities.Product;

public interface ProductDAO {
	void insertProduct(Product product);
	void deleteProduct(Long id);
	void updateProduct(Product product);
	List<Product> findAll();
	Product findById(Long id);
}
