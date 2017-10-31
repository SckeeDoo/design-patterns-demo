package abstractfactory;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "SHAPE" :
                return new ShapeFactory();
            case "COLOR" :
                return new ColorFactory();
            case "" :
                return null;
        }

        return null;
    }
}
