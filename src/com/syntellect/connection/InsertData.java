package com.syntellect.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.util.LruCache.CreateAction;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");

			System.out.println("Driver loaded");
			Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println("Connection established");
			
			int student_id =1;
			String student_name="Nikhil";
			double student_Score= 26;
			
			String Sql= "Insert Into student values (?,?,?)";
			PreparedStatement pstatement= connect.prepareStatement(Sql);
			pstatement.setInt(1, student_id);
			pstatement.setString(2, student_name);
			pstatement.setDouble(3, student_Score);
			
			pstatement.executeUpdate();
			System.out.println("Record Got Inserted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
