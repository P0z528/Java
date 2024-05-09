public class Okrag {
    public Punkt srodek;
    public double promien;

    public Okrag() {
        this.srodek = new Punkt();
        this.promien = 0.0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public Punkt getSrodek() {
        return this.srodek;
    }

    public void setSrodek(Punkt srodek) {
        this.srodek = srodek;
    }

    public double getPromien() {
        return this.promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(this.promien, 2);
    }


    public double getSrednica() {
        return 2 * this.promien;
    }

    public boolean wSrodku(Punkt punkt) {
        double dx = punkt.getX() - this.srodek.getX();
        double dy = punkt.getY() - this.srodek.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance <= this.promien;
    }
}
