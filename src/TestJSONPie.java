import me.anwarshahriar.jsonpie.JSONPie;
import org.json.JSONException;

/**
 * Created by Shishir on 11/10/2014.
 */
public class TestJSONPie {
    public static void main(String[] args) {
        JSONPie pie = null;
        try {
            pie = new JSONPie(json);
            String fullName = pie.getString("name->firstName") + " " + pie.getString("name->lastName");
            System.out.println(fullName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static String json = "{\n" +
            "\t'name': {\n" +
            "\t\t'id': 4,\n" +
            "\t\t'firstName': 'Shahriar',\n" +
            "\t\t'lastName': 'anwar'\n" +
            "\t},\n" +
            "\t'contacts': [\n" +
            "\t\t'+8801686689608',\n" +
            "\t\t'+8801681676824',\n" +
            "\t\t'+8801552463683',\n" +
            "\t\t'+880191760169'\n" +
            "\t],\n" +
            "\t'doc': [\n" +
            "\t\t{\n" +
            "\t\t\t'title': \"one\",\n" +
            "\t\t\t'text': \"This is text for doc one.\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t'title': \"two\",\n" +
            "\t\t\t'text': \"This is text for doc two.\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t'title': \"three\",\n" +
            "\t\t\t'text': \"This is text for doc three.\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\t'title': \"four\",\n" +
            "\t\t\t'text': \"This is text for doc four.\"\n" +
            "\t\t}\n" +
            "\t]\n" +
            "}";
}