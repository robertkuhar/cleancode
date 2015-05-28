package ch06;

/**
 * Chapter 06: Data Structures from "Clean Code" by Robert Martin. Listing 6.5.
 */
public class GeometryProcedural_65 {
  public class Square {
    public Point_62 topLeft;
    public double side;
  }

  public class Rectangle {
    public Point_62 topLeft;
    public double height;
    public double width;
  }

  public class Circle {
    public Point_62 center;
    public double radius;
  }

  public final double PI = 3.141592653589793;

  public double area(Object shape) throws NoSuchShapeException {
    if (shape instanceof Square) {
      Square s = (Square) shape;
      return s.side * s.side;
    } else if (shape instanceof Rectangle) {
      Rectangle r = (Rectangle) shape;
      return r.height * r.width;
    } else if (shape instanceof Circle) {
      Circle c = (Circle) shape;
      return PI * c.radius * c.radius;
    }
    throw new NoSuchShapeException();
  }

  public GeometryProcedural_65() {
  }

}
