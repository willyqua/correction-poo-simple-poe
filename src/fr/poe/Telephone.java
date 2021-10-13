package fr.poe;

public class Telephone {
    // 1 = attribut en premier
    String marque;
    String modele;
    String couleur;
    double prix;
    // 2 = constructeur
    // doivent etre déclarer du plus simple au plus complexe . le constructeur vide en premier
    public Telephone(){

    }
    // 3 =constructeur avec attributs. Comportement
    public Telephone(String marque, String modele, String couleur, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.prix = prix;
    }

    // 4 méthode avec attribut
public void envoyerMessage (String message){
    System.out.println(message);
}

public void appeler(String destinataire) {
    System.out.println("je suis en train d'appeler... "+destinataire);

}

// 5 méthode toString

    @Override
    public String toString() {
        return "Telephone{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prix=" + prix +
                '}';
    }
}
