
public class App {

    public static void main(String[] args) {
        Dog dog = new Dog("Albert");
        Klient client = new Klient(10, "Jan", "Kowalski", "Białystok");
        Car car = new Car(10, "Fiat", "126p", 1998, 95.6, ENUMFUEL.PB_95, "Polska", ENUMCOLOR.BLACK, 999);
        Worker pracownik = new Worker(10, "Paweł", "Kowalski", "Warszawa");
        Shop sklep = new Shop(99, "Fajny sklep", "Warszawa");

        System.out.println(sklep);
    }
}
