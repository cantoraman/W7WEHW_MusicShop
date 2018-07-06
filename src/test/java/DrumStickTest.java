import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {


    DrumStick drumsStick;

    @Before
    public void setup()
    {
        drumsStick = new DrumStick("Yamaha", 1, 2);
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", drumsStick.getBrand());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1, drumsStick.getBuyPrice(), 0);
    }

}
