package fr.poe;

//import java.util.List;
import java.util.Scanner;

public class Etudiant {
    String name;
    double note1, note2;
    //int[] notes;
    int age;


    public Etudiant() {
    }

    public Etudiant(int age) {
        this.age = age;
    }

    public Etudiant(String name, double note1, double note2) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;

    }

    public void askName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:  ");
        this.name = sc.next();

    }


    public double calcMoyenne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        this.note1 = sc.nextDouble();

        System.out.print("Enter the number 2: ");
        this.note2 = sc.nextDouble();

        double resultMoyenne = (this.note1 + this.note2) /2;
        System.out.println("la moyenne de "+ this.name +" est : "+resultMoyenne );
        return resultMoyenne;
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "moyenne" + this.calcMoyenne() + '\''+
                '}';
    }
}



// parametre new Student ( "toto" , 12,15,18)

/*  public Student(String name, int... notes){
        this.name = name;
        this.notes = notes;
        }

    public double calculerMoyenne(){
        double result=0;
        for (double note: this.notes) {
            result += note;
            return  note;
        }
    result/= this.notes.length;
        return result;
    }*/