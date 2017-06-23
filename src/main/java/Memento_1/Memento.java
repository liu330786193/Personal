package Memento_1;

import com.sun.tools.corba.se.idl.StringGen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by lyl on 2017/6/22.
 */
public class Memento {
    int money;
    Vector fruits;

    public int getMoney() {
        return money;
    }
    Memento(int money){
        this.money = money;
        this.fruits = new Vector();
    }
    void addFruit(String fruit){
        fruits.add(fruit);
    }
    Vector getFruits(){
        return (Vector) fruits.clone();
    }

}
