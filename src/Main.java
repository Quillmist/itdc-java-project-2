import javax.swing.*;

public class Main {
    private JPanel mainPanel;
    private JList roomList;
    private JTextField roomNameText;
    private JTextArea roomDescriptionText;
    private JButton addRoomButton;
    private JButton removeRoomButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("План здания");
        frame.setContentPane(new Main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
