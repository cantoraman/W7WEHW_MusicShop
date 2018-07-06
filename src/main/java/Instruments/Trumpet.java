package Instruments;


public class Trumpet extends MusicInstrument implements Interfaces.ISell, Interfaces.IPlay {
    private int valves;

    public Trumpet(String brand, String type, String color, String sound, double buyPrice, double sellPrice, int valves) {
        super(brand, type, color, sound, buyPrice, sellPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }


    @Override
    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public void setSellPrice(double newPrice) {
        sellPrice = newPrice;
    }

    @Override
    public double calculateMarkup() {
        return (sellPrice-buyPrice);
    }

    @Override
    public String playSound() {
        return sound;
    }
}
