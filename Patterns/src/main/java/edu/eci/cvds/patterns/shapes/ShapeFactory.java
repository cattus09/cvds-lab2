package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(RegularShapeType args) {
        Shape fig = null;
        switch (args) {
            case Triangle:
                fig = new Triangle();
                break;
            case Quadrilateral:
                fig = new Quadrilateral();
                break;
            case Pentagon:
                fig = new Pentagon();
                break;
            case Hexagon:
                fig = new Hexagon();
                break;
        }
        return fig;
    }
}