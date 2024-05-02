public class Prostopadloscian {

    String nazwa;
    int a,b,c;

    public double obwod(int a, int b, int c){
        return (4*a)+(4*b)+(4*c);
    }
    public double pole(int a, int b, int c){
        return (2*a*b)+(2*b*c)+(2*a*c);
    }

    public double objetosc(int a, int b, int c){
        return a*b*c;
    }

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n bok a: " + a +
                "\n bok b: " + b +
                "\n bok c: " + c +
                "\n obwod: " + obwod(a,b,c) +
                "\n pole:  " + pole(a,b,c)+
                "\n objetosc: " + objetosc(a,b,c));
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
