package com.gator.seq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {


	
	
	
	
	
	
	
	
	
	
	
	ConnectionUtil() {}
	
	protected static Connection getConnection() {
		//System.out.println("a");
		InputStream in = null;
		//System.out.println("b");
		try {
			//System.out.println("1");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("2");
			Properties props = new Properties();
			//System.out.println("3");
			in = new FileInputStream("src/main/resources/sequence.properties");
			//System.out.println("4");
			props.load(in);
			//System.out.println("5");
			return DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"),
												props.getProperty("jdbc.password"));
			
		} catch (ClassNotFoundException cfe) {
			
			System.err.println(cfe.getMessage());
			System.out.println("cnfe");
			
		} catch (SQLException sqle) {
			
			System.err.println(sqle.getMessage());
			System.out.println("sqle");
			
		} catch (FileNotFoundException fnfe) {
			
			System.err.println(fnfe.getMessage());
			System.out.println("fnfe");
			
		} catch (IOException ioe) {
			
			System.err.println(ioe.getMessage());
			System.out.println("ioe");
			
		} finally {
			
			try {
				in.close();
			} catch (IOException ioe) {
				
				ioe.getMessage();
			}
			
		}
		return null;
	}
	
	
	
	
	
}
