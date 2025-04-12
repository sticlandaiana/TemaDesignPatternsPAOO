public class Main {
    public static void main(String[] args) {
        String json = "{\"n1\": 10, \"n2\": 22}";
        C2 c2 = new C2(json);

        C1 adapted = new C1Adapter(c2);
        System.out.println("Sum = " + adapted.getSum());
    }
}