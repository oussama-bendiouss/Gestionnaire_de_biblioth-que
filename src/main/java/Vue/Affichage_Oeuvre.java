package Vue;

import Modele.Edition;
import Modele.Oeuvre;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Controleur.GestionBD_SELECT;

import static Controleur.GestionBD_SELECT.select_Oeuvre;
import static Controleur.Remplir.*;

public class Affichage_Oeuvre    {

    public void Create_Oeuvre_Scene(Stage primaryStage)  {

        VBox vbox = new VBox();

        HBox topControls = new HBox();
        VBox.setMargin( topControls, new Insets(10.0d) );
        topControls.setAlignment( Pos.BOTTOM_LEFT );
        TableView<Oeuvre> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setVgrow( tblCustomers, Priority.ALWAYS );

        TableColumn<Oeuvre, String> Titre = new TableColumn<>("Titre");
        Titre.setCellValueFactory(new PropertyValueFactory<>("titre"));

        TableColumn<Oeuvre, Integer> ID_Oeuvre = new TableColumn<>("ID_Oeuvre");
        ID_Oeuvre.setCellValueFactory(new PropertyValueFactory<>("ID_Oeuvre"));
        TableColumn<Oeuvre, String> Description = new TableColumn<>("Description");
        Description.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn<Oeuvre, String> Année = new TableColumn<>("Année");
        Année.setCellValueFactory(new PropertyValueFactory<>("Année"));

        tblCustomers.getColumns().addAll(ID_Oeuvre, Titre, Description, Année );
        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
                Stage stage =new Stage();
                Create_Oeuvre_Scene(stage);
            }});

        HBox topControls_Left = new HBox();
        topControls_Left.setAlignment(Pos.BOTTOM_LEFT );
        VBox.setMargin( topControls_Left, new Insets(10.0d) );
        TextField search = new TextField("Entrer le titre de l'oeuvre");
        search.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                search.clear();
            }
        });
        topControls_Left.getChildren().add(search);
        HBox topRightControls = new HBox();
        HBox.setHgrow(topRightControls, Priority.ALWAYS );
        topRightControls.setAlignment( Pos.BOTTOM_RIGHT );
        Hyperlink signOutLink = new Hyperlink("Search");
        signOutLink.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String nom = search.getText();
                System.out.println(nom);
                Scene scene = primaryStage.getScene();
                primaryStage.close();
                primaryStage.setScene(scene);
                primaryStage.setWidth( 800 );
                primaryStage.setHeight( 600 );
                primaryStage.setTitle("Les oeuvres");
                tblCustomers.getItems().clear();
                tblCustomers.refresh();
                primaryStage.setOnShown( (evt) -> loadTable_Oeuvre_search(tblCustomers,nom) );
                primaryStage.show();

            }
        });
        topRightControls.getChildren().addAll( signOutLink,topControls_Left );

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
                new Ajout_Oeuvre().Creat_Oeuvre(stage_Auteur);
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
        primaryStage.setTitle("Les oeuvres");
        primaryStage.setOnShown( (evt) -> loadTable_Oeuvre(tblCustomers) );
        primaryStage.show();
    }




}
