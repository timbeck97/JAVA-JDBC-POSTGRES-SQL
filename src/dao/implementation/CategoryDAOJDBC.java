package dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CategoryDAO;
import database.DataBaseException;
import database.DatabaseConnection;
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
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Category> categorias=new ArrayList<>();
		try {
			ps=conn.prepareStatement("SELECT * from Categoria");
			rs=ps.executeQuery();
			while(rs.next()){
				Long idcat=rs.getLong("id_categoria");
				String namecat=rs.getString("nome");
				categorias.add(new Category(idcat, namecat));
			}
			
		}
		catch(SQLException e) {
			throw new DataBaseException(e.getMessage());
		}
		finally {
			DatabaseConnection.closeResultSet(rs);
			DatabaseConnection.closeStatement(ps);
		}
		return categorias;
	}

	@Override
	public Category findById(Long id) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try{
			ps=conn.prepareStatement("SELECT * from Categoria WHERE "
					+ "id_categoria= ?");
			
			ps.setFloat(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				Long id_category=rs.getLong("id_categoria");
				String name=rs.getString("nome");
				Category c1=new Category(id_category, name);
				return c1;
			}
			
		}
		catch(SQLException e) {
			throw new DataBaseException(e.getMessage());
		}
		finally {
			DatabaseConnection.closeResultSet(rs);
			DatabaseConnection.closeResultSet(rs);
		}
		return null;
	}

}
