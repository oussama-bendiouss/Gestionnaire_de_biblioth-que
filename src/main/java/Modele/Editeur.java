package Modele;
import Controleur.GestionBD;

public class Editeur {
    public String nom;


    public Editeur(String nom){
      this.nom = nom;
        Ajouter();
    }
    public  void Ajouter(){
        GestionBD.insert_Editeur(this.nom);

        
    }
}
