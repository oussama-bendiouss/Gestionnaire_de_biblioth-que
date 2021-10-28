package Controleur;

import Modele.*;
import javafx.scene.control.TableView;

import static Controleur.GestionBD_SELECT.*;
import static Controleur.GestionBD_SELECT.select_Editeur;

public class Remplir {

    public static void loadTable_Auteur(TableView<Auteur> tblCustomers) {
        for (int i = 0; i < select_Auteur().size(); i++) {
            tblCustomers.getItems().add(select_Auteur().get(i));
        }

    }
    public static void loadTable_Catégorie(TableView<Categorie> tblCustomers) {
        for (int i = 0; i < select_Catégorie().size(); i++) {
            tblCustomers.getItems().add(select_Catégorie().get(i));
        }
    }
    public static void loadTable_Editeur(TableView<Editeur> tblCustomers) {
        for (int i = 0; i < select_Editeur().size(); i++) {
            tblCustomers.getItems().add(select_Editeur().get(i));
        }
    }
    public static void loadTable_Edition(TableView<Edition> tblCustomers) {
        for (int i = 0; i < select_Edition().size(); i++) {
            tblCustomers.getItems().add(select_Edition().get(i));
        }
    }

    public static void loadTable_Emprunte(TableView<Emprunter> tblCustomers) {
        for (int i = 0; i < select_Emprunter().size(); i++) {
            tblCustomers.getItems().add(select_Emprunter().get(i));
        }
    }
    public static void loadTable_Interdiction(TableView<Interdiciton> tblCustomers) {
        for (int i = 0; i < select_Interdiction().size(); i++) {
            tblCustomers.getItems().add(select_Interdiction().get(i));
        }
    }
    public static void loadTable_Oeuvre(TableView<Oeuvre> tblCustomers) {
        for (int i = 0; i < select_Oeuvre().size(); i++) {
            tblCustomers.getItems().add(select_Oeuvre().get(i));
        }
   }
    public static void loadTable_Utilisateur(TableView<Utilisateur> tblCustomers) {
        for (int i = 0; i < select_Utilisateur().size(); i++) {
            tblCustomers.getItems().add(select_Utilisateur().get(i));
        }
    }
}
