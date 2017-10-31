package factory;

/**
 * Created by schiduvasile on 10/24/17.
 */
public class Circle implements Shape{

    private static Circle circleInstance = new Circle();

    private Circle(){}

    @Override
    public void draw() {
        System.out.println("Drawing circle.");
    }

    public static Circle getCircleInstance() {
        return circleInstance;
    }

}
