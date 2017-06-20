package Bridge_1;

/**
 * Created by lyl on 2017/6/20.
 */
public class Client {
    public static void main(String[] args) {
        Bridge d1 = new Bridge(new StringDisplay("百里放羊"));
        Bridge d2 = new CountDisplay(new StringDisplay("百云沐风"));
        CountDisplay d3 = new CountDisplay(new StringDisplay("Hello World"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
    }
}
