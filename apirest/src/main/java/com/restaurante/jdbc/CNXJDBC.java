package com.restaurante.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CNXJDBC {
	
	private static final String DRIVER_CLASS = "org.hsqldb.jdbcDriver";
	private static Connection cnx = null;
	private static String user = "sa";
	private static String password = "";
	private static String PathBase = "C:\\Users\\bruno\\Documents\\workspace-sts-3.9.8.RELEASE\\apirest\\src\\main\\resources\\Restaurante";
	private static final String URL = "jdbc:hsqldb:file:" + PathBase + ";shutdown=true;hsqldb.write_delay=false; ";
	
	public static Connection conectar() {
		if(cnx == null) {
			try {
				Class.forName(DRIVER_CLASS);
				//Estabelendo conexão
				cnx = DriverManager.getConnection(URL, user, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnx;
	}
	
	public static void fecharCNX() {
		try {
			cnx.close();
			cnx = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
