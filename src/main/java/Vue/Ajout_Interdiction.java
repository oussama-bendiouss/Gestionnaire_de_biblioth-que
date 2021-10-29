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

public class Ajout_Interdiction {

    TextField id_utilisateur = new TextField();
    TextField début = new TextField();
    TextField fin = new TextField();


    public void Creat_Interdiction(Stage stage)  {
        VBox vbox = new VBox();
       Label Id_utilisateur = new Label("ID de l'utilisateur");
       Label Début = new Label("Début de l'interdiction");
       Label Fin = new Label("Fin de l'interdiction");
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_RIGHT );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        HBox bottomControls_Left = new HBox();

        VBox.setMargin( bottomControls_Left, new Insets(10.0d) );
        Button btnAdd = new Button("Ajouter");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new Ajouter().Ajouter_Interdiction(id_utilisateur,début,fin);
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
        vbox.getChildren().addAll(Id_utilisateur,id_utilisateur,Début,début,Fin,fin,bottomControls
        );

        vbox.setSpacing( 10.0d );
        vbox.setPadding( new Insets(40.0d) );
        Scene ajout = new Scene(vbox,400,400);
        stage.setScene(ajout);
        stage.show();
    }
}
