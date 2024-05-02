public class Stozek {

    String nazwa;
    int a,h;


    public double pole(int a, int h){
        double l = Math.sqrt(Math.pow(a,2) + Math.pow(h,2));
        return Math.PI * a *(a+l);
    }

    public double objetosc(int a, int h){
        return (Math.PI * Math.pow(a,2) *h)/3;
    }

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n promien a: " + a +
                "\n wysokosc h: " + h +

                "\n pole:  " + pole(a,h)+
                "\n objetosc: " + objetosc(a,h));
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

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


}
