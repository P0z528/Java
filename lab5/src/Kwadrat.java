public class Kwadrat {

    String nazwa;
    int bok;

    public double Obwod(int bok){
        return 4*bok;
    }

    public double Pole(int bok){
        return Math.pow(bok, 2);
    }

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n bok: " + bok +
                "\n obwod: " + Obwod(bok) +
                "\n pole:  " + Pole(bok));
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }
}
