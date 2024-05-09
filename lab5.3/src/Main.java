public class Main {
    public static void main(String[] args) {
        Gatunek gatunek1 = new Gatunek("drapieznik", "canis lupus", 78, 39, "Szary wilk");

        // Wywołanie metod
        System.out.println("Pełna nazwa: " + gatunek1.pelnaNazwa());
        System.out.println("Haploidalna liczba chromosomów n: " + gatunek1.liczbaChromosomowN());
        System.out.println("Wszystkie dane:");
        gatunek1.wypiszDane();

        // Klonowanie obiektu
        Gatunek gatunek2 = gatunek1.klonuj();
        System.out.println("Dane sklonowanego obiektu:");
        gatunek2.wypiszDane();
    }
}