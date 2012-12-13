package com.gmail.dailyefforts.java.db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqliteDBA {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("org.sqlite.JDBC"); // Make sure the JDBC.class is
											// available.
		Connection connection = DriverManager
				.getConnection("jdbc:sqlite:test.db");
		String sql = "drop table if exists file_list"; // file_list is the table
														// name;
		runSql(connection, sql);

		sql = "create table file_list('_id' integer primary key autoincrement not null unique, 'file_name' text, 'file_path' text, 'timestamp' datetime default current_timestamp)";
		runSql(connection, sql);

		File root = new File("/bin");
		sql = "insert into file_list(file_name, file_path) values(?, ?)";
		travel(root, connection, sql);

	}

	private static void travel(File root, Connection connection, String sql)
			throws SQLException {
		File[] files = root.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isFile()) {
					runSqlInsert(connection, sql, f.getName(), f.getParent()
							.toString());
				} else {
					travel(f, connection, sql);
				}
			}
		}
	}

	private static void runSql(Connection connection, String sql)
			throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
	}

	private static void runSqlInsert(Connection connection, String sql,
			String fileName, String filePath) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, fileName);
		preparedStatement.setString(2, filePath);
		preparedStatement.executeUpdate();
	}
}
