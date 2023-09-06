import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Soccer extends JFrame {

    private boolean is1latest = false;

    private int team1Score = 0;
    private int team2Score = 0;

    private JButton team1Btn = new JButton("AC Milan");
    private JButton team2Btn = new JButton("Real Madrid");

    private JLabel scorringLbl = new JLabel("Result 0X0");

    private JLabel lastScoreLbl = new JLabel("Last Scorer: N/A");

    private JLabel winnerLbl = new JLabel("Winner: DRAW");

    private JPanel buttonsPanel = new JPanel();
    private JPanel statPanel = new JPanel();

    private Font btnFont = new Font("Segoe UI",400,24);
    private Font infoFont = new Font("Segoe UI", 400, 18);
    private Font winerFont = new Font("Segoe UI", 600, 36);
    public Soccer()
    {
        super("Soccer");
        setSize(500,500);
        setBackground(Color.BLACK);

        team1Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team1Score++;
                is1latest = true;
                CheckScore();
            }
        });
        team2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team2Score++;
                is1latest=false;
                CheckScore();
            }
        });

        buttonsPanel.add(team1Btn, BorderLayout.EAST);
        buttonsPanel.add(team2Btn, BorderLayout.WEST);
        buttonsPanel.setBackground(Color.BLACK);

        scorringLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        lastScoreLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        winnerLbl.setAlignmentX(Component.CENTER_ALIGNMENT);

        team1Btn.setBackground(Color.WHITE);
        team2Btn.setBackground(Color.WHITE);
        team1Btn.setFont(btnFont);
        team2Btn.setFont(btnFont);

        scorringLbl.setFont(infoFont);
        lastScoreLbl.setFont(infoFont);
        winnerLbl.setFont(winerFont);
        scorringLbl.setForeground(Color.WHITE);
        lastScoreLbl.setForeground(Color.WHITE);
        winnerLbl.setForeground(Color.WHITE);

        statPanel.setLayout(new BoxLayout(statPanel, BoxLayout.Y_AXIS));
        statPanel.add(scorringLbl);
        statPanel.add(lastScoreLbl);
        statPanel.add(winnerLbl);
        statPanel.setBackground(Color.BLACK);

        add(buttonsPanel, BorderLayout.CENTER);
        add(statPanel, BorderLayout.SOUTH);
        setMinimumSize(new Dimension(200,100));
        setVisible(true);
    }

    private void CheckScore() {
        scorringLbl.setText("Result "+team1Score+"X"+team2Score);
        lastScoreLbl.setText("Last Scorer: " + (is1latest?"AC Milan":"Real Madrid"));
        if (team1Score!=team2Score)
        {
            winnerLbl.setText("Winner: "+(team1Score>team2Score?"AC Milan":"Real Madrid"));
        }
        else {
            winnerLbl.setText("Winner: DRAW");
        }

    }
}
