package FactoryMethod_1;

/**
 * Created by lyl on 2017/6/16.
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner){
        System.out.println("制作"  + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
    public String getOwner(){
        return owner;
    }
}
