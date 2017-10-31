package abstractfactory;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case  "CIRCLE" :
                return new Circle();
            case  "RECTANGLE" :
                return new Rectangle();
            case "SQUARE" :
                return new Square();
            case "" :
                return null;

        }

        return null;
    }

}
