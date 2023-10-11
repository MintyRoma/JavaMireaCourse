import javax.swing.*;
import java.awt.*;
import java.util.UUID;

public class DogView {

    public JPanel getPanel(String name, UUID id, Color color, double width, double height, double lenght)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField nameTxtField = new JTextField(name);
        JLabel uuidLabel = new JLabel("UUID: "+ id.toString());
        JLabel colordesc = new JLabel("Color");
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(color);
        colorPanel.setMinimumSize(new Dimension(100,100));
        JLabel widthLabel = new JLabel("Width: "+ width);
        JLabel heightLabel = new JLabel("Height: "+ height);
        JLabel lengthLabel = new JLabel("Length: "+ lenght);

        panel.add(nameTxtField);
        panel.add(uuidLabel);
        panel.add(colordesc);
        panel.add(colorPanel);
        panel.add(widthLabel);
        panel.add(heightLabel);
        panel.add(lengthLabel);
        return panel;
    }

}
