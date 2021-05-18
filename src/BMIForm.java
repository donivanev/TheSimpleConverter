import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMIForm {
    private JButton button1;
    private JRadioButton imperialRadioButton;
    private JRadioButton metricRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JPanel panel1;

    public BMIForm () {
        imperialRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setEnabled(true);
                textField3.setEnabled(true);
                textField2.setEnabled(false);
                textField4.setEnabled(false);
                textField2.setText("");
                textField4.setText("");
                metricRadioButton.setSelected(false);
            }
        });
        metricRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setEnabled(true);
                textField4.setEnabled(true);
                textField1.setEnabled(false);
                textField3.setEnabled(false);
                textField1.setText("");
                textField3.setText("");
                imperialRadioButton.setSelected(false);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double BMI;

                if (imperialRadioButton.isSelected()) {
                    double imperialHeight = Double.parseDouble(textField2.getText());
                    double imperialWeight = Double.parseDouble(textField4.getText());

                    BMI = imperialWeight * Math.pow(imperialHeight * 12, 2) * 703;
                }
                else {
                    double metricHeight = Double.parseDouble(textField2.getText());
                    double metricWeight = Double.parseDouble(textField4.getText());

                    BMI = metricWeight / Math.pow(metricHeight / 100, 2);
                }

                JOptionPane.showMessageDialog(null, "Your BMI: " + BMI + "\n\n" +
                        "BMI Categories:\n" +
                        "Underweight = <18.5\n" +
                        "Normal weight = 18.5–24.9\n" +
                        "Overweight = 25–29.9\n" +
                        "Obesity = BMI of 30 or greater");
            }
        });
    }

    static void show() {
        JFrame frame = new JFrame("BMIForm1");
        frame.setContentPane(new BMIForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("BMIForm");
        frame.setContentPane(new BMIForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
