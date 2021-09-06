package aplication;

import java.util.List;

import dao.CategoryDAO;
import dao.DaoConstructor;
import entities.Category;

public class Program {

	public static void main(String[] args) {
		
	
		//TESTE DO METODO PARA ATUALIZAR CATEGORIA
		
		CategoryDAO cat=DaoConstructor.createCategoryDAO();
		
		cat.updateCategory(new Category(3L, "ROUPAS"));

	}

}
