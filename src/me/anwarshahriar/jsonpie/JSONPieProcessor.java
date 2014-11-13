package me.anwarshahriar.jsonpie;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Shishir on 11/11/2014.
 */
public class JSONPieProcessor<T> {
    private JSONObject jsonObject;

    public JSONPieProcessor(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public T processQuery(String query) throws JSONException {
        String[] tags = JSONPieUtils.getJSONTagsFrom(query);

        JSONObject tempObj = jsonObject;

        for (int i = 0; i < tags.length; i++) {
            String tag = tags[i].trim();

            if (i == tags.length - 1) {
                if (JSONPieUtils.isArray(tag)) {
                    return (T) tempObj.getJSONArray(JSONPieUtils.getArrayTag(tag)).get(JSONPieUtils.getArrayIndex(tag));
                } else {
                    return (T) tempObj.get(tag);
                }
            }

            if (JSONPieUtils.isArray(tag)) {
                tempObj = tempObj.getJSONArray(JSONPieUtils.getArrayTag(tag)).getJSONObject(JSONPieUtils.getArrayIndex(tag));
            } else {
                tempObj = tempObj.getJSONObject(tag);
            }
        }
        return null;
    }
}