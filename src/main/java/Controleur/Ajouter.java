package Controleur;

import Modele.Editeur;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Ajouter {
    public void Ajouter_Editeur(TextField editeur){
        String nom_editeur =  editeur.getText();

        if(nom_editeur.isEmpty()){
            System.out.println("Il est vide");
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL);

            VBox dialogVbox = new VBox(20);
            dialogVbox.getChildren().add(new Text("   C'est vide entre quelque chose"));
            Scene dialogScene = new Scene(dialogVbox, 200, 50);
            dialog.setScene(dialogScene);
            dialog.show();
        }else{
            new Editeur(nom_editeur);
            System.out.println("Good");
            editeur.clear();
        }

    }
}
