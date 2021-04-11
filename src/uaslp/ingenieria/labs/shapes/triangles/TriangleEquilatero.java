package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;
    private double s;

    public String getName() {
        return "Triangle Equilatero";
    }

    public TriangleEquilatero(int side) {
        this.side = side;
        s =(side+side+side)/2;
    }
    public double getPerimeter(){
        return 3*side;
    }
    public double getArea(){
        return  Math.sqrt(s*((s-side)*(s-side)*(s-side)));
    }
}
