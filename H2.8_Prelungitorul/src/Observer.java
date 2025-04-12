public interface Observer {

    void conecteazaLaPrelungitor();
    void deconecteazaDeLaPrelungitor();
    String status(boolean inPriza);
}
