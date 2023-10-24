public class Storage<T,V,K>{
    private T left;
    private V center;

    private K right;

    Storage(T tcontent, V vcontent, K kcontent)
    {
        left = tcontent;
        center = vcontent;
        right = kcontent;
    }

    public T getLeft() {
        return left;
    }

    public K getRight() {
        return right;
    }

    public V getCenter() {
        return center;
    }

    public void setCenter(V center) {
        this.center = center;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public void setRight(K right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "left=" + left +
                ", center=" + center +
                ", right=" + right +
                '}';
    }

    public void getTypes()
    {
        System.out.println("left = "+left.getClass().getName()+",\n" +
                "center = "+center.getClass().getName()+",\n" +
                "right = "+right.getClass().getName()+"\n");
    }
}
