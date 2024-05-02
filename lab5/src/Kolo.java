public class Kolo {

    String nazwa;
    int promien;
    double pole(int promien) {
        return Math.PI * (Math.pow(promien, 2));}
    public double obwod(int promien) {
        return (2*Math.PI) * promien;}

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\n promien: " + promien +
                "\n obwod: " + obwod(promien) +
                "\n pole:  " + pole(promien));
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }



}
