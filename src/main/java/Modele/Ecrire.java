package Modele;
// @Constructeur
public class Ecrire {
     int ID_Auteur;
     int ID_Oeuvre;
    public Ecrire(int ID_Auteur, int ID_Oeuvre){
        this.ID_Auteur = ID_Auteur;
        this.ID_Oeuvre = ID_Oeuvre;
    }
// @Getter
    public int getID_Auteur() {
        return this.ID_Auteur;
    }
    public int getID_Oeuvre(){
        return this.ID_Oeuvre;
    }
// @Setter
    public void setID_Auteur(int ID_Auteur) {
        this.ID_Auteur = ID_Auteur;
    }
    public void setID_Oeuvre(int ID_Oeuvre){
        this.ID_Oeuvre=ID_Oeuvre;
    }
}