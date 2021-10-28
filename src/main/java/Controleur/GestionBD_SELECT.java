package Controleur;

import Modele.*;


import java.sql.*;
import java.util.ArrayList;

import static Controleur.ConnectionBD.connect;

public class GestionBD_SELECT {

    public static ArrayList<Editeur> select_Editeur() {
        String sql = "SELECT ID_Editeur,Nom FROM Editeur";
        ArrayList<Editeur> liste_Editeur = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Editeur editeur = new Editeur();
                editeur.setNom(rs.getString("Nom"));
                editeur.setID_Editor(rs.getInt("ID_Editeur"));
                liste_Editeur.add(editeur);
                //System.out.println(editeur.getID_Editeur());
                //System.out.println(editeur.getNom());

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return liste_Editeur;
    }
    public static ArrayList<Auteur> select_Auteur() {
        String sql = "SELECT ID_Auteur,Nom, Prenom FROM Auteur";

        ArrayList<Auteur> liste_Auteur = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Auteur auteur = new Auteur();
                auteur.setNom(rs.getString("Nom"));
                auteur.setPrenom(rs.getString("Prenom"));
                auteur.setID_Auteur(rs.getInt("ID_Auteur"));
                liste_Auteur.add(auteur);
                //System.out.println(editeur.getID_Editeur());
                //System.out.println(editeur.getNom());

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 return liste_Auteur;
    }
    public static ArrayList<Oeuvre> select_Oeuvre() {
        String sql = "SELECT ID_Oeuvre,Titre, Description, Année FROM Oeuvre";

        ArrayList<Oeuvre> liste_Oeuvre = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Oeuvre oeuvre = new Oeuvre();
                oeuvre.setTitre(rs.getString("Titre"));
                oeuvre.setDescription(rs.getString("Description"));
                oeuvre.setAnnée(rs.getString("Année"));
                oeuvre.setID_Oeuvre(rs.getInt("ID_Oeuvre"));
                liste_Oeuvre.add(oeuvre);
                //System.out.println(editeur.getID_Editeur());
                //System.out.println(editeur.getNom());

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
return liste_Oeuvre;
    }
    public static ArrayList<Edition> select_Edition() {
        String sql = "SELECT ISBN,ID_Oeuvre, Année, ID_Editeur FROM Edition";

        ArrayList<Edition> liste_Edition = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Edition edition = new Edition();
                edition.setAnnée(rs.getString("Année"));
                edition.setISBN(rs.getInt("ISBN"));
                edition.setID_Editeur(rs.getInt("ID_Editeur"));
                edition.setID_Oeuvre(rs.getInt("ID_Oeuvre"));
                liste_Edition.add(edition);


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
return liste_Edition;
    }

    public static ArrayList<Ecrire> select_Ecrire() {
        String sql = "SELECT ID_Auteur,ID_Oeuvre FROM Ecrire";

        ArrayList<Ecrire> liste_Ecrire = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Ecrire ecrire = new Ecrire();
                ecrire.setID_Auteur(rs.getInt("ID_Auteur"));
                ecrire.setID_Oeuvre(rs.getInt("ID_Oeuvre"));
                liste_Ecrire.add(ecrire);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        /*  @Test.Test
        finally {
            System.out.println((liste_Ecrire.get(0).getID_Oeuvre()));
            System.out.println((liste_Ecrire.get(0).getID_Auteur()));
                    }

         */
        return liste_Ecrire;
    }

    public static ArrayList<Utilisateur> select_Utilisateur() {
        String sql = "SELECT ID_Utilisateur,Nom, Prenom, Mail, Nb_livre, ID_Catégorie FROM Utilisateur";
        ArrayList<Utilisateur> liste_Utilisateur = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Utilisateur utilisateur = new Utilisateur();

                utilisateur.setID_Utilisateur(rs.getInt("ID_Utilisateur"));
                utilisateur.setNom(rs.getString("Nom"));
                utilisateur.setPrenom(rs.getString("Prenom"));
                utilisateur.setNb_Livre(rs.getInt("Nb_livre"));
                utilisateur.setID_Catégorie(rs.getInt("ID_Catégorie"));
                liste_Utilisateur.add(utilisateur);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          //@Test.Test
     /*   finally {
            System.out.println((liste_Utilisateur));
            System.out.println((liste_Utilisateur.get(0).getID_Catégorie()));
            System.out.println((liste_Utilisateur.get(0).getNb_Livre()));
            System.out.println((liste_Utilisateur.get(0).getNom()));
            System.out.println((liste_Utilisateur.get(0).getPrenom()));
       }*/

   return liste_Utilisateur;
    }
    public static ArrayList<Emprunter> select_Emprunter() {
        String sql = "SELECT ID, ID_Utilisateur,ID_Oeuvre , Début, Fin FROM Emprunte";
        ArrayList<Emprunter> liste_Emprunter = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Emprunter emprunte = new Emprunter();

                emprunte.setID_Utilisateur(rs.getInt("ID_Utilisateur"));
                emprunte.setID_Oeuvre(rs.getInt("ID_Oeuvre"));
                emprunte.setDébut(rs.getString("Début"));
                emprunte.setFin(rs.getString("Fin"));
                emprunte.setID(rs.getInt("ID"));
                liste_Emprunter.add(emprunte);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //@Test.Test
     /*   finally {
            System.out.println((liste_Emprunter));
            System.out.println((liste_Emprunter.get(0).getID_Catégorie()));
            System.out.println((liste_Emprunter.get(0).getNb_Livre()));
            System.out.println((liste_Emprunter.get(0).getNom()));
            System.out.println((liste_Emprunter.get(0).getPrenom()));
       }*/

        return liste_Emprunter;
    }
    public static ArrayList<Interdiciton> select_Interdiction() {
        String sql = "SELECT ID_Interdiction, ID_Utilisateur, Début, Fin FROM Interdiction";
        ArrayList<Interdiciton> liste_Interdiction = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Interdiciton interdiction = new Interdiciton();

                interdiction.setID_Utilisateur(rs.getInt("ID_Utilisateur"));
                interdiction.setID_Interdiction(rs.getInt("ID_Interdiction"));
                interdiction.setDébut(rs.getString("Début"));
                interdiction.setFin(rs.getString("Fin"));


                liste_Interdiction.add(interdiction);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //@Test.Test
     /*   finally {
            System.out.println((liste_Utilisateur));
            System.out.println((liste_Utilisateur.get(0).getID_Catégorie()));
            System.out.println((liste_Utilisateur.get(0).getNb_Livre()));
            System.out.println((liste_Utilisateur.get(0).getNom()));
            System.out.println((liste_Utilisateur.get(0).getPrenom()));
       }*/

        return liste_Interdiction;
    }

    public static ArrayList<Categorie> select_Catégorie() {
        String sql = "SELECT ID_Catégorie, Nom, Max_Emprunte, Max_Durée FROM Catégorie";
        ArrayList<Categorie> liste_Catégorie = new ArrayList<>();
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Categorie categorie = new Categorie();

                categorie.setID_Catégorie(rs.getInt("ID_Catégorie"));
                categorie.setNom(rs.getString("Nom"));
                categorie.setMax_E(rs.getInt("Max_Emprunte"));
                categorie.setMax_D(rs.getInt("Max_Durée"));


                liste_Catégorie.add(categorie);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //@Test.Test
     /*   finally {
            System.out.println((liste_Utilisateur));
            System.out.println((liste_Utilisateur.get(0).getID_Catégorie()));
            System.out.println((liste_Utilisateur.get(0).getNb_Livre()));
            System.out.println((liste_Utilisateur.get(0).getNom()));
            System.out.println((liste_Utilisateur.get(0).getPrenom()));
       }*/

        return liste_Catégorie;
    }

}
