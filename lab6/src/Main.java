public class Main {
    public static void main(String[] args) {

        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(5, 7);
        Punkt punkt3 = new Punkt(3, 4);


        punkt1.opis();
        punkt1.przesun(2, 3);
        punkt1.opis();
        punkt1.zeruj();
        punkt1.opis();


        punkt2.opis();
        punkt2.setX(10);
        punkt2.setY(15);
        punkt2.opis();
        punkt2.zeruj();
        punkt2.opis();


        punkt3.opis();
        punkt3.przesun(1, 1);
        punkt3.opis();
        punkt3.zeruj();
        punkt3.opis();


        Prostokat prostokat = new Prostokat( 5, 7, "czerwony");

        // Wywołanie metody przesun
        prostokat.przesun(3, 5);

    }
}