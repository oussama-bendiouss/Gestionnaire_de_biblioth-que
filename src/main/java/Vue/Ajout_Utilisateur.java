package Vue;

import Controleur.Ajouter;
import Test.Test;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ajout_Utilisateur {

   TextField nom = new TextField();
   TextField prenom = new TextField();
   TextField mail = new TextField();
   TextField nb_livre = new TextField();
   TextField id_catégorie = new TextField();


    public void Creat_Utilisateur(Stage stage)  {
        VBox vbox = new VBox();
        Label Nom = new Label("Nom de l'utilisateur");
        Label Prenom = new Label("Prenom de l'utilisateur");
        Label Mail = new Label("Mail de l'utilisateur");
        Label Nb_livre = new Label("Nombre de livre emprunté");
        Label Id_catégorie = new Label("Id de la catégorie");
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_RIGHT );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        HBox bottomControls_Left = new HBox();

        VBox.setMargin( bottomControls_Left, new Insets(10.0d) );
        Button btnAdd = new Button("Ajouter");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new Ajouter().Ajouter_Utilisateur(nom, prenom, mail, nb_livre,id_catégorie);
            }
        });
        bottomControls_Left.getChildren().add(btnAdd);
        Button btnClose = new Button("Close");
        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
        bottomControls.getChildren().addAll( bottomControls_Left, btnClose );
        bottomControls_Left.setAlignment(Pos.BOTTOM_LEFT );
        vbox.getChildren().addAll(Nom, nom, Prenom, prenom,Mail, mail,Id_catégorie,id_catégorie,Nb_livre, nb_livre,bottomControls
        );

        vbox.setSpacing( 10.0d );
        vbox.setPadding( new Insets(40.0d) );
        Scene ajout = new Scene(vbox,400,400);
        stage.setScene(ajout);
        stage.show();
    }
}
