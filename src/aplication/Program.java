package aplication;

import dao.DaoConstructor;
import dao.implementation.ProductDAOJDBC;
import entities.Category;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA DELETAR PRODUTOS
		
		ProductDAOJDBC prod=DaoConstructor.createProductDAO();
		
		prod.insertProduct(new Product(null, "BERMUDA COLCCI", 160.0, new Category(3l, null)));
		

	}

}
