package Modele;

import Controleur.GestionBD_INSERT;
public class Edition {
    int ISBN;
    int ID_Oeuvre;
    String Année;
    int ID_Editeur;

    // @Constructeur
    public Edition(){

    }
    public Edition(int ISBN, int ID_Oeuvre, String Année, int ID_Editeur){
        this.ISBN = ISBN;
        this.ID_Oeuvre = ID_Oeuvre;
        this.Année = Année;
        this.ID_Editeur = ID_Editeur;
        GestionBD_INSERT.insert_Edition(this.ISBN,this.ID_Oeuvre,this.Année,this.ID_Editeur);

    }

    // @Setter
    public void setID_Oeuvre(int ID_Oeuvre){
        this.ID_Oeuvre = ID_Oeuvre;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public void setAnnée(String année){
        this.Année = année;
    }
    public void setID_Editeur( int ID_Editeur){
        this.ID_Editeur = ID_Editeur;
    }


    // @Getter
    public int getID_Editeur(){
        return this.ID_Editeur;
    }
    public int getID_Oeuvre(){
        return this.ID_Oeuvre;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public String getAnnée(){
        return this.Année;
    }
}
