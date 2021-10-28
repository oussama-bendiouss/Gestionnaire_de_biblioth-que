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

import static Controleur.GestionBD_SELECT.select_Oeuvre;

public class Utilisateur extends Application   {
    @Override
    public void start(Stage primaryStage) throws Exception {

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
                primaryStage.setOnShown( (evt) -> loadTable(tblCustomers) );
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
        primaryStage.setOnShown( (evt) -> loadTable(tblCustomers) );
        primaryStage.show();
    }



   private void loadTable(TableView<Oeuvre> tblCustomers) {
       for (int i = 0; i < select_Oeuvre().size(); i++) {
           tblCustomers.getItems().add(select_Oeuvre().get(i));
       }

       // tblCustomers.getItems().add(new Oeuvre("Hola", "Washington fff","2020-10-21"));
        //tblCustomers.getItems().add(new Oeuvre("Abe", "Lincoln", " 2021-1-02"));
        //tblCustomers.getItems().add(new Oeuvre("Thomas", "Jefferson il est une fois", "2018-05-06"));
    }
}
