package singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;


/**
 * Created by schiduvasile on 11/8/17.
 */
public class SingleObjectTest {
    @Test
    public void testNotnull() {

        SingleObject object = SingleObject.getInstance();
        assertNotNull(object);

    }

}