package by.stqa.pft.sandox;

public class MyFirstProgram {

    public static void main(String[] args) {
        project("project");
        project("project House");
        project("project Home");

        double a = 4;
        double b = 6;
        System.out.println("Площадь со сторонами " + a +  " и " + b + " = " + area(a, b));

        double l = 5;
            System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    }
    public static void project(String somebody) {
           System.out.println("My new " + somebody + "!");

    }
    public static double area(double len){
        return len*len;
    }

    public static double area(double a, double b){
        return a * b;
    }

 }