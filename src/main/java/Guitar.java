public class Guitar extends MusicInstrument implements ISell, IPlay {


    private int stringCount;
    public Guitar(String brand, String type, String color, String sound, double buyPrice, double sellPrice, int stringCount) {
        super(brand, type, color, sound, buyPrice, sellPrice);

     this.stringCount = stringCount;

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

    public int getStrings() {
        return stringCount;
    }
}
