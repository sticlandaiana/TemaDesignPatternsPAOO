import java.sql.SQLOutput;

public class Aparat implements Observer{
    private String nume;
    private boolean aparatConectatLaPrelungitor;

    public Aparat(String nume){
        this.nume = nume;
        this.aparatConectatLaPrelungitor=false; //consideram ca fiind scos din prelungitor

    }

    @Override
    public void conecteazaLaPrelungitor(){
        aparatConectatLaPrelungitor = true;
    }

    @Override
    public void deconecteazaDeLaPrelungitor(){
        aparatConectatLaPrelungitor = false;
    }

    @Override
    public String status (boolean inPriza){
        if(inPriza){
            if(aparatConectatLaPrelungitor){
                return nume + " a fost conectat la curent";
            } else {
                return ""; //prelungitorul e in priza, dar aparatul nu e conectat la prelungitor, nu a fost nici conectat, nici deconectat
            }
        }else{
            return nume + " a fost deconectat";
        }
    }
}
