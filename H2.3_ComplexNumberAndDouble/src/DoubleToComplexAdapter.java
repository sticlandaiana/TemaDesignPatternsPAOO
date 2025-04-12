public class DoubleToComplexAdapter {
    public static ComplexNumber convert(Double value) {
        return new ComplexNumber(value, 0); // cons partea imaginara 0, pt a converti la complex din double
    }
}