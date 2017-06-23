package Memento_1;

import java.util.Random;
import java.util.Vector;

/**
 * Created by lyl on 2017/6/22.
 */
public class Gamer {

    private int money;
    private Vector fruits = new Vector();
    private Random random = new Random();
    private static String[] fruitsname = {"拼过", "葡萄", "香蕉", "橘子"};
    public Gamer(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if (dice == 1){
            money += 100;
            System.out.println("金钱增加了");
        }else if (dice == 2){
            money /= 2;
            System.out.println("所持金钱减半了");
        }else if (dice == 6){
//            String f =
        }
    }
}
