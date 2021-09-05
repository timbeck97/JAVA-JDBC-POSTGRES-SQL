package dao.implementation;

import java.sql.Connection;
import java.util.List;

import dao.ProductDAO;
import entities.Product;

public class ProductDAOJDBC implements ProductDAO {
	private Connection conn;
	public ProductDAOJDBC() {
		
	}
	public ProductDAOJDBC(Connection conn) {
		this.conn=conn;
	}
	
	
	@Override
	public void insertCategory(Product category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(Product category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
