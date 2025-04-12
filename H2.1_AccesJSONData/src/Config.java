import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Config {

    private static Config instance = null;

    private String color;
    private Integer weight;

    private Config(){

        try{
            BufferedReader br = new BufferedReader(new FileReader("config.json"));

            StringBuilder newString = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                newString.append(line);
            }
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(newString.toString(), JsonObject.class);

            this.color = json.get("color").getAsString();
            this.weight = json.get("weight").getAsInt();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

}
