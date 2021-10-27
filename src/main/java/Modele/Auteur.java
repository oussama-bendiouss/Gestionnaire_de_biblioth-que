package Modele;



public class Auteur {
    public String[] nom;
    public String[] prenom;
   public String[] pseudo;
   public String ID;


    public String[] getNom() {
        return this.nom;
    }
    public String[] getPrenom(){
        return this.prenom;
    }
    public String[] getPseudo(){
        return this.pseudo;
    }
    public String getID(){
        return this.ID;
    }

    public void setNom(String[] nom) {
        this.nom = nom;
    }
    public void setPrenom(String[] prenom){
        this.prenom= prenom;
    }
    public void setPseudo(String[] pseudo){
        this.pseudo= pseudo;
    }


    public  Auteur(String[] n, String[] p, String[] pseudo){
        this.nom = n;
        this.prenom = p;
        this.pseudo= pseudo;
        this.ID= n[0]+p[0]+pseudo;

    }



}
