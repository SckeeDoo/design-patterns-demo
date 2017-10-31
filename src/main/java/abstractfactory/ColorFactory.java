package abstractfactory;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    public Color getColor(String color) {
        switch (color) {
            case  "RED" :
                return new Red();
            case  "BLUE" :
                return new Blue();
            case "GREEN" :
                return new Green();
            case "" :
                return null;
        }

        return null;
    }

}
