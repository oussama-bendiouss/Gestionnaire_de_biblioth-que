package Vue;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Principale_Test extends Application {


    // private Parent createContent() {
    //   return new StackPane(new Text("Hello World"));


    @Override
    public void start(Stage stage) throws Exception {

        /*HBox rootG = new HBox();
        rootG.setSpacing(10);
        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(10,10,10,10));

        Button b1 = new Button("Oeuvre");

        b1.setPrefSize(100,60);
        root.getChildren().add(b1);
        Button b2 = new Button("Auteur");
        b2.setPrefSize(100,60);
        root.getChildren().add(b2);





        Button b3 = new Button("Edition");
        b3.setPrefSize(100,60);
        b3.setOnAction(new EventHandler<ActionEvent>() {
                           @Override
                           public void handle(ActionEvent actionEvent) {
                             //  stage.setScene();

                           }
                       });
                root.getChildren().add(b3);

        Button b4 = new Button("Editeur");
        b4.setPrefSize(100,60);
        root.getChildren().add(b4);
        Button b5 = new Button("Catégorie");
        b5.setPrefSize(100,60);
        root.getChildren().add(b5);
        Button b6 = new Button("Emprunte");
        b6.setPrefSize(100,60);
        root.getChildren().add(b6);
        Button b7 = new Button("Interdiction");
        b7.setPrefSize(100,60);
         root.getChildren().add(b7);





        VBox rootG1 = new VBox();
        rootG.setSpacing(10);

        rootG.getChildren().addAll(root);
        Scene s2 = new Scene(rootG,200,600);
        stage.setTitle("test3");
        Scene s = new Affichage_Auteur().getS();
        stage.setScene(s);


        stage.show();

         */
        /*Button b31 = new Button("ouvrir une nouvelle fenetre");
        b31.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Label  l = new Label("c'est dans la deuxième fenêtre");
                HBox d = new HBox();
                d.getChildren().add(l);
                Scene s3 = new Scene(d,200,100);
                Stage g = new Stage();
                g.setTitle("deuxième ");
                g.setScene(s3);
                g.show();
            }

        });
        Button b32 = new Button("fermer");
        b32.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
        HBox d3 = new HBox();
        d3.getChildren().addAll(b31,b32);
        Scene s4 = new Scene(d3,700,600);

        stage.setTitle("Premier");
        stage.setScene(s4);
        stage.show();
    }

    /*public static void main(String[] args) {
        launch(args);*/
/*
        VBox root4 = new VBox();
        root4.setSpacing(10);

        StackPane root41 = new StackPane();

        Label l4 = new Label("I'm a Label");
        l4.setStyle("-fx-background-color:yellow");
        l4.setPadding(new Insets(10,10,10,10));
        l4.setVisible(false);
        root41.getChildren().add(l4);


        Button b41 = new Button("i'am a button");
        b41.setStyle("-fx-background-color:cyan");
        b41.setPadding(new Insets(5,5,5,5));
        b41.setVisible(false);
        root41.getChildren().add(b41);
         Button b31 = new Button("ouvrir une nouvelle fenetre");
        b31.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               Label  l = new Label("c'est dans la deuxième fenêtre");
                HBox d = new HBox();
                d.getChildren().add(l);
                Scene s3 = new Scene(d,600,600);
                Stage g = new Stage();
                g.setTitle("deuxième ");
                g.setScene(s3);
                g.show();

                new Thread(){
                    @Override
                    public void run() {
                       launch(Affichage_Editeur.class);
                    }
                }.start();
                };



        });
        root41.getChildren().add(b31);
        CheckBox c41 = new CheckBox("I'am a check box");
        // c41.setOpacity(1);
        c41.setStyle("-fx-background-color:olive");
        l4.setPadding(new Insets(10,10,10,10));
        c41.setVisible(true);
        root41.getChildren().add(c41);

        Scene s411 = new Scene(root41,400,300);
        stage.setTitle("test");
        stage.setScene(s411);
        stage.show();*/


        /*VBox vbox = new VBox();

        GridPane gp = new GridPane();
        gp.setPadding( new Insets(10) );
        gp.setHgap( 4 );
        gp.setVgap( 8 );

        VBox.setVgrow(gp, Priority.ALWAYS );

        Label lblTitle = new Label("Support Ticket");

        Label lblEmail = new Label("Email");
        TextField tfEmail = new TextField();

        Label lblPriority = new Label("Priority");
        ObservableList<String> priorities =
                FXCollections.observableArrayList("Medium", "High", "Low");
        ComboBox<String> cbPriority = new ComboBox<>(priorities);

        Label lblProblem = new Label("Problem");
        TextField tfProblem = new TextField();

        Label lblDescription = new Label("Description");
        TextArea taDescription = new TextArea();

        gp.add( lblTitle,       1, 1);  // empty item at 0,0
        gp.add( lblEmail,       0, 2); gp.add(tfEmail,        1, 2);
        gp.add( lblPriority,    0, 3); gp.add( cbPriority,    1, 3);
        gp.add( lblProblem,     0, 4); gp.add( tfProblem,     1, 4);
        gp.add( lblDescription, 0, 5); gp.add( taDescription, 1, 5);

        Separator sep = new Separator(); // hr

        ButtonBar buttonBar = new ButtonBar();
        buttonBar.setPadding( new Insets(10) );

        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");

        buttonBar.setButtonData(saveButton, ButtonBar.ButtonData.OK_DONE);
        buttonBar.setButtonData(cancelButton, ButtonBar.ButtonData.CANCEL_CLOSE);

        buttonBar.getButtons().addAll(saveButton, cancelButton);

        vbox.getChildren().addAll( gp, sep, buttonBar );

        Scene scene = new Scene(vbox);

        stage.setTitle("Grid Pane App");
        stage.setScene(scene);
        stage.setWidth( 736 );
        stage.setHeight( 414  );
        stage.show();
*/

    }
}
