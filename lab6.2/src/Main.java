public class Main {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("Renault", "Captur", "mini SUV", "Niebieski", 2015, 44000);
        Samochod samochodOsobowy = new SamochodOsobowy("bmw", "m2", "coupe", "czarny", 2016, 80000, 2.0, 3.0, 4);

        samochod.pokazInformacje();
        samochodOsobowy.pokazInformacje();
    }
}