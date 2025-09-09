package tp1;

import org.junit.Test;

import tp1.Add;
import junit.framework.TestCase;

public class AddTest extends TestCase {

    @Test
    public void resultZero(){
        assertEquals(0, Add.add(0, 0));
    }
}