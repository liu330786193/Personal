package Composite.Draw;

import org.junit.Test;

/**
 * Created by lyl on 2017/4/17.
 */
public class Main {

    @Test
    public void test(){
        Picture picture = new Picture();
        picture.add(new Circle());
        picture.add(new Line());
        picture.add(new Rectangle());
        picture.draw();
    }

}
