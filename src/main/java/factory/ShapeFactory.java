package factory;

import static factory.Circle.getCircleInstance;
import static factory.Rectangle.getRectangleInstance;
import static factory.Square.getSquareInstance;

/**
 * Created by schiduvasile on 10/24/17.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {

        switch (shapeType) {
            case "CIRCLE":
                return getCircleInstance();
            case "SQUARE":
                return getSquareInstance();

            case "RECTANGLE":
                return getRectangleInstance();

            case "":
                return null;

        }

        return null;
    }

}
