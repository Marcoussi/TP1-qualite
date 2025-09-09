package tp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tp1.Add;
import junit.framework.TestCase;

public class AddTest{

    @Test
    public void resultZero(){
        assertEquals(0, Add.add(0, 0));
    }
}