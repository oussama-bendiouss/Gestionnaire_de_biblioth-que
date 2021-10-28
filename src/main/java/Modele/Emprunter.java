package Modele;

import Controleur.GestionBD_INSERT;

public class Emprunter {
    int ID;
    int ID_Utilisateur;
    int ID_Oeuvre;
    String Début;
    String Fin;

    // @Constructeur
    public Emprunter(int ID_Utilisateur, int ID_Oeuvre,String Début, String Fin){
        this.Début = Début;
        this.Fin = Fin;
        this.ID_Oeuvre = ID_Oeuvre;
        this.ID_Utilisateur = ID_Utilisateur;
        GestionBD_INSERT.insert_Emprunte(this.ID_Oeuvre, this.ID_Utilisateur, this.Début, this.Fin);
    }

    // @Getter
    public String getDébut(){
        return this.Début;
    }
    public String getFin(){
        return this.Fin;
    }
    public int getID_Oeuvre(){
        return this.ID_Oeuvre;
    }
    public int getID_Utilisateur(){
        return this.ID_Utilisateur;
    }
    public int getID(){
        return this.ID;
    }

    // @Setter
    public void setDébut(String Début){
        this.Début = Début;

    }
    public void setFin(String Fin){
        this.Fin = Fin;

    }
    public void setID_Oeuvre(int ID_Oeuvre){
        this.ID_Oeuvre = ID_Oeuvre;

    }
    public void setID_Utilisateur(int ID_Utilisateur){
        this.ID_Utilisateur = ID_Utilisateur;
         }
}
