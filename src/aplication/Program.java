package aplication;

import dao.CategoryDAO;
import dao.DaoConstructor;
import entities.Category;

public class Program {

	public static void main(String[] args) {
		
		//CODIGO ABAIXO PARA TESTAR O ACESSO AO BANCO DE DADOS
		//TESTE DO METODO PARA BUSCAR CATEGORIA POR ID
		
		CategoryDAO cat=DaoConstructor.createCategoryDAO();
		
		Category category=cat.findById(1l);
		
		System.out.println(category);
		

	}

}
