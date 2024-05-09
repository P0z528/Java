class Prostokat extends Figura {
    private double wys=0, szer=0;
    private String kolor;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }
    public Prostokat(float wys, float szer, String kolor) {
        this.wys = wys;
        this.szer = szer;
        this.kolor = kolor;
    }
    double getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(int szer, int wys) {
        this.szer += szer;
        this.wys += wys;
    }


}