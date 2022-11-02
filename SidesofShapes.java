abstract class Shapes {
    public abstract void numberOfSides();
}

class Rectangle extends SidesofShapes {
    public void numberOfSides() {
        System.out.println("4");
    }
}

class Triangle extends Rectangle {
    public void numberOfSides() {
        System.out.println("3");
    }
}

class Hexagon extends SidesofShapes {
    public void numberOfSides() {
        System.out.println("6");
    }
}

public class SidesofShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();
        System.out.println("Rectangle");
        rectangle.numberOfSides();
        System.out.println("Triangle");
        triangle.numberOfSides();
        System.out.println("Hexagon");
        hexagon.numberOfSides();
    }
}