package thkoeln.st.basics.exercise;

public class Circle { public double radius = 1.0;
    String color = "red";

    // public Circle() {
    // }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    public double getRadius() {
        return radius;
    }

    public String Color() {

        return color;
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }


}
