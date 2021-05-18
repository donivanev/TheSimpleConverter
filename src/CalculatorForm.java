import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm {
    private JPanel panel1;
    private JTextField textField1;
    private JButton plusButton;
    private JButton fourButton;
    private JButton minusButton;
    private JButton fiveButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton clearButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton divButton;
    private JButton modButton;
    private JButton xButton;
    private JButton sqrtButton;
    private JButton binButton;
    private JButton multButton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton threeButton;
    private JButton zeroButton;
    private JButton hexButton;
    private JButton eqButton;

    public CalculatorForm() {
        eqButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void show() {
        JFrame frame = new JFrame("TickTackToe1");
        frame.setContentPane(new CalculatorForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TickTackToe");
        frame.setContentPane(new CalculatorForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
