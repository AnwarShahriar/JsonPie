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

            for (int i = 0; i < pie.getJSONArray("contacts").length(); i++) {
                String contact = pie.getString("contacts[" + i + "]");
                System.out.println(contact);
            }

            for (int i = 0; i < pie.getJSONArray("doc").length(); i++) {
                String title = pie.getString("doc[" + i + "] -> title");
                String text = pie.getString("doc[" + i + "] -> text");
                System.out.println(title + "\n" + text);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static String json = "{\n" +
            "  \"name\": {\n" +
            "    \"firstName\": \"Shahriar\",\n" +
            "    \"lastName\": \"Anwar\"\n" +
            "  },\n" +
            "  \"contacts\":[\n" +
            "    \"1234\",\n" +
            "    \"5678\",\n" +
            "    \"9876\"\n" +
            "  ],\n" +
            "  \"doc\":[\n" +
            "    {\n" +
            "      \"title\": \"one\",\n" +
            "      \"text\": \"this is doc one\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"title\": \"two\",\n" +
            "      \"text\": \"this is doc two\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"title\": \"three\",\n" +
            "      \"text\": \"this is doc three\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";
}