package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class TriangleIsoseles extends Triangle {
    private int side;
    private int equalSide;
    private double s;

    public String getName() {
        return "Triangle Isoseles";
    }
    public TriangleIsoseles(int side,int equalSide){
        this.equalSide=equalSide;
        this.side=side;
        s=(side+equalSide+equalSide)/2;
    }
    public double getPerimeter(){
        return side+2*equalSide;}
    public double getArea(){
        return  Math.sqrt(s*((s-side)*(s-equalSide)*(s-equalSide)));
    }
}
