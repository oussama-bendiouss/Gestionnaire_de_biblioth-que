package Modele;
import Controleur.GestionBD_INSERT;


public class Categorie {
    int Max_E;
    int Max_D;
    int ID_Catégorie;
    String Nom;
    // @Constructeur
    public Categorie(String nom, int Max_E, int Max_D){
        this.Max_D= Max_D;
        this.Max_E = Max_E;
        this.Nom = nom;
        GestionBD_INSERT.insert_Catégorie(this.Max_E,this.Max_D, this.Nom);
    }

    // @Getter
    public String getNom(){
        return this.Nom;
    }
    public int getID_Catégorie(){
        return this.ID_Catégorie;
    }
    public int getMax_E(){
        return this.Max_E;
    }
    public int getMax_D(){
        return this.Max_D;
    }

    // @Setter
    public void setMax_E(int Max_E){
        this.Max_E = Max_E;

    }
    public void setMax_D(int Max_D){
        this.Max_D= Max_D;

    }
    public void setNom(String nom){
        this.Nom=nom;

    }







}
