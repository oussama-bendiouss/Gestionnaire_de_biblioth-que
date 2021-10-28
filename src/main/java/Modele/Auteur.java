package Modele;
import Controleur.GestionBD_INSERT;


public class Auteur  {
     String nom;
     String prenom;
    int ID_Auteur;

// @Getter
    public String getNom() {
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public int getID_Auteur(){
        return this.ID_Auteur;
    }

// @Setter
    public void setID_Auteur(int ID_Auteur){
        this.ID_Auteur = ID_Auteur;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String  prenom){
        this.prenom= prenom;
    }

// @Constructeur
   public Auteur(){
   }
    public  Auteur(String n, String p){
        this.nom = n;
        this.prenom = p;
        GestionBD_INSERT.insert_Auteur(this.nom,this.prenom);
    }
// @Methode


}
