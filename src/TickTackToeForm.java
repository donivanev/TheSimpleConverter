import javax.swing.*;

public class TickTackToeForm {
    private JPanel panel1;

    public TickTackToeForm() {

    }

    public void show() {
        JFrame frame = new JFrame("TickTackToe1");
        frame.setContentPane(new TickTackToeForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TickTackToe");
        frame.setContentPane(new TickTackToeForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
