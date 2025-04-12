public class Product {
    private String id;
    private String name;
    private double priceInUSD;

    public Product(String id, String name, double priceInUSD){
        this.id=id;
        this.name=name;
        this.priceInUSD=priceInUSD;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPriceInUSD() {
        return priceInUSD;
    }

    @Override
    public String toString(){
        return "id: "+id+" name: "+name+" price in USD: "+priceInUSD;
    }
}
