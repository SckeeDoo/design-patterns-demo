package abstractfactory;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fillColor();

        Color color2 = colorFactory.getColor("BLUE");
        color2.fillColor();

        Color color3 = colorFactory.getColor("GREEN");
        color3.fillColor();
    }

}
