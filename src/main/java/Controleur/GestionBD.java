package Controleur;

import java.sql.*;

import static Controleur.ConnectionBD.connect;

public class GestionBD {

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
        String sql = "INSERT INTO Auteur(Nom, Prenom) VALUES(?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, prenom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Oeuvre(String titre, Date annee,String description) {
        String sql = "INSERT INTO Oeuvre(Titre, Description, Année) VALUES(?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titre);
            pstmt.setDate(3,annee);
            pstmt.setString(2, description);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Edition(int ISBN, int ID_Oeuvre,Date Année, int ID_Editeur) {
        String sql = "INSERT INTO Edition(ISBN, ID_Oeuvre, Année, ID_Editeur) VALUES(?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, ISBN);
            pstmt.setInt(2, ID_Oeuvre);
            pstmt.setDate(3,Année);
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
    public static void insert_Emprunte(Date Début,Date fin) {
        String sql = "INSERT INTO Emprunte(Début, Fin) VALUES(?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDate(1,Début);
            pstmt.setDate(2,fin);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Interdiction(int ID_Utilisateur, Date Début, Date fin) {
        String sql = "INSERT INTO Interdiction(ID_Utilisateur, Date_Début, Date_Fin) VALUES(?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1,ID_Utilisateur);
            pstmt.setDate(2,Début);
            pstmt.setDate(3,fin);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void insert_Catégorie(int MaxEmprunte,int MAxDurée) {
        String sql = "INSERT INTO Catégorie(Max_Emprunte, Max_Durée) VALUES(?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1,MaxEmprunte);
            pstmt.setInt(2,MAxDurée);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
