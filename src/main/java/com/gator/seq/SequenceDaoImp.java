package com.gator.seq;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SequenceDaoImp implements TemplateDao {

	@Override
	public boolean insert(String str) {
		
		try (Connection conn = ConnectionUtil.getConnection()) {
			
			CallableStatement stmt = conn.prepareCall("CALL garbage_in(?)");
			stmt.setString(1, str);
			
			
			return (stmt.executeUpdate() > 0);
			
		} catch (SQLException sqle) {
			
			System.err.println(sqle.getMessage());
			System.err.println("SQL State: " + sqle.getSQLState());
			System.err.println("Error CodE: " + sqle.getErrorCode());
			
			
		} 
		return false;
	}

	@Override
	public Integer getLast() {
		try (Connection conn = ConnectionUtil.getConnection()) {
			
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM garbage ORDER BY order_date DESC");
			ResultSet rs = stmt.executeQuery();
			int seqNext = -1;
			
			if (rs.next()) {
				seqNext = rs.getInt("colid");
			}
			
			
			return seqNext;
			
		} catch (SQLException sqle) {
			
			System.err.println(sqle.getMessage());
			System.err.println("SQL State: " + sqle.getSQLState());
			System.err.println("Error CodE: " + sqle.getErrorCode());
			
			
		} 
		
		return null;
	}
}
