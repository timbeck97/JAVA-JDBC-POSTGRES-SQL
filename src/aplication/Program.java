package aplication;

import java.util.List;

import dao.CategoryDAO;
import dao.DaoConstructor;
import entities.Category;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA BUSCAR TODAS CATEGORIAS
		
		CategoryDAO cat=DaoConstructor.createCategoryDAO();
		
		List<Category> lista=cat.findAll();
		lista.forEach(System.out::println);

	}

}
