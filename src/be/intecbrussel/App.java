package be.intecbrussel;

public class App {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Circle circle = new Circle();

        Shape shapeCircle = factory.getShape("Circle");
        Shape shapeRectangle = factory.getShape("Rectangle");
        Shape shapeSquare = factory.getShape("Square");

        circle.draw();

        shapeCircle.draw();
        shapeRectangle.draw();
        shapeSquare.draw();

    }
}
