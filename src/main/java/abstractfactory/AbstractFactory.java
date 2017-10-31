package abstractfactory;

/**
 * Created by schiduvasile on 10/25/17.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
