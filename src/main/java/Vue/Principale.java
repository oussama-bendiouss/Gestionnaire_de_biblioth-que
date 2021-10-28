package Vue;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principale extends Application {
    @Override
    public void start(Stage stage) throws Exception {
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
        Button B_Auteur = new Button("Auteur");
        B_Auteur.setPrefSize(100,100);
        Button B_Edition = new Button("Edition");
        B_Edition.setPrefSize(100,100);
        Button B_Editeur = new Button("Editeur");
        B_Editeur.setPrefSize(100,100);
        espace1.getChildren().addAll(B_Auteur,B_Editeur,B_Edition);

        // ligne2
        HBox espace2 = new HBox();
        espace2.setPadding(new Insets(30,10,0,30));
        espace2.setSpacing(10);
        Button B_Oeuvre = new Button("Oeuvre");
        B_Oeuvre.setPrefSize(100,100);
        Button B_Utilisateur = new Button("Utilisateur");
        B_Utilisateur.setPrefSize(100,100);
        Button B_Emprunte = new Button("Emprunte");
        B_Emprunte.setPrefSize(100,100);
        espace2.getChildren().addAll(B_Oeuvre,B_Utilisateur,B_Emprunte);

        // lign3
        HBox espace3 = new HBox();
        espace3.setPadding(new Insets(30,10,0,30));
        espace3.setSpacing(10);
        Button B_Catégorie = new Button("Catégorie");
        B_Catégorie.setPrefSize(100,100);
        Button B_Interdiction = new Button("Interdiction");
        B_Interdiction.setPrefSize(100,100);
        Button B_Deconnecté = new Button("Déconnecté");
        B_Deconnecté.setPrefSize(100,100);
        espace3.getChildren().addAll(B_Catégorie,B_Interdiction,B_Deconnecté);

        // Box principale
        root.getChildren().addAll(espace1,espace2,espace3);
        Scene scenePrincipale = new Scene(root,400,450);
        stage.setTitle("Bienvenue au gestionnaire de la bibliothèque");
        stage.setScene(scenePrincipale);
        stage.show();
    }
}
