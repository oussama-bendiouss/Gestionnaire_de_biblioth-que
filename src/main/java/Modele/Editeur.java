package Modele;
import Controleur.GestionBD;

public class Editeur {
    public String name;
    public String capacity;

    public Editeur(String name, String capacity){
        this.name = name;
        this.capacity = capacity;
        Ajouter();
    }
    public  void Ajouter(){
        GestionBD.insert(this.name, this.capacity);

        
    }
}
