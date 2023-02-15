package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static Shape create(RegularShapeType type) {
		switch (type) {
			case Triangle:
				Shape triangle = new Triangle();
				return triangle;
			case Quadrilateral:
				Shape quadrilateral = new Quadrilateral();
				return quadrilateral;
			case Pentagon:
				Shape pentagon = new Pentagon();
				return pentagon;
			case Hexagon:
				Shape hexagon = new Hexagon();
				return hexagon;
			default:
				throw new IllegalArgumentException();
		}
	}
}