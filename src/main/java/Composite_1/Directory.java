package Composite_1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lyl on 2017/6/20.
 */
public class Directory extends Entry {

    private String name;

    private ArrayList directory = new ArrayList();

    public Directory(String name){
        this.name = name;
    }


    @Override
    String getName() {
        return name;
    }

    @Override
    int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry  = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
