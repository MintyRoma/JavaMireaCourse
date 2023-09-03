public class Square extends Rectangle{

    public Square()
    {
        width = 0;
        length = 0;
    }

    public Square(double side)
    {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled)
    {
        if(side>=0)
        {
            this.width=side;
            this.length=side;
        }
        else {
            width=0;
            length=0;
        }
        this.color=color;
        this.filled=filled;
    }

    public double getSide()
    {
        return length;
    }

    public void setSide(double side)
    {
        if(side>=0)
        {
            width=side;
            length=side;
        }
    }

    @Override
    public void setWidth(double width) {
        if(width>=0)
        {
            this.width=width;
            this.length=width;
        }
    }

    @Override
    public void setLength(double length) {
        if(length>=0)
        {
            this.width=length;
            this.length=length;
        }
    }

    @Override
    public String toString() {
        return filled?"filled ":"unfilled "+color+" Square with side "+getSide()+" and area " + getArea() + " and perimeter "+getPerimeter();
    }
}
