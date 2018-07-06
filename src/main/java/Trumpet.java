public class Trumpet extends MusicInstrument implements ISell{
    private int valves;

    public Trumpet(String brand, String type, String color, double buyPrice, double sellPrice, int valves) {
        super(brand, type, color, buyPrice, sellPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String getBrand() {
        return brand;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
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
}
