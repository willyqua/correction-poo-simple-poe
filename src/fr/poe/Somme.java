package fr.poe;

public class Somme {
    double number1, number2;

    public Somme() {
    }

    public Somme(double number1, double number2) {
        this.number1 = number1; // assignation valeur.
        this.number2 = number2;
    }

    public double sum() {

        double sumNumbers = this.number1 + this.number2;
        return sumNumbers;

    }

    @Override
    public String toString() {
        return "Somme{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
