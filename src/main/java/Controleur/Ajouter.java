package Controleur;

import Modele.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Ajouter {
    public void Ajouter_Editeur(TextField editeur){
        String nom_editeur =  editeur.getText();

        if(nom_editeur.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            new Editeur(nom_editeur);
            System.out.println("Good");
            editeur.clear();
        }

    }
    public void Ajouter_Auteur(TextField nom, TextField prenom){
        String nom_auteur=  nom.getText();
        String prenom_auteur = prenom.getText();

        if(nom_auteur.isEmpty() || prenom_auteur.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            new Auteur(nom_auteur, prenom_auteur);
            System.out.println("Good");
            nom.clear();
            prenom.clear();
        }

    }
    public void Ajouter_Catégorie(TextField nom, TextField max_emprunte, TextField max_durée) {
        String nom_catégorie=  nom.getText();
        String max_emprunte_v = max_emprunte.getText();
        String max_durée_v = max_durée.getText();

        if(nom_catégorie.isEmpty() || max_emprunte_v.isEmpty() || max_durée_v.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            int max_durée_v_i = Integer.parseInt(max_durée_v);
            int max_emprunt_v_i = Integer.parseInt(max_emprunte_v);
            new Categorie(nom_catégorie,max_emprunt_v_i,max_durée_v_i);
            System.out.println("Good");
            nom.clear();
            max_emprunte.clear();
            max_durée.clear();
        }

    }
    public void Ajouter_Edition(TextField isbn, TextField id_oeuvre, TextField année,TextField id_editeur) {
        String isbn_v=  isbn.getText();
       String id_oeuvre_v = id_oeuvre.getText();
       String id_editeur_v = id_editeur.getText();
       String année_v = année.getText();

        if(isbn_v.isEmpty()||id_editeur_v.isEmpty()||id_oeuvre_v.isEmpty()||année_v.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            int id_oeuvre_v_i = Integer.parseInt(id_oeuvre_v);
            int id_editeur_v_i = Integer.parseInt(id_editeur_v);
            int isbn_v_i = Integer.parseInt(isbn_v);
            new Edition(isbn_v_i,id_oeuvre_v_i,année_v,id_editeur_v_i);
            System.out.println("Good");
            isbn.clear();
            id_editeur.clear();
            id_oeuvre.clear();
            année.clear();
        }

    }
    public void Ajouter_Emprunte(TextField id_utilisateur, TextField id_oeuvre, TextField début,TextField fin) {
        String id_utilisateur_v=  id_utilisateur.getText();
        String id_oeuvre_v = id_oeuvre.getText();
        String début_v = début.getText();
        String fin_v = fin.getText();

        if(id_utilisateur_v.isEmpty()||id_oeuvre_v.isEmpty()||début_v.isEmpty()||fin_v.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            int id_oeuvre_v_i = Integer.parseInt(id_oeuvre_v);
            int id_utilisateur_v_i = Integer.parseInt(id_utilisateur_v);

            new Emprunter(id_utilisateur_v_i,id_oeuvre_v_i,début_v,fin_v);
            System.out.println("Good");
            id_utilisateur.clear();
            début.clear();
            id_oeuvre.clear();
            fin.clear();
        }

    }
    public void Ajouter_Interdiction(TextField id_utilisateur, TextField début, TextField fin){
        String id_utilisateur_v =  id_utilisateur.getText();
        String début_v = début.getText();
        String fin_v = fin.getText();
        if(id_utilisateur_v.isEmpty() || début_v.isEmpty()|| fin_v.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            int id_utilisateur_v_i = Integer.parseInt(id_utilisateur_v);
            new Interdiciton(id_utilisateur_v_i,début_v,fin_v);
            System.out.println("Good");
            id_utilisateur.clear();
            début.clear();
            fin.clear();
        }

    }
    public void Ajouter_Oeuvre(TextField titre, TextField description, TextField année){
        String titre_v=  titre.getText();
        String description_v = description.getText();
        String annéee_v = année.getText();

        if(titre_v.isEmpty() || annéee_v.isEmpty()|| description_v.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            new Oeuvre(titre_v,description_v,annéee_v);
            System.out.println("Good");
            titre.clear();
            description.clear();
            année.clear();
        }

    }
    public void Ajouter_Utilisateur(TextField nom, TextField prenom, TextField mail, TextField nb_livre, TextField id_catégorie) {
        String nom_v =  nom.getText();
        String prenom_v = prenom.getText();
        String mail_v = mail.getText();
        String nb_livre_v = nb_livre.getText();
        String id_catégorie_v = id_catégorie.getText();

        if(nom_v.isEmpty() || prenom_v.isEmpty() || mail_v.isEmpty()|| nb_livre_v.isEmpty()|| id_catégorie_v.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            int nb_livre_v_i = Integer.parseInt(nb_livre_v);
            int id_catégorie_v_i = Integer.parseInt(id_catégorie_v);
            new Utilisateur(nom_v,prenom_v,mail_v,nb_livre_v_i,id_catégorie_v_i);
            System.out.println("Good");
            nom.clear();
            prenom.clear();
            mail.clear();
            nb_livre.clear();
            id_catégorie.clear();
        }

    }
}
