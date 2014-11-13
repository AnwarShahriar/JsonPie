package me.anwarshahriar.jsonpie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Shishir on 11/10/2014.
 */
public class JSONPie {
    private JSONObject jsonObject;

    /**
     * Constructor
     * @param json
     * @throws JSONException
     */
    public JSONPie(String json) throws JSONException {
        jsonObject = new JSONObject(json);
    }

    public int getInt(String query) throws JSONException {
        JSONPieProcessor<Integer> processor = new JSONPieProcessor<Integer>(jsonObject);
        return processor.processQuery(query);
    }

    public float getFloat(String query) throws JSONException {
        JSONPieProcessor<Float> processor = new JSONPieProcessor<Float>(jsonObject);
        return processor.processQuery(query);
    }

    public long getLong(String query) throws JSONException {
        JSONPieProcessor<Long> processor = new JSONPieProcessor<Long>(jsonObject);
        return processor.processQuery(query);
    }

    public double getDouble(String query) throws JSONException {
        JSONPieProcessor<Double> processor = new JSONPieProcessor<Double>(jsonObject);
        return processor.processQuery(query);
    }

    public boolean getBoolean(String query) throws JSONException {
        JSONPieProcessor<Boolean> processor = new JSONPieProcessor<Boolean>(jsonObject);
        return processor.processQuery(query);
    }

    public String getString(String query) throws JSONException {
        JSONPieProcessor<String> processor = new JSONPieProcessor<String>(jsonObject);
        return processor.processQuery(query);
    }

    public JSONObject getJSONObject(String query) throws JSONException  {
        JSONPieProcessor<JSONObject> processor = new JSONPieProcessor<JSONObject>(jsonObject);
        return processor.processQuery(query);
    }
    public JSONArray getJSONArray(String query) throws JSONException  {
        JSONPieProcessor<JSONArray> processor = new JSONPieProcessor<JSONArray>(jsonObject);
        return processor.processQuery(query);
    }
}