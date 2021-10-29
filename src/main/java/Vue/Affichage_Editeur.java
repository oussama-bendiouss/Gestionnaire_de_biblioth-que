package Vue;

import Controleur.GestionBD_SEARCH;
import Modele.Editeur;
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

import static Controleur.GestionBD_SELECT.select_Editeur;
import static Controleur.Remplir.loadTable_Editeur;
import static Controleur.Remplir.loadTable_Editeur_search;

public class Affichage_Editeur   {

    public void Create_Editeur_Scene(Stage primaryStage)  {

        VBox vbox = new VBox();

        HBox topControls = new HBox();
        VBox.setMargin( topControls, new Insets(10.0d) );
        topControls.setAlignment( Pos.BOTTOM_LEFT );
        TableView<Editeur> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setVgrow( tblCustomers, Priority.ALWAYS );

        TableColumn<Editeur, Integer> ID_E = new TableColumn<>("ID_Editor");
        ID_E.setCellValueFactory(new PropertyValueFactory<>("ID_Editor"));

        TableColumn<Editeur, String> Nom = new TableColumn<>("Nom");
        Nom.setCellValueFactory(new PropertyValueFactory<>("Nom"));



        tblCustomers.getColumns().addAll(  ID_E,Nom );
        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                primaryStage.close();
                Stage stage =new Stage();
                Create_Editeur_Scene(stage);
            }});
        HBox topControls_Left = new HBox();
        topControls_Left.setAlignment(Pos.BOTTOM_LEFT );
        VBox.setMargin( topControls_Left, new Insets(10.0d) );
        TextField search = new TextField("Entrer le nom de l'éditeur");
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
                primaryStage.setTitle("Les Editeurs");
                tblCustomers.getItems().clear();
                tblCustomers.refresh();
                primaryStage.setOnShown( (evt) -> loadTable_Editeur_search(tblCustomers,nom) );
                primaryStage.show();

            }
        });


        topRightControls.getChildren().addAll( signOutLink, topControls_Left );

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
                Stage stage_Editeur = new Stage();
                 new Ajout_Editeur().Creat_Editeur(stage_Editeur);
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
        primaryStage.setTitle("Les Editeurs");
        primaryStage.setOnShown( (evt) -> loadTable_Editeur(tblCustomers) );
        primaryStage.show();

    }




}
