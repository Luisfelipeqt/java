package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestaConexao {

	public static void main(String[] args) {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/loja, null, null);

	}

}
