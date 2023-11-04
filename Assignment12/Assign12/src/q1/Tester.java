package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
		System.out.println("1. Insert new candidate");
		System.out.println("2. Display all candidates");
		System.out.println("3. Increment votes of candidate with given id");
		System.out.println("4. Delete candidate with given id");
		System.out.println("5. Find candidate of given id");
		System.out.println("6. Find candidates of given party");
		System.out.println("7. Display total votes for each party");

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
					
					sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)"; // parameterized query
					try(PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.print("Enter Name: ");
						String name = sc.next();
						System.out.print("Enter Party: ");
						String party = sc.next();
						System.out.print("Enter Votes: ");
						int votes = sc.nextInt();
						
						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					} // stmt.close(); 

					break;
				case 2:
					System.out.println("You Choose 2");
					System.out.println();

					sql = "SELECT * FROM candidates";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {

//						System.out.print("Enter min votes: ");
//						int minVotes = sc.nextInt();
//						stmt.setInt(1, minVotes);

						try (ResultSet rs = stmt.executeQuery()) {
							while (rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						} // rs.close();

					} // stmt.close();
					System.out.println();
					break;

				case 3:
					System.out.println("You Choose 3");

					sql = "UPDATE candidates SET votes = ? WHERE id = ?";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter the id: ");
						stmt.setInt(2, sc.nextInt());

						System.out.println("Enter the Votes: ");
						stmt.setInt(1, sc.nextInt());

						int count = stmt.executeUpdate();
						System.out.println("Row Affected: " + count);
					}
				case 4:
					System.out.println("You Choose 3");

					sql = "DELETE FROM candidates WHERE id = ?";
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
					sql = "SELECT * FROM candidates WHERE id = ?";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter the id: ");
						stmt.setInt(1, sc.nextInt());

						try (ResultSet res = stmt.executeQuery()) {
							while (res.next()) {
								System.out.printf("%s, %s, %s, %d\n", res.getString("id"), res.getString("name"),
										res.getString("party"), res.getInt("votes"));
							}
							System.out.println();
						}

					}
					break;
				case 6:
					sql = "SELECT * FROM candidates WHERE party = ?";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter the party: ");
						stmt.setString(1, sc.next());

						try (ResultSet res = stmt.executeQuery()) {
							while (res.next()) {
								System.out.printf("%s, %s, %s, %d\n", res.getString("id"), res.getString("name"),
										res.getString("party"), res.getInt("votes"));
							}
						}

					}
					break;

				case 7:
					sql = "SELECT party, SUM(votes) FROM candidates GROUP BY party";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
//						System.out.println("Enter the id: ");
//						stmt.setInt(1, sc.nextInt());
						
						try (ResultSet res = stmt.executeQuery()){
							while(res.next()) {
								System.out.printf("%s, %s\n",res.getString("party"), res.getString("SUM(votes)"));
								
							}
						}
						
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
