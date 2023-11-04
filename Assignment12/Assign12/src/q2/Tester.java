package q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;
import java.util.Scanner;

public class Tester {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/practicsjdbc";
	public static final String DB_USER = "D6_80758_CHETAN";
	public static final String DB_PASSWORD = "sunbeam";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();

			System.exit(0);
		}

	}

	public static int menu(Scanner sc) {
		System.out.println("0. Exit");
		System.out.println("1. Insert new user (Voter)");
		System.out.println("2. Display all users");
		System.out.println("3. Delete voter with given id");
		System.out.println("4. Change status of voter with given id to true");
		System.out.println("5. Change the name and birth date of voterd");

		return sc.nextInt();
	}

	public static void main(String[] args) {
		String sql;
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Connection Establised...");
			int choice;

			while ((choice = menu(sc)) != 0) {
				switch (choice) {
				case 1:
					System.out.println("You Choose 1");
					
					sql = "INSERT INTO users VALUES(default, ?, ?, ?, ?, ?, ?, ?)"; // parameterized query
					try(PreparedStatement stmt = con.prepareStatement(sql)) {
//						System.out.print("Enter Id: ");
//						int id = sc.nextInt();
						System.out.print("Enter First Name: ");
						String fname = sc.next();
						System.out.print("Enter Last Name: ");
						String lname = sc.next();
						System.out.print("Enter Email: ");
						String email = sc.next();
						System.out.print("Enter Password: ");
						String pass = sc.next();
						System.out.print("Enter Date: ");
						String dob = sc.next();
						System.out.print("Enter Status: ");
						int status = sc.nextInt();
						System.out.print("Enter Role: ");
						String role = sc.next();
						
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate = sdf.parse(dob);
						java.sql.Date sDate = new java.sql.Date(uDate.getTime());
						
						
//						stmt.setInt(1, id);
						stmt.setString(1, fname);
						stmt.setString(2, lname);
						
						stmt.setString(3, email);
						stmt.setString(4, pass);
						stmt.setDate(5, sDate);
						
						stmt.setInt(6, status);
						stmt.setString(7, role);
							
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 

					break;
				case 2:
					System.out.println("You Choose 2");
					System.out.println();

					sql = "SELECT * FROM users";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {

//						System.out.print("Enter min votes: ");
//						int minVotes = sc.nextInt();
//						stmt.setInt(1, minVotes);

						try (ResultSet rs = stmt.executeQuery()) {
							while (rs.next()) {
								int id = rs.getInt("id");
								String fname = rs.getString("first_name");
								String lname = rs.getString("last_name");
								String email = rs.getString("email");
								String pass = rs.getString("password");
								String dob = rs.getString("dob");
								int status = rs.getInt("status");
								String role = rs.getString("role");
								System.out.printf("%d, %s, %s, %s, %s, %s, %d %s\n", id, fname, lname, email, pass, dob, status, role);
								
							}
						} // rs.close();

					} // stmt.close();
					System.out.println();
					break;

				case 4:
					System.out.println("You Choose 4");

					sql = "UPDATE users SET status = 1 WHERE id = ?";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter the id: ");
						stmt.setInt(1, sc.nextInt());

//						System.out.println("Enter the Votes: ");
//						stmt.setInt(1, sc.nextInt());

						int count = stmt.executeUpdate();
						System.out.println("Row Affected: " + count);
					}
					break;
				case 3:
					System.out.println("You Choose 3");

					sql = "DELETE FROM users WHERE id = ?";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter the id: ");
						stmt.setInt(1, sc.nextInt());

						int count = stmt.executeUpdate();
						if (count == 0) {
							System.out.println("Not Found");
						} else {
							System.out.println("Row Affected: " + count);
						}
					}
					break;
				case 5:
					System.out.println("You Choose 4");

					sql = "UPDATE users SET first_name = ? , last_name = ? , dob = ? WHERE id = ?";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter the id: ");
						stmt.setInt(4, sc.nextInt());
						System.out.println("Enter the First Name: ");
						stmt.setString(1, sc.next());
						System.out.println("Enter the Last Name");
						stmt.setString(2, sc.next());
						
						System.out.println("Enter the DOB");
						String tempdob = sc.next();
						
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate = sdf.parse(tempdob);
						java.sql.Date sDate = new java.sql.Date(uDate.getTime());
						
						stmt.setDate(3, sDate);
//						System.out.println("Enter the Votes: ");
//						stmt.setInt(1, sc.nextInt());

						int count = stmt.executeUpdate();
						System.out.println("Row Affected: " + count);
					}
					break;
				
				default:
					System.out.println("Wrong Choice");;
				}
			}

		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
