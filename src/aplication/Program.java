package aplication;

import java.util.List;

import dao.CategoryDAO;
import dao.DaoConstructor;
import entities.Category;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA INSERIR CATEGORIA
		
		CategoryDAO cat=DaoConstructor.createCategoryDAO();
		
		cat.insertCategory(new Category(null, "ALIMENTOS"));

	}

}
