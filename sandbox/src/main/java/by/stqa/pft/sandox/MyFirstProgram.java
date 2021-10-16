package by.stqa.pft.sandox;

public class MyFirstProgram {

    public static void main(String[] args) {
        project("project");
        project("project House");
        project("project Home");

        Rectangle r = new Rectangle(4, 6);

        System.out.println("Площадь со сторонами " + r.a +  " и " + r.b + " = " + r.area());

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


        Point p = new Point(2, 2);
        Point p2 = new Point(9, 9);
        System.out.println("Расстояние между двумя точками " +  p.distance(p2));

    }
    public static void project(String somebody) {
          System.out.println("My new " + somebody + "!");
    }
    }


