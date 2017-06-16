package ThreadPool_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lyl on 2017/4/30.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Collections.synchronizedList(new ArrayList<>());
    }
}
