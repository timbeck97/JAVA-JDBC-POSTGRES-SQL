package aplication;

import java.util.List;

import dao.DaoConstructor;
import dao.implementation.ProductDAOJDBC;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA PROCURAR TODOS PRODUTOS
		
		ProductDAOJDBC prod=DaoConstructor.createProductDAO();
		
		List<Product> produtos=prod.findAll();
		produtos.forEach(System.out::println);
		
		

	}

}
