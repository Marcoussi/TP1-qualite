package tp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tp1.Sub;
import junit.framework.TestCase;

public class SubTest{

    @Test
    public void resultZero(){
        assertEquals(0, Sub.sub(0, 0));
    }
}