package Visitor;

/**
 * Created by lyl on 2017/4/24.
 */
public interface Visitor {

    void visit(Visitor.NodeA nodeA);

    void visit(Visitor.NodeB nodeB);

}
