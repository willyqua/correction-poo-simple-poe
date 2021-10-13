package fr.poe;

public class Rectangle {
    // attributs
    int longueur;
    int largeur;


// constructeurs
    public Rectangle() {
    }

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;


    }
// methodes avec retour de valeur.

   public double surface(){
        double result = longueur * largeur;
        return result;
   }

    /*public void calculSurfaceRectangle ( int longueur, int hauteur){
        int surfaceRectangle = longueur * hauteur;
         System.out.println("La surface du rectangle est : "+surfaceRectangle);

    }*/

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", hauteur=" + largeur +
                '}';
    }
}
