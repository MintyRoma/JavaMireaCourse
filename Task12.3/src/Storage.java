import java.io.Serializable;

public class Storage<T extends Comparable<T>,V extends Serializable,K extends Animal>{

    private T tval;
    private K kval;
    private V vval;
    public Storage(T tvalue, V vvalue, K kvalue)
    {
        tval = tvalue;
        kval = kvalue;
        vval = vvalue;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "tval=" + tval +
                ", kval=" + kval +
                ", vval=" + vval +
                '}';
    }

    public String getTypes()
    {
        return "Storage{" +
                "tval=" + tval.getClass().getName() +
                ", kval=" + kval.getClass().getName() +
                ", vval=" + vval.getClass().getName() +
                '}';
    }
}
