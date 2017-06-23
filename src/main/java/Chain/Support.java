package Chain;

/**
 * Created by lyl on 2017/6/21.
 */
public abstract class Support {
    private String name;
    private Support next;

    protected abstract boolean resolve(Trouble trouble);

    public Support(String name){
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){
        if (resolve(trouble)){
            done(trouble);
        }else if ((next != null)){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved");
    }

    protected void done(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + ".");
    }

}
