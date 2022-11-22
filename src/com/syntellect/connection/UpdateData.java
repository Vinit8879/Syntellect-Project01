package com.syntellect.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");

			System.out.println("Driver loaded");
			Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println("Connection established");
			
			int student_id =1;
		//	String student_name="Nikhil";
			double student_Score= 100;
			
			String Sql= "update student set student_score=? where student_id=?";
			PreparedStatement pstatement= connect.prepareStatement(Sql);
			pstatement.setInt(2, student_id);
		//	pstatement.setString(2, student_name);
			pstatement.setDouble(1, student_Score);
			
			pstatement.executeUpdate();
			System.out.println("Record Got Updated");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
