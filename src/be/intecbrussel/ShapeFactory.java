package be.intecbrussel;

public class ShapeFactory {

    public Shape getShape(String shape){

        if (shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
