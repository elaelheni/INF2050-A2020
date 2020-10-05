import net.sf.json.JSONObject;
import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

public class Exemple {
    public static void main (String[] args){
        int x = 5;
        int y =98;

        System.out.printf("Avant permutation : %n x: %d y: %d %n", x, y);

        int temp = x;
        x = y;
        y =temp;

        System.out.printf("Après permutation : %n x: %d y: %d %n", x, y);

    }

    public static JSONObject fromStringToJSON (String json) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject objet = (JSONObject) parser.parse(json);
        return objet;

    }


}
