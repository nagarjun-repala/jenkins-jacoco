package jacoco;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
     App obj = new App();


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testSum(){
        assertEquals(25, obj.add(20, 5));
    }
    @Test
    public void testMul(){
        assertEquals(30, obj.mul(6, 5));
    } 
}
