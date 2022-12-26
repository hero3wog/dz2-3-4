package lab;

public class Circle {
    private Point center;
    private double r;
    private String colour;

    public Circle(Point center, double r, String colour) {
        this.center = center;
        this.r = r;
        this.colour = colour;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                ", colour='" + colour + '\'' +
                '}';
    }
}
