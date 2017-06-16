package Visitor;

/**
 * Created by lyl on 2017/4/24.
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(NodeA nodeA) {
        System.out.println(nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
