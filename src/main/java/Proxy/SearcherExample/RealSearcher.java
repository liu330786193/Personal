package Proxy.SearcherExample;

/**
 * Created by lyl on 2017/4/18.
 */
public class RealSearcher implements Searcher {

    public RealSearcher() {
    }

    @Override
    public String doSearcher(String userId, String searchType) {
        return "Result Set";
    }
}
