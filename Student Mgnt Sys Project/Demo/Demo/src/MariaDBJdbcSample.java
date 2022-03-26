

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDBJdbcSample {
	public static void main(String... a) {
		Connection connection = null;
		PreparedStatement stmt = null;
		PreparedStatement stmtI = null;
		ResultSet rs = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo20210208", "root",
					"Kam123!@#");
			stmt = connection
					.prepareStatement("SELECT lname, fname, mname FROM PERSON");
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("LASTNAME: " + rs.getString("lname"));
				System.out.println("MIDDLENAME: " + rs.getString("mname"));
				System.out.println("FIRSTNAME: " + rs.getString("fname"));
				System.out
						.println("================================================");
			}

			connection.setAutoCommit(false);
			stmtI = connection
					.prepareStatement("INSERT INTO PERSON (lname, fname, mname) VALUES (?, ?, ?)");

			for (int i = 0; i < 10; i++) {
				stmtI.setString(1, "DOE");
				stmtI.setString(2, "ANONYMOUS");
				stmtI.setString(3, "JANE");
				stmtI.executeUpdate();
			}
			connection.commit();
			connection.setAutoCommit(true);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
