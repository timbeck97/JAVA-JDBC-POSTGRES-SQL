package aplication;

import dao.DaoConstructor;
import dao.implementation.ProductDAOJDBC;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA DELETAR PRODUTOS
		
		ProductDAOJDBC prod=DaoConstructor.createProductDAO();
		
		prod.deleteProduct(7l);
		

	}

}
