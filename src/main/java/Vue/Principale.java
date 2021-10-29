package Vue;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principale {

    public void Vue_Principale(Stage stage)  {
      //  Scene auteur = new Affichage_Auteur_Test().CreateScene();
        //stage.setScene(auteur);
        //stage.show();

        // Box principale
        VBox root = new VBox();
        root.setSpacing(20);

        // ligne 1
        HBox espace1 = new HBox();
        espace1.setSpacing(10);
        espace1.setPadding(new Insets(30,10,0,30));
            // Boutton 1
        Button B_Auteur = new Button("Auteur");
        B_Auteur.setPrefSize(100,100);
        B_Auteur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Auteur = new Stage();
                new Affichage_Auteur().Create_Auteur_Scene(stage_Auteur);
            }
        });
            // Button 2
        Button B_Edition = new Button("Edition");
        B_Edition.setPrefSize(100,100);
        B_Edition.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Edition = new Stage();
                new Affichage_Edition().Create_Edition_Scene(stage_Edition);
            }
        });
            // Button 3
        Button B_Editeur = new Button("Editeur");
        B_Editeur.setPrefSize(100,100);
        B_Editeur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Editeur = new Stage();
                new Affichage_Editeur().Create_Editeur_Scene(stage_Editeur);
            }
        });
        espace1.getChildren().addAll(B_Auteur,B_Editeur,B_Edition);

        // ligne2
        HBox espace2 = new HBox();
        espace2.setPadding(new Insets(30,10,0,30));
        espace2.setSpacing(10);
            // Button 5
        Button B_Oeuvre = new Button("Oeuvre");
        B_Oeuvre.setPrefSize(100,100);
        B_Oeuvre.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Oeuvre = new Stage();
                new Affichage_Oeuvre().Create_Oeuvre_Scene(stage_Oeuvre);
            }
        });
            // Button 5
        Button B_Utilisateur = new Button("Utilisateur");
        B_Utilisateur.setPrefSize(100,100);
        B_Utilisateur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Utilisateur = new Stage();
                new Affichage_Utilisateur().Create_Utilisateur_Scene(stage_Utilisateur);
            }
        });
            // Button 6
        Button B_Emprunte = new Button("Emprunte");
        B_Emprunte.setPrefSize(100,100);
        B_Emprunte.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Emprunte = new Stage();
                new Affichage_Emprunter().Create_Emprunte_Scene(stage_Emprunte);
            }
        });
        espace2.getChildren().addAll(B_Oeuvre,B_Utilisateur,B_Emprunte);

        // lign3
        HBox espace3 = new HBox();
        espace3.setPadding(new Insets(30,10,0,30));
        espace3.setSpacing(10);
            // Button 7
        Button B_Catégorie = new Button("Catégorie");
        B_Catégorie.setPrefSize(100,100);
        B_Catégorie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Catégorie = new Stage();
                new Affichage_Categorie().Create_Categorie_Scene(stage_Catégorie);
            }
        });
            // Button 8
        Button B_Interdiction = new Button("Interdiction");
        B_Interdiction.setPrefSize(100,100);
        B_Interdiction.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Interdiction = new Stage();
                new Affichage_Interdiction().Create_Interdiction_Scene(stage_Interdiction);
            }
        });
            // Button 9
        Button B_Deconnecté = new Button("Déconnecté");
        B_Deconnecté.setPrefSize(100,100);
        B_Deconnecté.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
        espace3.getChildren().addAll(B_Catégorie,B_Interdiction,B_Deconnecté);

        // Box principale
        root.getChildren().addAll(espace1,espace2,espace3);
        Scene scenePrincipale = new Scene(root,400,450);
        stage.setTitle("Bienvenue au gestionnaire de la bibliothèque");
        stage.setScene(scenePrincipale);
        stage.show();
    }
}
