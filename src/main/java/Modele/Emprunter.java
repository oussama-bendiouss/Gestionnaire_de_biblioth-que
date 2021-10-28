package Modele;

import java.sql.Date;

public class Emprunter {
    int ID;
    Date Début;
    Date Fin;

    // @Constructeur
    public Emprunter(Date Début, Date Fin){
        this.Début = Début;
        this.Fin = Fin;
    }

    // @Getter
    public Date getDébut(){
        return this.Début;
    }
    public Date getFin(){
        return this.Fin;
    }
    public int getID(){
        return this.ID;
    }

    // @Setter
    public void setDébut(Date Début){
        this.Début = Début;
    }
    public void setFin(Date Fin){
        this.Fin = Fin;
    }
}
