package thkoeln.st.basics.exercise;

public class _05_Classes {

    /* Create a new class called "Circle" in a new file in the package "exercise".
     *
     * The class contains:
     * Two private instance variables: radius (of the type double) and color (of the type String), with default value of 1.0 and "red", respectively.
     * Two overloaded constructors - a default constructor with no argument, and a constructor which takes arguments for radius and color.
     * Three public methods: getRadius(), getColor() and getArea(), which return the radius, the color and area of this instance, respectively.
     *
     * Source: https://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
     */

    public  class Circle {

        public double radius = 1.0;
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
}

