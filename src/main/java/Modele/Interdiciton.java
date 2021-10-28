package Modele;

import Controleur.GestionBD_INSERT;
public class Interdiciton {
    int ID_Interdiction;
    int ID_Utilisateur;
    String Début;
    String Fin;

    // @Constructeur
    public Interdiciton(int ID_Utilisateur,String Début, String Fin){
        this.Début = Début;
        this.Fin = Fin;
        this.ID_Utilisateur = ID_Utilisateur;
        GestionBD_INSERT.insert_Interdiction(this.ID_Utilisateur,this.Début,this.Fin);
    }

    // @Setter
    public void setFin(String Fin){
        this.Fin=Fin;

    }
    public void setDébut(String Début){
        this.Début = Début;

    }
    public void setID_Utilisateur(int ID_Utilisateur){
        this.ID_Utilisateur = ID_Utilisateur;

    }

    // @Getter
    public int getID_Utilisateur(){
        return this.ID_Utilisateur;
    }
    public String getDébut(){
        return this.Début;
    }
    public String getFin(){
        return this.Fin;
    }
    public int getID_Interdiction(){
        return this.ID_Interdiction;
    }
}
