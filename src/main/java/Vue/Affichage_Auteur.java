package Vue;

import Modele.Auteur;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static Controleur.GestionBD_SELECT.select_Auteur;
import static Controleur.Remplir.loadTable_Auteur;

import Controleur.Remplir;


public class Affichage_Auteur   {



    public void Create_Auteur_Scene(Stage stage) {

        VBox vbox = new VBox();

        HBox topControls = new HBox();
        VBox.setMargin( topControls, new Insets(10.0d) );
        topControls.setAlignment( Pos.BOTTOM_LEFT );
        TableView<Auteur> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setVgrow( tblCustomers, Priority.ALWAYS );

        TableColumn<Auteur, String> ID = new TableColumn<>("ID_Auteur");
        ID.setCellValueFactory(new PropertyValueFactory<>("ID_Auteur"));

        TableColumn<Auteur, String> Titre = new TableColumn<>("Nom");
        Titre.setCellValueFactory(new PropertyValueFactory<>("Nom"));

        TableColumn<Auteur, String> Description = new TableColumn<>("Prenom");
        Description.setCellValueFactory(new PropertyValueFactory<>("Prenom"));



        tblCustomers.getColumns().addAll( ID,Titre, Description );
        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
                Stage stage =new Stage();
                Create_Auteur_Scene(stage);
            }});

        HBox topRightControls = new HBox();
        HBox.setHgrow(topRightControls, Priority.ALWAYS );
        topRightControls.setAlignment( Pos.BOTTOM_RIGHT );
        Hyperlink signOutLink = new Hyperlink("Sign Out");

        topRightControls.getChildren().add( signOutLink );

        topControls.getChildren().addAll( btnRefresh, topRightControls );



        Separator sep = new Separator();


        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_RIGHT );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        HBox bottomControls_Left = new HBox();
        bottomControls_Left.setAlignment(Pos.BOTTOM_LEFT );
        VBox.setMargin( bottomControls_Left, new Insets(10.0d) );
        Button btnAdd = new Button("Ajouter");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage_Auteur = new Stage();
                new Ajout_Auteur().Creat_Auteur(stage_Auteur);
            }
        });
        bottomControls_Left.getChildren().add(btnAdd);

        Button btnClose = new Button("Close");
        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }});

        bottomControls.getChildren().addAll( bottomControls_Left, btnClose );

        vbox.getChildren().addAll(
                topControls,
                tblCustomers,
                sep,
                bottomControls
        );

        Scene scene_Auteur = new Scene(vbox );

        stage.setScene( scene_Auteur );
        stage.setWidth( 800 );
        stage.setHeight( 600 );
        stage.setTitle("Les auteurs");
        stage.setOnShown( (evt) -> loadTable_Auteur(tblCustomers) );
        stage.show();
//return scene_Auteur;
    }



}
