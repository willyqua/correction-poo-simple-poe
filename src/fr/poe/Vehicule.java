package fr.poe;

public class Vehicule {
    public String couleur;
    public String marque;
    public double prix;


    public Vehicule() { // constructeur
        System.out.println("passage par le constructeur vide");
        System.out.println(this+ "récupe l'instance de l'objet");
        this.marque = "Tesla"; // this fait référence à l'instance . ca marque, ca couleur, son prix.
        this.couleur = "rouge";
        this.prix = 10.99;

    }

public Vehicule(String marque, double prix){
    this.marque = marque;
    this.prix = prix;
}

public Vehicule (String marque, String couleur, double prix) {
    this(marque, prix); // utilise le constructeur parent chainage de constructeur.
    System.out.println("passage par le constructeur plein");
    this.couleur = couleur;

    }

    public void repeindre(String nouvelleCouleur) {
        this.couleur = nouvelleCouleur;
    }


    @Override
    public String toString() {
        return "Vehicule{" +
                "couleur='" + couleur + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }


}
