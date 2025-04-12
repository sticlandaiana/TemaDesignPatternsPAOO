public class Main {
    public static void main(String[] args) {

        ComplexNumber z1 = new ComplexNumber(1, 5);
        ComplexNumber z2 = new ComplexNumber(4,4);

        System.out.println("1) "+ Calculator.suma(z1,z2));
        System.out.println("2) "+Calculator.suma(4.0,5.0));
        System.out.println("3) "+Calculator.suma(z1,1.0));
        System.out.println("4) "+Calculator.suma(4.0,z2));
    }
}