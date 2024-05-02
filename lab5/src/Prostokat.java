public class Prostokat {

    String nazwa;
    int a,b;

    public double Obwod(int a, int b){
        return (2*a)+(2*b);}

    public double Pole(int a, int b){
        return a*b;
    }

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n bok a: " + a +
                "\n bok b: " + b +
                "\n obwod: " + Obwod(a,b) +
                "\n pole:  " + Pole(a,b));
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

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
