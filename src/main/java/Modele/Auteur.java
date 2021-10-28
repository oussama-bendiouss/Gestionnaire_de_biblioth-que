package Modele;



public class Auteur {
     String nom;
     String prenom;
    int ID;

// @Getter
    public String getNom() {
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public int getID(){
        return this.ID;
    }

// @Setter
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String  prenom){
        this.prenom= prenom;
    }

// @Constructeur

    public  Auteur(String n, String p){
        this.nom = n;
        this.prenom = p;
    }



}
