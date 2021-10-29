package Vue;

import Controleur.Ajouter;
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

public class Ajout_Catégorie {

    TextField nom = new TextField();
    TextField max_empunte = new TextField();
    TextField max_durée = new TextField();

    public void Creat_Catégorie(Stage stage)  {
        VBox vbox = new VBox();
        Label Nom = new Label("Nom de la catégorie");
        Label Max_Emprunte = new Label("Le nombre maximale de livre à emprunter");
        Label Max_Durée = new Label("Durée maximale d'une emprunte");
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_RIGHT );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        HBox bottomControls_Left = new HBox();

        VBox.setMargin( bottomControls_Left, new Insets(10.0d) );
        Button btnAdd = new Button("Ajouter");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new Ajouter().Ajouter_Catégorie(nom,max_empunte,max_durée);
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
        vbox.getChildren().addAll(Nom,nom,Max_Emprunte,max_empunte, Max_Durée,max_durée,bottomControls
        );

        vbox.setSpacing( 10.0d );
        vbox.setPadding( new Insets(40.0d) );
        Scene ajout = new Scene(vbox,400,400);
        stage.setScene(ajout);
        stage.show();
    }
}
