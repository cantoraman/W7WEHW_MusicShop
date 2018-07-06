
import Instruments.DrumSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSetTest {

    DrumSet drumSet;


    @Before
    public void Setup(){
        drumSet = new DrumSet("Yamaha", "Loud", "Black", "DrumSound" ,500, 1000, 5);
    }


    @Test
    public void hasBrand(){
        assertEquals("Yamaha", drumSet.getBrand());
    }
    @Test
    public void hasType(){
        assertEquals("Loud", drumSet.getType());
    }
    @Test
    public void hasColor(){
        assertEquals("Black", drumSet.getColor());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500, drumSet.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1000, drumSet.getSellPrice(), 0);
    }

    @Test
    public void canChangeSellPrice(){
        drumSet.setSellPrice(300);
        assertEquals(300, drumSet.getSellPrice(), 0);

    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(500, drumSet.calculateMarkup(), 10);
    }

    @Test
    public void canPlaySound(){
        assertEquals("DrumSound", drumSet .playSound());
    }



    @Test
    public void hasValves(){
        assertEquals(5, drumSet.getDrumAmount());
    }



}
