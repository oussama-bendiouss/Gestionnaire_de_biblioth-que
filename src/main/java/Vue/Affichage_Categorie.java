package Vue;

import Modele.Categorie;
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

import static Controleur.GestionBD_SELECT.select_Catégorie;
import static Controleur.Remplir.loadTable_Catégorie;

public class Affichage_Categorie    {

    public void Create_Categorie_Scene(Stage primaryStage)  {

        VBox vbox = new VBox();

        HBox topControls = new HBox();
        VBox.setMargin( topControls, new Insets(10.0d) );
        topControls.setAlignment( Pos.BOTTOM_LEFT );
        TableView<Categorie> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setVgrow( tblCustomers, Priority.ALWAYS );

        TableColumn<Categorie, String> Nom = new TableColumn<>("Nom");
        Nom.setCellValueFactory(new PropertyValueFactory<>("Nom"));

        TableColumn<Categorie, String> M_E = new TableColumn<>("Max_E");
        M_E.setCellValueFactory(new PropertyValueFactory<>("Max_E"));

        TableColumn<Categorie, String> M_D = new TableColumn<>("Max_D");
        M_D.setCellValueFactory(new PropertyValueFactory<>("Max_D"));

        tblCustomers.getColumns().addAll( Nom, M_E, M_D );
        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
                Stage stage =new Stage();
                Create_Categorie_Scene(stage);
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
                new Ajout_Catégorie().Creat_Catégorie(stage_Auteur);
            }
        });
        bottomControls_Left.getChildren().add(btnAdd);

        Button btnClose = new Button("Close");
        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }});

        bottomControls.getChildren().addAll( bottomControls_Left, btnClose );

        vbox.getChildren().addAll(
                topControls,
                tblCustomers,
                sep,
                bottomControls
        );

        Scene scene = new Scene(vbox );

        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Les Catégories des utilisateurs");
        primaryStage.setOnShown( (evt) -> loadTable_Catégorie(tblCustomers) );
        primaryStage.show();
    }




}
