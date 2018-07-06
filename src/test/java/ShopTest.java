import Instruments.DrumSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSet drumSet;

    @Before
    public void setup(){
        shop = new Shop("Ray's");
        drumSet = new DrumSet("Yamaha", "Loud", "Black", "DrumSound" ,500, 1000, 5);
    }

    @Test
    public void canAddItems(){
        shop.addItem(drumSet);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveItems(){
        shop.removeItem(drumSet);
        assertEquals(0, shop.getStockSize());
    }












}
