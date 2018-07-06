import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;


    @Before
    public void Setup(){
        trumpet = new Trumpet("Yamaha", "Brass", "Silver", 100, 200, 3);
    }


    @Test
    public void hasBrand(){
        assertEquals("Yamaha", trumpet.getBrand());
    }




    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValves());
    }



}
