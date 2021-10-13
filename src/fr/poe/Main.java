package fr.poe;

public class Main {
    public static void main(String[] args) {
       /* Vehicule v1 = new Vehicule();
        System.out.println(v1);
        Vehicule v2 = new Vehicule("renault","verte",17.99);
        System.out.println(v2);
        Vehicule v3 = new Vehicule("peugeot",22.99);
        v3.repeindre("jaune");
        System.out.println(v3);*/
        //ystem.out.println(v1.toString());
       // v1.marque = "Tesla";
       // v1.couleur = "Rouge";
        //v1.prix = 10.99;
       // v1.repeindre("blanche");
        //System.out.println(v1);
        //System.out.println(v1.couleur);
       /* Telephone t1= new Telephone();
        Telephone t2 = new Telephone("samsung","s21", "noir",899.99);
        System.out.println(t2);


        // exo rectangle
        Rectangle r1= new Rectangle();
        r1.longueur = 10;
        r1.largeur = 10;
        double surfaceR1 = r1.surface();
        System.out.println(surfaceR1);

       ////////////////////////////////////////////////////////
        // exo Somme
        Somme numbers = new Somme(5,5);
        System.out.println("la somme des nombres est : " + numbers.sum());
        ///////////////////////////////////////////////////////
        // exo Student
       */
        Etudiant result = new Etudiant();
        result.askName();
        result.calcMoyenne();
        ////////////////////////////////////////////////////
        // exo Complex
        Complex finalResult = new Complex();
        Complex c1 = new Complex( 1,5,1,5);
        c1.sum();
        ///////////////////////////////////////////////////////
       // exo Point
        /*Point p1 = new Point(5,6);
        Point p2 = new Point(3,2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));*/

    }
}
