package lesson002Basics;

public class Phone {
    private double price;
    private String manufacturer;

    public Phone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPriceAndManufacturer() {
        String priceAndManufacturer = "Manufacturer: " + manufacturer + ". Price of item: " + price + "$.";
        return priceAndManufacturer;
    }

    public static void main(String[] args) {
        Phone iPhone = new Phone ("iPhone");
        iPhone.setPrice(1300);
        System.out.println(iPhone.getPriceAndManufacturer());
    }
}
