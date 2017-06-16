package Visitor;

/**
 * Created by lyl on 2017/4/24.
 */
public class VisitorB implements Visitor.Visitor {
    @Override
    public void visit(Visitor.NodeA nodeA) {
        System.out.println(nodeA.operationA());
    }

    @Override
    public void visit(Visitor.NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
