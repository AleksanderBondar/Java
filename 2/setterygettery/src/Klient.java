public class Klient {
    private Number id;
    private String firstName;
    private String secondName;
    private String cityName;

    public Klient(Number id, String firstName, String secondName, String cityName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.cityName = cityName;
    }

    public Number getId() {
        return this.id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
                ", firstName='" + getFirstName() + "'" +
                ", secondName='" + getSecondName() + "'" +
                ", cityName='" + getCityName() + "'" +
                "}";
    }

}
