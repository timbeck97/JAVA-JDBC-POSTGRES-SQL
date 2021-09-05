package dao.implementation;

import java.sql.Connection;
import java.util.List;

import dao.CategoryDAO;
import entities.Category;

public class CategoryDAOJDBC implements CategoryDAO {

	private Connection conn;
	public CategoryDAOJDBC() {
		
	}
	public CategoryDAOJDBC(Connection conn) {
		this.conn=conn;
	}
	
	@Override
	public void insertCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
