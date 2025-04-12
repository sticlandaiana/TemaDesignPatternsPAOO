import java.util.ArrayList;

public class Prelungitor {
    private boolean inPriza;
    private ArrayList<Observer> aparate;

    public Prelungitor(){
        this.inPriza=false;
        this.aparate = new ArrayList<>();
    }

    public void adaugaAparat(Observer aparat){
        aparat.conecteazaLaPrelungitor();
        aparate.add(aparat);
    }

    public void scoateAparat(Observer aparat){
        aparat.deconecteazaDeLaPrelungitor();
        aparate.remove(aparat);
    }

    public void mesajulAparatelor(){
        for(Observer aparat:aparate){
            String mesaj = aparat.status(inPriza);
            if(mesaj.isEmpty()!=true){
                System.out.println(mesaj);
            }

        }
    }

    public void scoatePrelungitorulDinPriza(){
        inPriza = false;
        mesajulAparatelor();
    }

    public void bagaPrelungitorulInPriza(){
        inPriza = true;
        mesajulAparatelor();
    }
}
