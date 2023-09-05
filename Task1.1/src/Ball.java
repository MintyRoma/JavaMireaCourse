public class Ball {

    private int diameter;
    private String material;

    private double atmosphere;

    private String vendor;

    public Ball(int diameter, String material, double atmospehere, String vendor)
    {
        this.diameter = diameter;
        this.material = material;
        this.atmosphere = atmospehere;
        this.vendor = vendor;
    }

    public void Blowaway(double decrease_gas)
    {
        if (decrease_gas>atmosphere) atmosphere=0;
        else atmosphere-=decrease_gas;
    }

    public void Inflate(double increase_gas)
    {
        atmosphere+=increase_gas;
    }

    public String toString()
    {
        return "A ball from "+vendor+" made with "+material+" and diameter="+diameter+" have "+atmosphere+"bar of gas";
    }

    public String getVendor()
    {
        return vendor;
    }

    public String getMaterial()
    {
        return material;
    }

    public double getAtmosphere()
    {
        return atmosphere;
    }

    public int getDiameter()
    {
        return diameter;
    }

}
