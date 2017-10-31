package factory;

/**
 * Created by schiduvasile on 10/24/17.
 */
public class Rectangle implements Shape {


    private static Rectangle rectangleInstance = new Rectangle();

    private Rectangle(){}

    @Override
    public void draw() {
        System.out.println("Drawing rectangle.");
    }

    public static Rectangle getRectangleInstance() {
        return rectangleInstance;
    }

}
