package Visitor;

/**
 * Created by lyl on 2017/4/24.
 */
public class NodeA extends Node {

    public String operationA() {
        return "NodeA is visited";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
