package Proxy.SearcherExample;

/**
 * Created by lyl on 2017/4/18.
 */
public class UsageLogger {

    private String userId;

    public void save(){
        System.out.println("UsageLogger save");
    }

    public void save(String userId){
        this.userId = userId;
        save();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
