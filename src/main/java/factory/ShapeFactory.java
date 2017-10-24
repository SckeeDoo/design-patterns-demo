package factory;

/**
 * Created by schiduvasile on 10/24/17.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {

        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();

            case "":
                return null;

        }

        return null;
    }

}
