package factory;

import static junit.framework.TestCase.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import sun.security.provider.SHA;

import static org.junit.Assert.*;

/**
 * Created by schiduvasile on 11/8/17.
 */

public class ShapeFactoryTest {

    private ShapeFactory shapeFactory = new ShapeFactory();

    @Before
    @Test
    public void prepareFactory() throws Exception {

        ShapeFactory shapeFactory = new ShapeFactory();
        Assert.assertNotNull(shapeFactory);

    }

    @Test
    public void shouldNotGetNull() throws Exception {

        Shape circle = shapeFactory.getShape("CIRCLE");
        Assert.assertNotNull(circle);

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Assert.assertNotNull(rectangle);

        Shape square = shapeFactory.getShape("SQUARE");
        Assert.assertNotNull(square);

    }

    @Test
    public void shouldGetAllShapes() throws Exception {

        Shape circle = shapeFactory.getShape("CIRCLE");
        Assert.assertTrue(circle instanceof Shape);

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Assert.assertNotNull(rectangle instanceof Shape);

        Shape square = shapeFactory.getShape("SQUARE");
        Assert.assertNotNull(rectangle instanceof Shape);
    }





}
