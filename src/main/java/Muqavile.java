import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Muqavile {
    List<Teachers> muqavileli = new ArrayList<>();
    List<Teachers> muqavilesiz = new ArrayList<>();

    void add(Teachers teacher){
        if(teacher.getEndMuqavile().compareTo(LocalDate.now())>=0){
            muqavileli.add(teacher);
        }
        else muqavilesiz.add(teacher);

    }

    void printMuqavileli(){
        for (int i = 0; i < muqavileli.size(); i++) {
            System.out.println(muqavileli.get(i));
        }
    }

    void printMuqavilesiz(){
        for (int i = 0; i < muqavilesiz.size(); i++) {
            System.out.println(muqavilesiz.get(i));
        }
    }

}
