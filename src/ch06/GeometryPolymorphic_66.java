package ch06;

/**
 * Chapter 06: Data Structures from "Clean Code" by Robert Martin. Listing 6.6.
 */
public class GeometryPolymorphic_66 {
  public static interface Shape {
    public double area();
  }

  public class Circle implements Shape {
    private Point_62 center;
    private double radius;
    public final double PI = 3.141592653589793;

    public Circle(Point_62 center, double radius) {
      this.center = center;
      this.radius = radius;
    }

    public double area() {
      return PI * radius * radius;
    }
  }

  public static class Rectangle implements Shape {

    private Point_62 topLeft;
    private double height;
    private double width;

    public Rectangle(Point_62 topLeft, double height, double width) {
      this.topLeft = topLeft;
      this.height = height;
      this.width = width;
    }

    @Override
    public double area() {
      return height * width;
    }

  }

  public static class Square extends Rectangle {

    public Square(Point_62 topLeft, double width) {
      super(topLeft, width, width);
    }

  }

}
