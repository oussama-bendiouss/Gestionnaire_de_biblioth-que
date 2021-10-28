

import Modele.*;

import java.sql.*;

import static java.sql.Date.valueOf;

/**
 *
 * @author sqlitetutorial.net
 */
public class Main {

    /**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */
    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:/Users/Fondation/Desktop/ST/BaseDonnées/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Editeur f = new Editeur("Talis");
        Auteur a = new Auteur("Rapha", "Taylor");
       //Oeuvre d = new Oeuvre("5H", "5h pour faire un projet", "2021-10-28");
        //Ecrire s = new Ecrire(1,1);
       // Edition fd = new Edition(403,2,"2018-08-30",2);
        //Categorie cat1 = new Categorie("Prof", 15,15);
        //Utilisateur uti1 = new Utilisateur("Hajar", "Ben","hajar.b2000@gmail.com",10,2);
        //Interdiciton in1 = new Interdiciton(1,"2021-10-28","2021-10-29");
        Emprunter em1 = new Emprunter(1,1,"2021-10-28","2021-10-29");


    }
}