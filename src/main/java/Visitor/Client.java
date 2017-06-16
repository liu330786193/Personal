package Visitor;

/**
 * Created by lyl on 2017/4/24.
 */
public class Client {

    private static ObjectStructure aObjects;
    private static Visitor visitor;

    public static void main(String[] args) {
        aObjects = new ObjectStructure();
        aObjects.add(new NodeA());
        aObjects.add(new NodeB());
        visitor = new VisitorA();
        aObjects.action(visitor);
    }

}
