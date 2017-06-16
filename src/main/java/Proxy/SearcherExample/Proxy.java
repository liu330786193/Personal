package Proxy.SearcherExample;

/**
 * Created by lyl on 2017/4/18.
 */
public class Proxy implements Searcher {

    private RealSearcher searcher;

    private UsageLogger usageLogger;

    private AccessValidator accessValidator;

    public Proxy() {
        searcher = new RealSearcher();
    }

    @Override
    public String doSearcher(String userId, String searchType) {
        if (checkAccess(userId)){
            String result = searcher.doSearcher(null, searchType);
            logUsage(userId);
            return result;
        }
        return null;
    }

    private void logUsage(String userId) {
        UsageLogger logger = new UsageLogger();
        logger.setUserId(userId);
        logger.save();
    }

    private boolean checkAccess(String userId){
        accessValidator = new AccessValidator();
        return accessValidator.validateUser(userId);
    }

}
