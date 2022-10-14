import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Teachers teacher = new Teachers("Huseyn","Memmedov",LocalDate.of(2009,9,12),LocalDate.of(2030,8,1));
        Muqavile muqavile = new Muqavile();
        muqavile.add(teacher);
        System.out.println("----------------------------Muqavileli-------------------------------");
        muqavile.printMuqavileli();
        System.out.println("----------------------------Muqavilesiz-------------------------------");
        muqavile.printMuqavilesiz();

    }
}
