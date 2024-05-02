import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Budynek budynek = new Budynek();

        budynek.setNazwa("wiezowiec");
        budynek.setPietra(22);
        budynek.setRok(1914);

        budynek.info();

        Budynek budynek1 = new Budynek();

        budynek1.setNazwa("melina kaczora");
        budynek1.setPietra(3);
        budynek1.setRok(1989);

        budynek1.info();

    //Mialobyc kilka i z jakimis innymi metodami ale mi sie nie chce D:    
    }
}