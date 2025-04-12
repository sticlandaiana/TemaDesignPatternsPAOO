public class Main {
    public static void main(String[] args) {
        Config configurare = Config.getInstance();
        System.out.println("Color: " + configurare.getColor());
        System.out.println("Weight: " + configurare.getWeight());
    }
}