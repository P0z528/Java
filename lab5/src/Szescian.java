public class Szescian {

    String nazwa;
    int a;

    public double obwod(int a){
        return 12*a;
    }

    public double Pole(int a){
        return 6*(Math.pow(a,2));
    }

    public double objetosc(int a){
        return Math.pow(a,3);
    }

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n bok: " + a +
                "\n obwod: " + obwod(a) +
                "\n pole:  " + Pole(a)+
                "\n objetosc: " + objetosc(a));
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
