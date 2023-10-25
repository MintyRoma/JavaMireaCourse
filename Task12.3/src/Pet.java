public class Pet extends Animal{
    protected String name;

    public Pet(Type type, String name)
    {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
