public class Calculator {

    // doua nr complexe - 1) varianta clasica mate
    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        return nr1.add(nr2);
    }

    // doua numere double, convertite in complexe si insumate -2)
    public static ComplexNumber suma(Double nr1, Double nr2) {
        ComplexNumber c1 = DoubleToComplexAdapter.convert(nr1);
        ComplexNumber c2 = DoubleToComplexAdapter.convert(nr2);
        return c1.add(c2);
    }

    // 3.1)
    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        double d1 = ComplexToDoubleAdapter.convert(nr1);
        double result = d1 + nr2;
        return DoubleToComplexAdapter.convert(result);
    }

    // 3.2)
    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        double d2 = ComplexToDoubleAdapter.convert(nr2);
        double result = nr1 + d2;
        return DoubleToComplexAdapter.convert(result);
    }
}
