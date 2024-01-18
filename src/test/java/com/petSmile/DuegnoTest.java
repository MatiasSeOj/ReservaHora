package com.petSmile;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.testng.annotations.Test;

import utils.Conexion;

public class DuegnoTest {
	
  @Test
  public void f() {
	  
	  String  rut = "123-4", 
			  nombre = "aaaaaaaa", 
			  apellido = "bbbbbbbb", 
			  direccion = "abcde 1234", 
			  correo = "blablabla@gmail.com", 
			  telefono = "+1234567", 
			  nombreMascota = "Lucy";
	  
	  Connection con;
	  Conexion cn = new Conexion();
	  PreparedStatement stmt;
	  
	  String sentence = "INSERT INTO duegno (rut, nombre, apellido, direccion, correo, telefono, nombreMascota) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
	  try {
		con = cn.getConnection();
		stmt = con.prepareStatement(sentence);
		stmt.setString(1,rut);
		stmt.setString(2,nombre);
		stmt.setString(3,apellido);
		stmt.setString(4,direccion);
		stmt.setString(5,correo);
		stmt.setString(6,telefono);
		stmt.setString(7,nombreMascota);
		stmt.executeUpdate();
		System.out.println("Ejecución de la Tabla Dueño exitosa");
	  } catch (Exception e) {
		  System.out.println("Error en la Base de Datos: " + e);
	  }
	  
  }
  
}
