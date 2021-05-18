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
    private JRadioButton ticktacktoeRadioButton1;

    public SimpleConverter()
    {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currencyConverterRadioButton.isSelected()) {
                    CurrencyForm c = new CurrencyForm();
                    c.show();
                }
                else if (temperatureConverterRadioButton.isSelected()) {
                    TemperatureForm t = new TemperatureForm();
                    t.show();
                }
                else if (metricConverterRadioButton.isSelected()) {
                    MetricForm m = new MetricForm();
                    m.show();
                }
                else if (BMICalculatorRadioButton.isSelected()) {
                    BMIForm b = new BMIForm();
                    b.show();
                }
                else if (ticktacktoeRadioButton1.isSelected()) {
                    CalculatorForm t = new CalculatorForm();
                    t.show();
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
