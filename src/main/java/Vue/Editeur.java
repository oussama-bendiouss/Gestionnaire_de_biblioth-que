package Vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Editeur extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setSpacing(10);
        Button Afficher = new Button("Afficher");
        Afficher.setPrefSize(100,100);
        root.getChildren().add(Afficher);
        Scene editeur = new Scene(root,600,600);
        stage.setScene(editeur);
        stage.show();

    }
}
