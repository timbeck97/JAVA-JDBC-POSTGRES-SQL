package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DataBaseException;
import database.DatabaseConnection;

public class Program {

	public static void main(String[] args) {
		Connection conn=DatabaseConnection.getConnection();
		
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		//CODIGO PARA TESTAR O FUNCIONAMENTO DO ACESSO AO BANCO DE DADOS
		//BUSCAR NOME DOS PRODUTOS.
		
		try{
			ps=conn.prepareStatement("SELECT * from produto");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(2)); 
			}
			
		}
		catch(SQLException e) {
			throw new DataBaseException(e.getMessage());
		}
		finally {
			DatabaseConnection.closeResultSet(rs);
			DatabaseConnection.closeStatement(ps);
		}
		
		

	}

}
