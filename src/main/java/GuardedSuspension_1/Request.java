package GuardedSuspension_1;

/**
 * Created by lyl on 2017/4/29.
 */
public class Request {

    private String name;

    public String getName() {
        return name;
    }

    public Request(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
