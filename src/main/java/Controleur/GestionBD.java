package Controleur;

import java.sql.*;

public class GestionBD {
    public static void createTable(){
        String url = "jdbc:sqlite:C:/Users/Fondation/Desktop/ST/BaseDonnées/BD.db";

        // SQL statement for creating a new table
        String sql = "Select * from assad";


        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            ResultSet result = stmt.executeQuery("SELECT * FROM lwahch;");
            System.out.println(result);
            while (result.next()) {
                System.out.println(result.getInt("Id_oeuvre"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/Users/Fondation/Desktop/ST/BaseDonnées/BD.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void insert(String name, String capacity) {
        String sql = "INSERT INTO warehouses(name,capacity) VALUES(?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
