package aplication;

import dao.DaoConstructor;
import dao.implementation.ProductDAOJDBC;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA PROCURAR PRODUTO POR ID
		
		ProductDAOJDBC prod=DaoConstructor.createProductDAO();
		
		Product p=prod.findById(1l);
		System.out.println(p);
		
		

	}

}
