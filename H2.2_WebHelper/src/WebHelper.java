import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WebHelper {

    private static WebHelper instance = null;

    private String ourContent = null;
    private final String ourURL = "https://en.wikipedia.org/wiki/Flying_Ducks";

    private WebHelper(){

    }

    public static WebHelper getInstance(){
        if(instance == null){
            instance = new WebHelper();

        }

        return instance;
    }

    public String getWebSiteContent() {
        if (ourContent == null) {
            try {
                //create a url
                URL url = new URL(ourURL);
                //create a connection
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                //request the connection
                connection.setRequestMethod("GET");

                //use a buffer for the stream
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
                //store the data, by appending every line
                StringBuilder content = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }

                reader.close();
                connection.disconnect();

                //convert our data into a string and assign it to the attribute
                ourContent = content.toString();

            } catch (Exception e) {
                e.printStackTrace();
                ourContent = "Error :((( Couldn't access the website";
            }
        }

        return ourContent;
    }
}
