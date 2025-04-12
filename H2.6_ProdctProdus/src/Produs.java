public class Produs {
    private String id;
    private String name;
    private double pretInLei;

    public Produs(String id, String name, double pretInLei){
        this.id=id;
        this.name=name;
        this.pretInLei=pretInLei;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPretInLei() {
        return pretInLei;
    }

    @Override
    public String toString(){
        return "id: "+id+" name: "+name+" pret in lei: "+pretInLei;
    }
}
