package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.*;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEquilatero;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEscaleno;
import uaslp.ingenieria.labs.shapes.triangles.TriangleIsoseles;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();

        shapes.add(new Shape());

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(8, 3));
        shapes.add(new Rectangle(14, 10));
        shapes.add(new Square(10));
        shapes.add(new TriangleEquilatero(6));
        shapes.add(new TriangleIsoseles(6,8));
        shapes.add(new TriangleEscaleno(6,8,10));

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("-----------------------------------------------");
        }


    }
}
