package MultiSingleton;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by lyl on 2017/4/13.
 */
public class LingualResource {

    private String language = "en";
    private String region = "US";
    private String localeCode = "en_US";
    private static final String FILE_NAME = "res";
    private static HashMap instances = new HashMap(19);
    private Locale locale = null;
    private ResourceBundle resourceBundle = null;
    private LingualResource lnkLingualResource;
    private LingualResource(){}
    private LingualResource(String language, String region){
        this.localeCode = language;
        this.region = region;
        localeCode = makeLocaleCode(language, region);
        locale = new Locale(language, region);
        resourceBundle = ResourceBundle.getBundle(FILE_NAME, locale);
        instances.put(makeLocaleCode(language, region), resourceBundle);
    }
    public synchronized static LingualResource getInstance(String language, String region){
        if (makeLocaleCode(language, region) != null){
//            return (LingualResource)makeLocaleCode(language, region);
            return null;
        }else {
            return new LingualResource(language, region);
        }
    }
    public String getLocaleString(String code){
        return resourceBundle.getString(code);
    }
    private static String makeLocaleCode(String language, String region) {
        return language + "_" + region;
    }


}
