import java.util.Scanner;

public class C1 {
    private int x;
    private int y;

    public C1(){
        x=0;
        y=0;
    }
    public void readNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write x");
        x = scanner.nextInt();
        System.out.println("Write y");
        y = scanner.nextInt();

    }

    public int getSum(){
        return x+y;
    }
}
