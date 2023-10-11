import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.UUID;

public class DogController {

    private Dog model;

    private DogView view;

    public DogController()
    {
        UUID uuid = UUID.randomUUID();
        String name = uuid.toString();
        Random rnd = new Random();
        Color color = new Color(rnd.nextInt(0,255),rnd.nextInt(0,255),rnd.nextInt(0,255));
        double width, height, length;
        width = rnd.nextDouble(1,200);
        height = rnd.nextDouble(1,200);
        length = rnd.nextDouble(1,200);
        model = new Dog();
        model.setHeight(height);
        model.setLength(length);
        model.setName(name);
        model.setWidth(width);
        model.setColor(color);
        model.setUuid(uuid);
        view = new DogView();
    }

    public String getName()
    {
        return model.getName();
    }

    public Color getColor()
    {
        return model.getColor();
    }

    public UUID getUUID()
    {
        return model.getUuid();
    }

    public double getLength()
    {
        return model.getLength();
    }

    public double getWidth()
    {
        return model.getWidth();
    }

    public double getHeight()
    {
        return model.getHeight();
    }

    public JPanel getView()
    {
        return view.getPanel(model.getName(), model.getUuid(), model.getColor(), model.getWidth(), model.getHeight(), model.getLength());
    }
}
