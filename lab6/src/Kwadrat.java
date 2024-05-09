public class Kwadrat extends Prostokat {
    double wys;
    public Kwadrat(float wys, String kolor) {
        super(wys, wys, kolor);  // Kwadrat to prostokąt o równych bokach
    }


    @Override
    public String opis() {
        System.out.println("Kwadrat o boku " + getWys() + " i kolorze " + getKolor());
        return null;
    }

    public double getWys() {
        return wys;
    }

    public void setWys(double wys) {
        this.wys = wys;
    }
}


