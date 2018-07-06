import Instruments.DrumSet;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    DrumSet drumSet;
    DrumStick drumStick;
    Guitar guitar;

    @Before
    public void setup(){
        shop = new Shop("Ray's");
        drumSet = new DrumSet("Yamaha", "Loud", "Black", "DrumSound" ,500, 1000, 5);
        drumStick = new DrumStick("Yamaha", 1, 2);
        guitar = new Guitar("Fender", "Electro", "Red", "GuitarSound", 1000, 2000, 6);
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

    @Test
    public void canAddRemoveMultipleItems(){
        shop.addItem(drumSet);
        shop.addItem(drumStick);
        shop.addItem(guitar);
        shop.removeItem(drumStick);
        assertEquals(2, shop.getStockSize());

    }











}
