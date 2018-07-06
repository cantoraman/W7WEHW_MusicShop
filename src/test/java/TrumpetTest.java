
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;


    @Before
    public void Setup(){
        trumpet = new Trumpet("Yamaha", "Brass", "Silver", "TrumpetSound" ,100, 200, 3);
    }


    @Test
    public void hasBrand(){
        assertEquals("Yamaha", trumpet.getBrand());
    }
    @Test
    public void hasType(){
        assertEquals("Brass", trumpet.getType());
    }
    @Test
    public void hasColor(){
        assertEquals("Silver", trumpet.getColor());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100, trumpet.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200, trumpet.getSellPrice(), 0);
    }

    @Test
    public void canChangeSellPrice(){
        trumpet.setSellPrice(300);
        assertEquals(300, trumpet.getSellPrice(), 0);

    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, trumpet.calculateMarkup(), 10);
    }

    @Test
    public void canPlaySound(){
        assertEquals("TrumpetSound", trumpet.playSound());
    }



    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValves());
    }



}
