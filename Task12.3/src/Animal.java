public class Animal {

    public enum Type
    {
        Dog,
        Cat,
        Horse,
        Fish
    }

    protected Type selected;

    public Animal(Type type)
    {
        selected = type;
    }

    public Type getSelected() {
        return selected;
    }
}
