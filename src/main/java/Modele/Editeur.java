package Modele;
import Controleur.GestionBD_INSERT;

public class Editeur {
    String nom;
    int ID_Editeur;


    // @Constructeur
    public Editeur(){
    }
    public Editeur(String nom){
      this.nom = nom;
        GestionBD_INSERT.insert_Editeur(this.nom);

    }
    // @Getter
    public int getID_Editeur(){
        return this.ID_Editeur;
    }
    public String getNom(){
        return this.nom;

    }

    // @Setter
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setID_Editeur(int ID_Editeur){
        this.ID_Editeur = ID_Editeur;
    }


}
