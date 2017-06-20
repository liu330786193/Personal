package Builder_1;

/**
 * Created by lyl on 2017/6/16.
 */
public class Client {
    public static void main(String[] args) {
        TextBuilder builder = new TextBuilder();
        Director director = new Director(builder);
        director.builder();
        System.out.println(builder.getResult());
    }
}
