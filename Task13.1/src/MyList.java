public class MyList<E> {
    private int size;
    private Object[] elements;
    public MyList() {
        elements = new Object[10];
        size = 0;
    }
    public void add(E e) {
        if (size < elements.length) { elements[size] = e;
        } else {
            int multiplier = (size / 10)+2;
            Object[] migration = new Object[10*multiplier];
            for (int i =0; i< size; i++) migration[i] = elements[i];
            elements = migration;
        }
        ++size;
    }
    public E get(int index) {
        if (index >= size || index<0)
            throw new IndexOutOfBoundsException("Index:" + index + ", Size: " + size);
        return (E)elements[index];
    }
    public int size() { return size; }

    public void fromArray(Object[] array)
    {
        size = array.length;
        elements = new Object[size];
        for (int i=0;i<size;i++)
        {
            elements[i]=array[i];
        }
    }
}