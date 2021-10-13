package fr.poe;

public class Student extends Person {

    public Student() {
    }

    public void goToClass(){
        System.out.println("i'm going to class.");
    }

    public Student(int age) {
        super(age);
    }
 public void displayAge(){
     System.out.println("My age is "+ this.getAge() + " years old");
 }

}