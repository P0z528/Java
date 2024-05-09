public class Gatunek {
    private String nazwaRodzaju;
    private String nazwaGatunkowa;
    private int liczbaChromosomow2n;
    private int podstawowaLiczbaChromosomowX;
    private String opis;

    public Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow2n, int podstawowaLiczbaChromosomowX, String opis) {
    }

    public String getNazwaRodzaju() {
        return nazwaRodzaju;
    }

    public void setNazwaRodzaju(String nazwaRodzaju) {
        this.nazwaRodzaju = nazwaRodzaju;
    }

    public String getNazwaGatunkowa() {
        return nazwaGatunkowa;
    }

    public void setNazwaGatunkowa(String nazwaGatunkowa) {
        this.nazwaGatunkowa = nazwaGatunkowa;
    }

    public int getLiczbaChromosomow2n() {
        return liczbaChromosomow2n;
    }

    public void setLiczbaChromosomow2n(int liczbaChromosomow2n) {
        this.liczbaChromosomow2n = liczbaChromosomow2n;
    }

    public int getPodstawowaLiczbaChromosomowX() {
        return podstawowaLiczbaChromosomowX;
    }

    public void setPodstawowaLiczbaChromosomowX(int podstawowaLiczbaChromosomowX) {
        this.podstawowaLiczbaChromosomowX = podstawowaLiczbaChromosomowX;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String pelnaNazwa() {
        return this.nazwaRodzaju + " " + this.nazwaGatunkowa;
    }


    public int liczbaChromosomowN() {
        return this.liczbaChromosomow2n / 2;
    }

    // Metoda wypisująca wszystkie dane
    public void wypiszDane() {
        System.out.println("Nazwa rodzaju: " + this.nazwaRodzaju);
        System.out.println("Nazwa gatunkowa: " + this.nazwaGatunkowa);
        System.out.println("Liczba chromosomów 2n: " + this.liczbaChromosomow2n);
        System.out.println("Podstawowa liczba chromosomów x: " + this.podstawowaLiczbaChromosomowX);
        System.out.println("Opis: " + this.opis);
    }


    public Gatunek klonuj() {
        return new Gatunek(this.nazwaRodzaju, this.nazwaGatunkowa, this.liczbaChromosomow2n, this.podstawowaLiczbaChromosomowX, this.opis);
    }


}

