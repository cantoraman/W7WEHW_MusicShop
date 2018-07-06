public abstract class MusicInstrument {

    protected String brand;
    protected String type;
    protected String color;
    protected double buyPrice;
    protected double sellPrice;
    protected String sound;

    public MusicInstrument(String brand, String type, String color, String sound, double buyPrice, double sellPrice) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }


}
