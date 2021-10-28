package Modele;
import Controleur.GestionBD_INSERT;

public class Editeur {
    String nom;
    int ID_Editor;


    // @Constructeur
    public Editeur(){
    }
    public Editeur(String nom){
      this.nom = nom;
        GestionBD_INSERT.insert_Editeur(this.nom);

    }
    // @Getter
    public int getID_Editor(){
        return this.ID_Editor;
    }
    public String getNom(){
        return this.nom;

    }

    // @Setter
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setID_Editor(int ID_Editor){
        this.ID_Editor = ID_Editor;
    }


}
