public class Dog {
    private String name;
    private final static String rasa = "Pies";

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String param) {
        this.name = param;
    }

    public static String getRasa() {
        return rasa;
    }

    public String toString() {
        return "Pies: " + name + "rasa: " + rasa;
    }
}
