package com.petSmile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.testng.annotations.Test;

import utils.Conexion;

public class MascotaTest {
	
  @Test
  public void f() {
	  
	  String  rutDuegno = "123-4", 
			  tipoMascota = "gato", 
			  nombreMascota = "Lucy";
	  
	  int 	  edad = 2;
	  
	  Connection con;
	  Conexion cn = new Conexion();
	  PreparedStatement stmt;
	  
	  String sentence = "INSERT INTO mascota (rutDuegno, tipoMascota, edad, nombreMascota) VALUES (?, ?, ?, ?)";
		
	  try {
		con = cn.getConnection();
		stmt = con.prepareStatement(sentence);
		stmt.setString(1,rutDuegno);
		stmt.setString(2,tipoMascota);
		stmt.setInt(3,edad);
		stmt.setString(4,nombreMascota);
		stmt.executeUpdate();
		System.out.println("Ejecución de la Tabla Mascota exitosa");
	  } catch (Exception e) {
		  System.out.println("Error en la Base de Datos: " + e);
	  }
	  
  }
  
}
