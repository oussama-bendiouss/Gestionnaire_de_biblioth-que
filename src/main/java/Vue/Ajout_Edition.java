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

public class Ajout_Edition {

    TextField isbn = new TextField();
    TextField id_oeuvre = new TextField();
    TextField id_ed_editeur = new TextField();
    TextField année = new TextField();


    public void Creat_Edition(Stage stage)  {
        VBox vbox = new VBox();
        Label ISBN = new Label("Numéro ISBN");
        Label ID_Oeuvre = new Label("ID de l'oeuvre");
        Label ID_Editeur = new Label("ID de l'éditeur");
        Label Année = new Label("Année");
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_RIGHT );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        HBox bottomControls_Left = new HBox();

        VBox.setMargin( bottomControls_Left, new Insets(10.0d) );
        Button btnAdd = new Button("Ajouter");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new Ajouter().Ajouter_Edition(isbn,id_oeuvre,année,id_ed_editeur);
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
        vbox.getChildren().addAll(ISBN,isbn,ID_Oeuvre,id_oeuvre,ID_Editeur,id_ed_editeur,Année, année,bottomControls
        );

        vbox.setSpacing( 10.0d );
        vbox.setPadding( new Insets(40.0d) );
        Scene ajout = new Scene(vbox,400,400);
        stage.setScene(ajout);
        stage.show();
    }
}
