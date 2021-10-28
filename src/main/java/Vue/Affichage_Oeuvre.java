package Vue;

import Modele.Oeuvre;
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
import Controleur.GestionBD_SELECT;

import static Controleur.GestionBD_SELECT.select_Oeuvre;
import static Controleur.Remplir.loadTable_Oeuvre;

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

        TableColumn<Oeuvre, String> Description = new TableColumn<>("Description");
        Description.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn<Oeuvre, String> Année = new TableColumn<>("Année");
        Année.setCellValueFactory(new PropertyValueFactory<>("Année"));

        tblCustomers.getColumns().addAll( Titre, Description, Année );
        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setOnShown( (evt) -> loadTable_Oeuvre(tblCustomers) );
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

        Button btnClose = new Button("Close");
        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }});

        bottomControls.getChildren().add( btnClose );

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
