package Composite_1;

import Builder_1.Director;

/**
 * Created by lyl on 2017/6/20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 1000));
        bindir.add(new File("latex", 2000));
        rootdir.printList();
    }
}
