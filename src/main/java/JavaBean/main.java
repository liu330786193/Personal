package JavaBean;

import org.junit.Test;

/**
 * Created by lyl on 2017/4/13.
 */
public class main {

    @Test
    public void test() throws CloneNotSupportedException {
        User user = new User();
        user.setAge(21);
        user.setName("user");
        Baby baby = new Baby();
        baby.setAge(5);
        baby.setName("baby");
        user.setBaby(baby);
        User userClone = (User) user.clone();
        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getBaby().getName());
        System.out.println(user.getBaby().getAge());
        baby.setName("aabb");
        baby.setAge(25);
        System.out.println(user.getBaby().getName());
        System.out.println(user.getBaby().getAge());
    }

    @Test
    public void test1() throws Exception {
        User user = new User();
        user.setAge(21);
        user.setName("user");
        Baby baby = new Baby();
        baby.setAge(5);
        baby.setName("baby");
        user.setBaby(baby);
        User userClone = (User) Deepclone.clone(user);
        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getBaby().getName());
        System.out.println(user.getBaby().getAge());
        baby.setName("aabb");
        baby.setAge(25);
        System.out.println(user.getBaby().getName());
        System.out.println(user.getBaby().getAge());
    }

}
