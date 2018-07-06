import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {


    Guitar guitar;

    @Before
    public void Setup() {

        guitar = new Guitar("Fender", "Electro", "Red", "GuitarSound", 1000, 2000, 6);
    }


    @Test
    public void hasBrand() {
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasType() {
        assertEquals("Electro", guitar.getType());
    }

    @Test
    public void hasColor() {
        assertEquals("Red", guitar.getColor());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1000, guitar.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2000, guitar.getSellPrice(), 0);
    }

    @Test
    public void canChangeSellPrice() {
        guitar.setSellPrice(300);
        assertEquals(300, guitar.getSellPrice(), 0);

    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1000, guitar.calculateMarkup(), 10);
    }

    @Test
    public void canPlaySound() {
        assertEquals("GuitarSound", guitar.playSound());
    }


    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }


}


