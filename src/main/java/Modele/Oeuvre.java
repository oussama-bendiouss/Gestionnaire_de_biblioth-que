package Modele;

import java.sql.Date;

public class Oeuvre {
    int ID_Oeuvre;
    String Titre;
    String Description;
    Date Année;

    // @Constructeur
    public Oeuvre(String Titre, String Description, Date Année){
        this.Titre = Titre;
        this.Description = Description;
        this.Année = Année;
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
    public Date getAnnée(){
        return this.Année;
    }

    // @Setter
    public void setAnnée(Date année){
        this.Année= année;
    }
    public void setTitre(String Titre){
        this.Titre = Titre;
    }
    public void setDescription(String Description){
        this.Description = Description;
    }
}
