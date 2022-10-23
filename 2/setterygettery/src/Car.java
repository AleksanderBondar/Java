public class Car {
    private int id;
    private String brand;
    private String model;
    private int yearOfProduction;
    private double powerOfEngine;

    private ENUMFUEL fuel;

    private String productionCountry;

    private ENUMCOLOR color;

    private float price;

    public Car(int id, String brand, String model, int yearOfProduction, double powerOfEngine, ENUMFUEL fuel,
            String productionCountry, ENUMCOLOR color, float price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.powerOfEngine = powerOfEngine;
        this.fuel = fuel;
        this.productionCountry = productionCountry;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPowerOfEngine() {
        return this.powerOfEngine;
    }

    public void setPowerOfEngine(double powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }

    public ENUMFUEL getFuel() {
        return this.fuel;
    }

    public void setFuel(ENUMFUEL fuel) {
        this.fuel = fuel;
    }

    public String getProductionCountry() {
        return this.productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public ENUMCOLOR getColor() {
        return this.color;
    }

    public void setColor(ENUMCOLOR color) {
        this.color = color;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", brand='" + getBrand() + "'" +
                ", model='" + getModel() + "'" +
                ", yearOfProduction='" + getYearOfProduction() + "'" +
                ", powerOfEngine='" + getPowerOfEngine() + "'" +
                ", fuel='" + getFuel() + "'" +
                ", productionCountry='" + getProductionCountry() + "'" +
                ", color='" + getColor() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

}
