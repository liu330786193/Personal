package Builder;

/**
 * Created by lyl on 2017/4/13.
 */
public class ConcreteBuilder implements Builder
{

    private Product product = new Product();

    @Override
    public void buildPart1() {
        System.out.println("创建部件1");
    }

    @Override
    public void buildPart2() {
        System.out.println("创建部件2");
    }

    @Override
    public Product retrieveResult() {
        System.out.println("返回产品");
        return product;
    }
}
