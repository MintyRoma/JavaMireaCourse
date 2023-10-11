import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;

public class DogsWindow extends JFrame {

    //Components
    private JPanel dogsPanel = new JPanel();
    private JPanel dogInfoPanel = new JPanel();

    private JPanel dogListPanel = new JPanel();

    private JButton addDogBtn = new JButton("Create dog");

    private ArrayList<DogController> dogs = new ArrayList<>();


    public DogsWindow()
    {
        super("Woombledogs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        dogListPanel.setLayout(new BoxLayout(dogListPanel, BoxLayout.Y_AXIS));

        dogsPanel.setLayout(new BoxLayout(dogsPanel, BoxLayout.Y_AXIS));
        addDogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateDog();
            }
        });
        dogsPanel.add(addDogBtn,BorderLayout.AFTER_LAST_LINE);
        dogsPanel.setMinimumSize(new Dimension(200,400));
        dogsPanel.setMaximumSize(new Dimension(200,-1));
        dogsPanel.add(dogListPanel,BorderLayout.CENTER);

        add(dogsPanel,BorderLayout.WEST);
        add(dogInfoPanel, BorderLayout.CENTER);

        setMinimumSize(new Dimension(200,100));
        setVisible(true);
    }

    public void CreateDog()
    {
        if (dogs.size()<30)
        {
            dogs.add(new DogController());
            ReconstructBtnList();
            revalidate();
        }
    }

    private void ReconstructBtnList()
    {
        dogListPanel.removeAll();
        for(DogController dog: dogs)
        {
            JButton button = new JButton(dog.getName());
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ChangeDogShower(dog.getUUID());
                }
            });
            dogListPanel.add(button);
        }
    }

    private void ChangeDogShower(UUID dogUUID)
    {
        DogController controller = null;
        for (DogController dog:dogs) {
            if(dog.getUUID()==dogUUID)
            {
                controller=dog;
                break;
            }
        }
        if (controller == null) return;
        dogInfoPanel.removeAll();
        dogInfoPanel.add(controller.getView());
        revalidate();
    }
}
