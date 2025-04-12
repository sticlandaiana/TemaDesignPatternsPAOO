public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("xdz12354", "minge", 10.0);
        Produs produs1 = Helper.ProductToProdus(product1);

        System.out.println(produs1.toString());

        Product USProduct = Helper.ProdusToProduct(produs1);

        System.out.println(USProduct.toString());

    }
}