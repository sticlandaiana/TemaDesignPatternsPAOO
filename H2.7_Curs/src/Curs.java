import java.util.ArrayList;

public class Curs {
    private ArrayList<Observer> studenti;

    public Curs(){
        studenti = new ArrayList<>();
    }

    public void inregistreazaStudent(Observer s){
        studenti.add(s);
    }

    public void prezenta(){
        System.out.println("Catalog: ");
        for(Observer s: studenti){
            System.out.println(s.prezenta());
        }
    }
}
