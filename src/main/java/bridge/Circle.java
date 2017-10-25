package bridge;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class Circle extends Shape {

    private int radius, x, y;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }

}
