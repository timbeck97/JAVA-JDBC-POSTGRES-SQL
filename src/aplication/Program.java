package aplication;

import dao.DaoConstructor;
import dao.implementation.ProductDAOJDBC;
import entities.Category;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA ATUALIZAR PRODUTOS
		
		ProductDAOJDBC prod=DaoConstructor.createProductDAO();
		
		prod.updateProduct(new Product(1L, "TV SAMSUNG", 1900.0, new Category(1l, null)));
		

	}

}
