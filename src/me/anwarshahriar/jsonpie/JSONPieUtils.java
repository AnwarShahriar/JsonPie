package me.anwarshahriar.jsonpie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Shishir on 11/11/2014.
 */
public class JSONPieUtils {
    private static final String TAG_MATCHER_REGEX = "->";
    private static final String ARRAY_MATCHER_REGEX = ".*\\[\\s*[0-9]+\\s*\\]";
    private static final String ARRAY_INDEX_REGEX_MATCHER = "[0-9]+";
    private static final String ARRAY_TAG_REGEX_MATCHER = "[a-zA-Z0-9]+";

    private static Pattern arrayIndexMatcherPattern = Pattern.compile(ARRAY_INDEX_REGEX_MATCHER),
            arrayTagMatcherPattern = Pattern.compile(ARRAY_TAG_REGEX_MATCHER);

    public static String[] getJSONTagsFrom(String query) {
        return query.split(TAG_MATCHER_REGEX);
    }

    public static String getArrayTag(String tag) {
        Matcher matcher = arrayTagMatcherPattern.matcher(tag);
        matcher.find();
        return matcher.group();
    }

    public static int getArrayIndex(String tag) {
        Matcher matcher = arrayIndexMatcherPattern.matcher(tag);
        matcher.find();
        return Integer.parseInt(matcher.group().toString());
    }

    public static boolean isArray(String tag) {
        return tag.matches(ARRAY_MATCHER_REGEX);
    }
}