package Modele;

import Controleur.GestionBD_INSERT;

public class Utilisateur {
    int ID_Utilisateur;    String Nom;
    String Prenom;
    String Mail;
    int Nb_Livre;
    int ID_Catégorie;


    // @Constructeur
    public Utilisateur(){

    }
    public Utilisateur(String nom, String prenom, String mail, int Nb_Livre, int ID_Catégorie){
        this.ID_Catégorie = ID_Catégorie;
        this.Nom =nom;
        this.Prenom= prenom;
        this.Mail= mail;
        this.Nb_Livre= Nb_Livre;
        GestionBD_INSERT.insert_Utilisateur(this.Nom, this.Prenom, this.Mail, this.ID_Catégorie, this.Nb_Livre);

    }

    // @Getter
    public int getID_Utilisateur() {
        return this.ID_Utilisateur;
    }
    public int getID_Catégorie(){
        return this.ID_Catégorie;
    }
    public int getNb_Livre(){
        return this.Nb_Livre;
    }
    public String getPrenom(){
        return this.Prenom;
    }
    public String getNom(){
        return this.Nom;
    }
    public String getMail(){
        return this.Mail;
    }

    // @Setter
    public void setID_Utilisateur(int ID_Utilisateur){
        this.ID_Utilisateur = ID_Utilisateur;
    }
    public void setPrenom(String prenom){
        this.Prenom = prenom;
    }
    public void setNom(String nom){
        this.Nom= nom;
    }
    public void setMail(String mail){
        this.Mail= mail;
    }
    public void setID_Catégorie(int ID_Catégorie){
        this.ID_Catégorie= ID_Catégorie;
    }
    public void setNb_Livre(int Nb_Livre){
        this.Nb_Livre = Nb_Livre;
    }
}
