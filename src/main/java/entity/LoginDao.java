package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.Conexion;

public class LoginDao {
	
	public static Boolean verificar(String user, String pass) {
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement stmt;
		ResultSet rs;
		String us = "";
		Boolean valido = false;
		String sentence = "SELECT * FROM usuario WHERE nombreUsuario = ? AND password = ?";
		
		try {
			
			con = cn.getConnection();
			stmt = con.prepareStatement(sentence);
			stmt.setString(1,user);
			stmt.setString(2,pass);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				us = rs.getString("nombreUsuario");
			}
			if(us.equals(user) && us!="" && us!=null) {
				valido = true;
			} else {
				valido = false;
			}
			
		} catch (Exception e) {}
		return valido;
	}
	
}
