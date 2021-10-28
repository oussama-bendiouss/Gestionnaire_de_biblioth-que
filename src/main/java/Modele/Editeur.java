package Modele;
import Controleur.GestionBD;

public class Editeur {
    String nom;
    int ID_Editeur;


    // @Constructeur
    public Editeur(String nom){
      this.nom = nom;
        Ajouter();
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

    public  void Ajouter(){
        GestionBD.insert_Editeur(this.nom);

        
    }
}
