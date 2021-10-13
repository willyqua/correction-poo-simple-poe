package fr.poe;

public class Complex {
    double realPart1, imaginaryPart1, realPart2, imaginaryPart2;


    public Complex() {
    }

    ;

    public Complex(double realPart1, double imaginaryPart1, double realPart2, double imaginaryPart2) {
        this.realPart1 = realPart1;
        this.imaginaryPart1 = imaginaryPart1;
        this.realPart2 = realPart2;
        this.imaginaryPart2 = imaginaryPart2;

    }


    public void sum() {
        System.out.println((this.realPart1 + this.realPart2) +
                " + " +
                (this.imaginaryPart1 + this.imaginaryPart2) + "i");
    }


}
