public interface ISell {
    double getBuyPrice();
    double getSellPrice();
    void setSellPrice(double newPrice);
    double calculateMarkup();
}
