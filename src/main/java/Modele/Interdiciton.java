package Modele;

import java.sql.Date;

public class Interdiciton {
    int ID_Utilisateur;
    Date Début;
    Date Fin;

    // @Constructeur
    public Interdiciton(Date Début, Date Fin){
        this.Début = Début;
        this.Fin = Fin;
    }

    // @Setter
    public void setFin(Date Fin){
        this.Fin=Fin;
    }
    public void setDébut(Date Début){
        this.Début = Début;
    }

    // @Getter
    public int getID_Utilisateur(){
        return this.ID_Utilisateur;
    }
    public Date getDébut(){
        return this.Début;
    }
    public Date getFin(){
        return this.Fin;
    }
}
