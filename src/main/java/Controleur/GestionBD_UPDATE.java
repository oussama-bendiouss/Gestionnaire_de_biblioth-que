package Controleur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Controleur.ConnectionBD.connect;

public class GestionBD_UPDATE {

    public static void insert_Editeur(String nom) {
        String sql = "INSERT INTO Editeur(Nom) VALUES(?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Auteur(String nom, String prenom) {
        String sql = "UPDATE Auteur "
                + " SET Nom = ?, Prenom = ?, Categorie = ?,TypeOeuvre = ? "
                + "WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, prenom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Oeuvre(String titre, String annee,String description) {
        String sql = "INSERT INTO Oeuvre(Titre, Description, Année) VALUES(?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titre);
            pstmt.setString(3,annee);
            pstmt.setString(2, description);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Edition(int ISBN, int ID_Oeuvre, String Année, int ID_Editeur) {
        String sql = "INSERT INTO Edition(ISBN, ID_Oeuvre, Année, ID_Editeur) VALUES(?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, ISBN);
            pstmt.setInt(2, ID_Oeuvre);
            pstmt.setString(3,Année);
            pstmt.setInt(4, ID_Editeur);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Ecrire(int ID_Oeuvre, int ID_Auteur) {
        String sql = "INSERT INTO Ecrire(ID_Auteur, ID_Oeuvre) VALUES(?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(2,ID_Oeuvre);
            pstmt.setInt(1,ID_Auteur);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Utilisateur(String nom, String prenom,String mail, int ID_Catégorie, int nbp) {
        String sql = "INSERT INTO Utilisateur(Nom, Prenom, Mail, Nb_livre, ID_Catégorie) VALUES(?,?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,nom);
            pstmt.setString(2,prenom);
            pstmt.setString(3,mail);
            pstmt.setInt(4,ID_Catégorie);
            pstmt.setInt(5,nbp);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Emprunte(int ID_Oeuvre, int ID_Utilisateur, String Début,String fin) {
        String sql = "INSERT INTO Emprunte(ID_Utilisateur, ID_Oeuvre, Début, Fin) VALUES(?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,ID_Utilisateur);
            pstmt.setInt(2,ID_Oeuvre);
            pstmt.setString(3,Début);
            pstmt.setString(4,fin);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Interdiction(int ID_Utilisateur, String Début, String fin) {
        String sql = "INSERT INTO Interdiction(ID_Utilisateur, Début, Fin) VALUES(?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1,ID_Utilisateur);
            pstmt.setString(2,Début);
            pstmt.setString(3,fin);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Catégorie(int MaxEmprunte,int MAxDurée, String Nom) {
        String sql = "INSERT INTO Catégorie(Nom, Max_Emprunte, Max_Durée) VALUES(?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,Nom);
            pstmt.setInt(2,MaxEmprunte);
            pstmt.setInt(3,MAxDurée);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
