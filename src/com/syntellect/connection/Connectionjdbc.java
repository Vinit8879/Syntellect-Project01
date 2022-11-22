package com.syntellect.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectionjdbc {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded");
			Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			System.out.println("Connection established");
			Statement statement = connect.createStatement();
			String sql = "Select * from student";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				int Id = rs.getInt("student_id");
				String Name = rs.getString("student_name");
				Double Score = rs.getDouble("student_score");

				System.out.println(Id + " " + Name + " " +Score);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}