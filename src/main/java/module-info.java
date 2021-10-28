module Vue {
    requires javafx.controls;
    requires java.sql;
    // requires javafx.fxml;


    //opens com.example.demo1 to javafx.fxml;
    opens Vue;
    opens Modele;
}