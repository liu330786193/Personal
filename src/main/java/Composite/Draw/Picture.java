package Composite.Draw;

import java.util.Vector;

/**
 * Created by lyl on 2017/4/17.
 */
public class Picture extends Graphics {

    private Vector list = new Vector(10);
    public void draw() {
        for (Object obj : list){
            ((Graphics)obj).draw();
        }
        /*list.stream().forEach(l -> {
            ((Graphics)l).draw();
        });*/
    }

    public void add(Graphics g){
        list.addElement(g);
    }

    public void remove(Graphics g){
        list.removeElement(g);
    }

    public Graphics getChild(int i){
        return (Graphics) list.get(i);
    }

}
