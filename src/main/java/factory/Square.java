package factory;

/**
 * Created by schiduvasile on 10/24/17.
 */
public class Square implements Shape {


    private static Square squareInstance = new Square();

    private Square(){}

    @Override
    public void draw() {
        System.out.println("Drawing square.");
    }

    public static Square getSquareInstance(){
        return squareInstance;
    }

}
