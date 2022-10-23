public class Shop {
    private int id;
    private String shopName;
    private String cityName;

    public Shop(int id, String shopName, String cityName) {
        this.id = id;
        this.shopName = shopName;
        this.cityName = cityName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", shopName='" + getShopName() + "'" +
                ", cityName='" + getCityName() + "'" +
                "}";
    }
}
