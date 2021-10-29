package Controleur;

import Modele.Admin;
import Vue.POPUP;
import Vue.Principale;
import javafx.stage.Stage;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.*;

import static Controleur.ConnectionBD.connect;

public class Authentification_Algo {
    String password_bd_hash;
    public String Authentifié(Admin admin) throws SQLException, InterruptedException {
        String nom = admin.getUser();
        String password = admin.getPassword();
        String password_hash = sha256(password);

        String sql = "SELECT password FROM Auth WHERE user = ? ";
        Connection conn = connect("Auth.db");
        PreparedStatement prstmt = conn.prepareStatement(sql);
        prstmt.setString(1,nom);


        ResultSet rs    = prstmt.executeQuery();
        while(rs.next()){
            password_bd_hash = rs.getString("password");

        }
        password_hash = password_hash.intern();
        password_bd_hash = password_bd_hash.intern();

        if ( password_bd_hash== password_hash){
            Stage stage_connexion = new Stage();
            new POPUP().erreur(stage_connexion,"Connexion établie");
            Stage principale = new Stage();
            new Principale().Vue_Principale(principale);
            return "ISADMIN";
        }else{
            Stage stage_connexion = new Stage();
            new POPUP().erreur(stage_connexion,"Mot de passe incorrect");
            return "ISNOTADMIN";
        }

    }


    public  String sha256(String base) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }


}
