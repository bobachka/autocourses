package hw6.Task4;

public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private int price;

    public Car(String manufacturer, String model, int year, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Марка: '" + manufacturer + '\'' +
                ", Модель: '" + model + '\'' +
                ", Год выпуска: " + year +
                ", Цена: " + price;
    }
}
