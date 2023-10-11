public class Employee {

    private int id;
    private String name;
    private double hourRate;

    private int hours;

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public double getHourRate()
    {
        return hourRate;
    }

    public int getHours()
    {
        return hours;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setHourRate(double hourRate)
    {
        this.hourRate = hourRate;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }
}
