package Abstract;

//public abstract class demoabstract {
	
	abstract class Shape {
	    // Abstract method (no implementation)
	    abstract double area();

	    // Concrete method
	    void displayArea() {
	        System.out.println("Area: " + area());
	    }
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double area() {
	        return Math.PI * radius * radius;
	    }
	}

	class Rectangle extends Shape {
	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    double area() {
	        return width * height;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        circle.displayArea();

	        Rectangle rectangle = new Rectangle(4, 6);
	        rectangle.displayArea();
	    }
//	}
	
}