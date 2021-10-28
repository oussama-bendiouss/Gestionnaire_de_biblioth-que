package Modele;



public class Categorie {
    int Max_E;
    int Max_D;
    int ID_Catégorie;
    // @Constructeur
    public Categorie(int Max_E, int Max_D){
        this.Max_D= Max_D;
        this.Max_E = Max_E;
    }

    // @Getter
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







}
