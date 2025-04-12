public class Helper {
    private final static double inLei = 10;
    private final static double toUSD = 0.1;

    public static Produs ProductToProdus(Product p){
        double pretInLei = p.getPriceInUSD()*inLei;
        return new Produs(p.getId(),p.getName(),pretInLei);
    }

    public static Product ProdusToProduct(Produs p) {
        double priceInUSD = p.getPretInLei() *toUSD;
        return new Product(p.getId(), p.getName(), priceInUSD);
    }
}
