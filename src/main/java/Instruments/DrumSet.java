package Instruments;

public class DrumSet extends MusicInstrument implements Interfaces.ISell, Interfaces.IPlay{


        private int drumAmount;

        public DrumSet(String brand, String type, String color, String sound, double buyPrice, double sellPrice, int drumAmount) {
            super(brand, type, color, sound, buyPrice, sellPrice);
            this.drumAmount = drumAmount;
        }

        public int getDrumAmount() {
            return drumAmount;
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









