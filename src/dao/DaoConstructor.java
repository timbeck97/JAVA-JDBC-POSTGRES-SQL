package dao;

import dao.implementation.CategoryDAOJDBC;
import dao.implementation.ProductDAOJDBC;
import database.DatabaseConnection;

public class DaoConstructor {
	public static CategoryDAOJDBC createCategoryDAO() {
		return new CategoryDAOJDBC(DatabaseConnection.getConnection());
	}
	public static ProductDAOJDBC createProductDAO() {
		return new ProductDAOJDBC(DatabaseConnection.getConnection());
	}
}
