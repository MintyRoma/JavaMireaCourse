public class Circle extends Shape{

    protected double radius;

    public Circle()
    {
        radius=0;
    }

    public Circle(double radius)
    {
        if (radius>=0)this.radius = radius;
        else this.radius=0;
    }

    public Circle(double radius, String color, boolean filled)
    {
        if (radius>=0)this.radius=radius;
        else this.radius = 0;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius>=0) this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return filled?"filled ":"unfilled "+color+" Circle with radius "+radius+" and area " + getArea() + " and perimeter "+getPerimeter();
    }
}
