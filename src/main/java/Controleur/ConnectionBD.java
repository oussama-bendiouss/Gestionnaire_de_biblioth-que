package Controleur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */
public class ConnectionBD {
    /**
     * Connect to a sample database
     */
    /*public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Fondation/Desktop/ST/BaseDonnées/BD.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        connect();
    }
    */
  /*  public  Connection connect() {
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
*/
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
    public static Connection connect(String d) {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/Users/Fondation/Desktop/ST/BaseDonnées/"+d;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}