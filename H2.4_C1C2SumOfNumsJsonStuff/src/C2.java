import org.json.JSONObject;

public class C2 {
    private String jsonString;

    public C2(String jsonString) {
        this.jsonString = jsonString;
    }

    public int getN1() {
        JSONObject json = new JSONObject(jsonString);
        return json.getInt("n1");
    }

    public int getN2() {
        JSONObject json = new JSONObject(jsonString);
        return json.getInt("n2");
    }
}