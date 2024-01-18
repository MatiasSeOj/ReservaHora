package com.petSmile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.testng.annotations.Test;

import utils.Conexion;

public class AgendaTest {
	
  @Test
  public void f() {
	  
	  String  rutDuegno = "123-4", 
			  nombreMascota = "Lucy", 
			  hora = "16:45", 
			  fecha = "2025/10/10";
	  
	  int	  idMascota = 2;
	  
	  Connection con;
	  Conexion cn = new Conexion();
	  PreparedStatement stmt;
	  
	  String sentence = "INSERT INTO agenda (idMascota, rutDuegno, nombreMascota, hora, fecha) VALUES (?, ?, ?, ?, ?)";
		
	  try {
		con = cn.getConnection();
		stmt = con.prepareStatement(sentence);
		stmt.setInt(1,idMascota);
		stmt.setString(2,rutDuegno);
		stmt.setString(3,nombreMascota);
		stmt.setString(4,hora);
		stmt.setString(5,fecha);
		stmt.executeUpdate();
		System.out.println("Ejecución de la Tabla Agenda exitosa");
	  } catch (Exception e) {
		  System.out.println("Error en la Base de Datos: " + e);
	  }
	  
  }
  
}
