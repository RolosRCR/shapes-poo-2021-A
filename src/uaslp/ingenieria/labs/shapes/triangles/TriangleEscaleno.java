package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleEscaleno extends Triangle {
    private int side1;
    private int side2;
    private int side3;
    private double s;
    private double e;

    public String getName() {
        return "Triangle Escaleno";
    }
    public TriangleEscaleno(int side1,int side2,int side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        s=(side1+side2+side3)/2;
    }
    public double getPerimeter(){
        return (side1+side2+side3);
        }
    public double getArea(){
        e= Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
        return e;
    }
}
