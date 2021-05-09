import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleConverter {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JRadioButton currencyConverterRadioButton;
    private JRadioButton BMICalculatorRadioButton;
    private JRadioButton metricConverterRadioButton;
    private JRadioButton hashRadioButton;
    private JRadioButton temperatureConverterRadioButton;
    private JRadioButton rockPaperScissorsRadioButton1;

    public SimpleConverter()
    {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currencyConverterRadioButton.isSelected()) {
                    JFrame frame = new JFrame();
                    frame.setSize(600, 500);
                    frame.setVisible(true);
                    //JPanel panel = new JPanel();
                    //JTextField textField = new JTextField();
                    //frame.add(textField);

                }
                else if (temperatureConverterRadioButton.isSelected()) {

                }
                else if (metricConverterRadioButton.isSelected()) {

                }
                else if (BMICalculatorRadioButton.isSelected()) {

                }
                else if (rockPaperScissorsRadioButton1.isSelected()) {

                }
                else { //hash

                }
                //JOptionPane.showMessageDialog(null, "Hello");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("SimpleConverter");
        frame.setContentPane(new SimpleConverter().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
