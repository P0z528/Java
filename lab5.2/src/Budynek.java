import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rok, pietra;

    int localDate = 2024;

    public int data(int rok){

        return localDate -rok;
    };

    public void info(){
        System.out.println("nazwa: " + nazwa +
                "\nrok budowy: " + rok+
                "\npietra: " + pietra+
                "\nBudynek ma: "+ data(rok)+ " lat.");
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getPietra() {
        return pietra;
    }

    public void setPietra(int pietra) {
        this.pietra = pietra;
    }
}
