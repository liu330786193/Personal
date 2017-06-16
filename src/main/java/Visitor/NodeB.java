package Visitor;

/**
 * Created by lyl on 2017/4/24.
 */
public class NodeB extends Node {

    public String operationB(){
        return "NodeB is visited";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
