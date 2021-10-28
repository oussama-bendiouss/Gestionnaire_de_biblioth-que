package Modele;

import Controleur.GestionBD_INSERT;

public class Oeuvre {
    int ID_Oeuvre;
    String Titre;
    String Description;
    String Annee;

    // @Constructeur
    public Oeuvre(){

    }
    public Oeuvre(String Titre, String Description, String Annee){
        this.Titre = Titre;
        this.Description = Description;
        this.Annee = Annee;
        GestionBD_INSERT.insert_Oeuvre(this.Titre,this.Annee,this.Description);
    }

    // @Getter
    public int getID_Oeuvre(){
        return this.ID_Oeuvre;
    }
    public String getTitre(){
        return this.Titre;
    }
    public String getDescription(){
        return this.Description;
    }
    public String getAnnée(){
        return this.Annee;
    }

    // @Setter
    public void setAnnée(String année){
        this.Annee= année;
    }
    public void setTitre(String Titre){
        this.Titre = Titre;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
    public void setID_Oeuvre(int ID_Oeuvre){
        this.ID_Oeuvre = ID_Oeuvre;
    }
}
