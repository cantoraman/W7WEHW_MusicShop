import Instruments.DrumSet;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;



    public Shop(String name) {

        this.name = name;
        stock = new ArrayList<>();
    }


    public void addItem(ISell item) {
        stock.add(item);
    }
    public int getStockSize(){
        return stock.size();
    }

    public void removeItem(ISell item) {
        stock.remove(item);
    }
}
