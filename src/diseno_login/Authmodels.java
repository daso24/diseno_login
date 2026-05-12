package diseno_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public List<String[]> obtenerUsuarios() {
		List<String[]> listaUsuarios = new ArrayList<>();
		
		String query = "SELECT id, username, email FROM usuarios";
		
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
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String[] usuario = new String[3];
				usuario[0] = String.valueOf(rs.getInt("id"));
				usuario[1] = rs.getString("username");
				usuario[2] = rs.getString("email");
				listaUsuarios.add(usuario);
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
		
		return listaUsuarios;
	}
	
	public int contarUsuarios() {
		int total = 0;
		
		String query = "SELECT COUNT(*) AS total FROM usuarios";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/login",
				"root",
				"1234" 
			);

			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				total = rs.getInt("total");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		
		return total;
	}

}