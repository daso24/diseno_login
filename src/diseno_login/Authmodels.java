package diseno_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Authmodels {

	public Authmodels() {
		
	}
	
	public boolean login(String username, String password) {
		
		String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
		
		System.out.println(query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/login",
				"root",
				"1234" 
			);

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}  
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		
		return false; 
	}

}
