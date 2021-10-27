package Controleur;

import java.sql.*;

public class CreateTable {
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createTable();
    }
    }

