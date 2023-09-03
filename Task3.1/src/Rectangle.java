public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle()
    {
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length)
    {
        if (length>=0)this.length = length;
        else this.length = 0;
        if (width>=0)this.width = width;
        else this.width=0;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        if (length>=0)this.length = length;
        else this.length = 0;
        if (width>=0)this.width = width;
        else this.width=0;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width)
    {
        if (width>=0)this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        if (length>=0) this.length=length;
    }
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return filled?"filled ":"unfilled "+color+" Rectangle with length "+length+" width "+width+" and area " + getArea() + " and perimeter "+getPerimeter();
    }
}
