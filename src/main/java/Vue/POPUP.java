package Vue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class POPUP {
    public void POPUP(String message) throws InterruptedException {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);

        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren().add(new Text(message));
        Scene dialogScene = new Scene(dialogVbox, 200, 50);
        dialog.setScene(dialogScene);
        dialog.show();
        dialog.wait(Long.parseLong("6000"));
        dialog.close();
    }
    public void erreur(Stage stage, String mot) throws InterruptedException {
        VBox v = new VBox();
        v.setSpacing(10);
        Label l = new Label(mot);
        l.setStyle("-fx-background-color:yellow");
        l.setPadding(new Insets(10,10,10,10));
        v.getChildren().add(l);
        Scene s = new Scene(v,150,45);
        stage.setScene(s);
        stage.setTitle(mot);
        stage.show();



    }
}
