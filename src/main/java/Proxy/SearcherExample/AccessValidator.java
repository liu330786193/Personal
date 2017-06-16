package Proxy.SearcherExample;

/**
 * Created by lyl on 2017/4/18.
 */
public class AccessValidator {

    public boolean validateUser(String userId){
        if (userId.equals("admin")){
            return true;
        }
        return false;
    }

}
