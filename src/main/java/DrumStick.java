import Interfaces.ISell;

public class DrumStick implements ISell {

    private double buyPrice;
    private double sellPrice;
    private String brand;



    public DrumStick(String brand, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.buyPrice=buyPrice;
        this.sellPrice = sellPrice;
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
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return (sellPrice-buyPrice);
    }

    public String getBrand() {
        return brand;
    }
}
