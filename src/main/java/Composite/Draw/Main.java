package Composite.Draw;

/**
 * Created by lyl on 2017/4/17.
 */
public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.add(new Circle());
        picture.add(new Line());
        picture.add(new Rectangle());
        picture.draw();
    }

}
