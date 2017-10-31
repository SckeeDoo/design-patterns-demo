package bridge;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle with radius = " + radius + ", x = " + x + " and y = " + y);
    }


}
