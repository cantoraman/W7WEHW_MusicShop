public class Guitar extends MusicInstrument implements ISell, IPlay {


    private int stringCount;
    public Guitar(String brand, String type, String color, String sound, double buyPrice, double sellPrice, int stringCount) {
        super(brand, type, color, sound, buyPrice, sellPrice);

     this.stringCount = stringCount;

    }

    @Override
    public String playSound() {
        return null;
    }

    @Override
    public double getBuyPrice() {
        return 0;
    }

    @Override
    public double getSellPrice() {
        return 0;
    }

    @Override
    public void setSellPrice(double newPrice) {

    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
