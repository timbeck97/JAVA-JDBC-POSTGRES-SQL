package dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.ProductDAO;
import database.DataBaseException;
import database.DatabaseConnection;
import entities.Category;
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
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=conn.prepareStatement("SELECT * FROM produto "
					+ "INNER JOIN categoria ON produto.id_categoria=categoria.id_categoria "
					+ "WHERE id_produto= ?");
			ps.setFloat(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				Long idprod=rs.getLong(1);
				String nome=rs.getString(2);
				Double price=rs.getDouble(3);
				Long idcat=rs.getLong(4);
				String catname=rs.getString(6);
				Product prod=new Product(idprod, nome, price, new Category(idcat, catname));
				return prod;
			}
			
			
		}
		catch(SQLException e) {
			throw new DataBaseException(e.getMessage());
		}
		finally{
			DatabaseConnection.closeResultSet(rs);
			DatabaseConnection.closeStatement(ps);
		}
		return null;
	}

}
