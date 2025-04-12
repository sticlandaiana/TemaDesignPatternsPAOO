public class Main {
    public static void main(String[] args) {
        Aparat aparatDeCafea = new Aparat("Aparatul de cafea");
        Aparat frigider = new Aparat("Frigiderul");
        Aparat cuptorCuMicrounde = new Aparat("Cuptorul cu microunde");

        Prelungitor prelungitor = new Prelungitor();

        prelungitor.adaugaAparat(aparatDeCafea);
        prelungitor.adaugaAparat(frigider);
        prelungitor.adaugaAparat(cuptorCuMicrounde);

        prelungitor.bagaPrelungitorulInPriza();
        System.out.println("\n");
        prelungitor.scoatePrelungitorulDinPriza();

    }
}