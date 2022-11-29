package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Triangle triangle = new Triangle(10.0, 10.0);
        Circle circle = new Circle(5.0);

        output("------  Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area());

        output("------  Differenzen ------");
        output("Diff. r-t: " + areaDiff(rectangle, triangle));
        output("Diff. r-c: " + areaDiff(rectangle, circle));
        output("Diff. r-t: " + areaDiff(circle, triangle));
        output("Diff. t-c: " + areaDiff(rectangle, triangle));

    }


    private static double areaDiff(Shape s1, Shape s2) {
        return s1.area() - s2.area();         
    }

    // private static double areaDiff(Rectangle r, Circle c) {
    //     return r.area() - c.area();         
    // }

    // private static double areaDiff(Circle r, Triangle c) {
    //     return r.area() - c.area();         
    // }

    // private static double areaDiff(Triangle r, Triangle c) {
    //     return r.area() - c.area();         
    // }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

