import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatBot extends JFrame {
    final String TITLE_OF_PROGRAMM = "Chatter: simple chatbot";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HIGHT = 450;
    JTextArea dialoge;
    JCheckBox ai;
    JTextField message;

    //SimpleBot sbot;
    public static void main(String[] args) {
        new SimpleChatBot();
    }

    SimpleChatBot() {
        setTitle(TITLE_OF_PROGRAMM);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HIGHT);
        setVisible(true);
        dialoge = new JTextArea();
        dialoge.setLineWrap(true);
        JScrollPane scrollBar = new JScrollPane(dialoge);
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        ai = new JCheckBox("AI");
        // ai.doClick();
        message = new JTextField();
        // message.addActionListener(this);
        JButton enter = new JButton("Enter");
        // enter.addActionListener(this);
        bp.add(ai);
        bp.add(message);
        bp.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);

    }
}
