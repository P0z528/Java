public class Kula {

    String nazwa;
    int a;

    public double pole(int a){
        return (4*Math.PI)*Math.pow(a,2);
    }

    public double objetosc(int a){
        return (4/3)*Math.PI*(Math.pow(a,3));
    }

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n promien a: " + a +
                "\n pole:  " + pole(a)+
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
