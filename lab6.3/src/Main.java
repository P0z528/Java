
public class Main {
    public static void main(String[] args) {
        Powiesc powiesc = new Powiesc("Ksiegi Jakubowe", new Autor("Olga", "Tokarczuk", 45, 3), 2014, "historia", "fikcja historyczna", new String[]{"Elzbieta","Antoni","Katarzyna"}, 912);
        Klient klient = new Klient("Mateusz", "Pociecha", "Rzeszów", 443168923);
        Ksiegarnia ksiegarnia = new Ksiegarnia("Wydawnictwo Literackie", "Krakow");

        ksiegarnia.dodajPowiesc(powiesc);
        ksiegarnia.dodajKlienta(klient);

        ksiegarnia.pokazPowiesci();
        klient.pokazDaneKlienta();
    }
}