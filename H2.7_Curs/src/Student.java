import java.util.Random;

public class Student implements Observer{
    private String nume;
    private String status;

    public Student(String nume){
        this.nume = nume;
    }

    @Override
    public String prezenta(){
        Random random = new Random();
        boolean prezent = random.nextBoolean();
        if(prezent){
            status = "prezent";
        }else{
            status = "absent";
        }

        return "nume: " +nume+" --- status: "+status;
    }
}
