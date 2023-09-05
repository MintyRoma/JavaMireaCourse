public class MovableCircle implements Movable
{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString()
    {
        return "A movable circle with radius=" +radius +" on "+center;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
