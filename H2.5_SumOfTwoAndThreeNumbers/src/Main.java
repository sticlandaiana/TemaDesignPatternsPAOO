public class Main {
    public static void main(String[] args) {
        C2Nr c2Nr = new C2Nr(1,2);
        System.out.println("Sum of two = " +c2Nr.getSum());

        C3Nr c3nr = new C3Nr(c2Nr,3);
        System.out.println("Sum of three = "+c3nr.getSum());
    }
}