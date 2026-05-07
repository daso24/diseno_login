package diseno_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Authmodels {

	public Authmodels() {
		
	}
	
	public boolean login(String email, String password) {
		
		String query = "SELECT * FROM usuarios WHERE email = ? AND password = ?";
		
		System.out.println(query);
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/login",
				"root",
				"1234" 
			);

			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);

			rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}  
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		
		return false; 
	}

	public boolean registrar(String username, String email, String password) {
		
		String query = "INSERT INTO usuarios (username, email, password) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/login",
				"root",
				"1234" 
			);

			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);

			int filasAfectadas = ps.executeUpdate();
			
			if (filasAfectadas > 0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		
		return false;
	}

}