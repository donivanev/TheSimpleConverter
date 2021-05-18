import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricForm {
    private JPanel panel1;
    private JButton convertButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public MetricForm() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textField1.getText());
                String selectedValue = comboBox1.getSelectedItem().toString();
                String expectedValue = comboBox2.getSelectedItem().toString();

                if (selectedValue == "mm") { //miles issue
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value + ""); break;
                        case "cm" : textField2.setText(value / 10 + ""); break;
                        case "m" : textField2.setText(value / 1000 + ""); break;
                        case "km" : textField2.setText(value / 1000000 + ""); break;
                        case "in" : textField2.setText(value * 0.03937007874 + ""); break;
                        case "ft" : textField2.setText(value * 0.00328084 + ""); break;
                        case "yd" : textField2.setText(value * 0.0010936133 + ""); break;
                        case "mi" : textField2.setText(value * 6.21371192 * Math.pow(10, -7) + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "cm") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 10 + ""); break;
                        case "cm" : textField2.setText(value + ""); break;
                        case "m" : textField2.setText(value / 100 + ""); break;
                        case "km" : textField2.setText(value / 100000 + ""); break;
                        case "in" : textField2.setText(value * 0.393700787 + ""); break;
                        case "ft" : textField2.setText(value / 30.48 + ""); break;
                        case "yd" : textField2.setText(value * 0.010936133 + ""); break;
                        case "mi" : textField2.setText(value * 6.21371192 * Math.pow(10, -6) + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "m") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 1000 + ""); break;
                        case "cm" : textField2.setText(value * 100 + ""); break;
                        case "m" : textField2.setText(value + ""); break;
                        case "km" : textField2.setText(value / 1000 + ""); break;
                        case "in" : textField2.setText(value * 39.3700787 + ""); break;
                        case "ft" : textField2.setText(value * 3.2808399 + ""); break;
                        case "yd" : textField2.setText(value * 1.0936133 + ""); break;
                        case "mi" : textField2.setText(value * 0.000621371192 + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "km") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 1000000 + ""); break;
                        case "cm" : textField2.setText(value * 100000 + ""); break;
                        case "m" : textField2.setText(value * 1000 + ""); break;
                        case "km" : textField2.setText(value + ""); break;
                        case "in" : textField2.setText(value * 39370.0787 + ""); break;
                        case "ft" : textField2.setText(value * 3280.8399 + ""); break;
                        case "yd" : textField2.setText(value * 1093.6133 + ""); break;
                        case "mi" : textField2.setText(value * 0.621371192 + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "in") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 25.4 + ""); break;
                        case "cm" : textField2.setText(value * 2.54 + ""); break;
                        case "m" : textField2.setText(value * 0.0254 + ""); break;
                        case "km" : textField2.setText(value * 0.0000254 + ""); break;
                        case "in" : textField2.setText(value + ""); break;
                        case "ft" : textField2.setText(value / 12 + ""); break;
                        case "yd" : textField2.setText(value / 36 + ""); break;
                        case "mi" : textField2.setText(value / 63360 + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "ft") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 304.8 + ""); break;
                        case "cm" : textField2.setText(value * 30.48 + ""); break;
                        case "m" : textField2.setText(value * 0.3048 + ""); break;
                        case "km" : textField2.setText(value * 0.0003048 + ""); break;
                        case "in" : textField2.setText(value * 12 + ""); break;
                        case "ft" : textField2.setText(value + ""); break;
                        case "yd" : textField2.setText(value / 3 + ""); break;
                        case "mi" : textField2.setText(value / 5280 + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "yd") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 914.4 + ""); break;
                        case "cm" : textField2.setText(value * 91.44 + ""); break;
                        case "m" : textField2.setText(value * 0.9144 + ""); break;
                        case "km" : textField2.setText(value * 0.000914 + ""); break;
                        case "in" : textField2.setText(value * 36 + ""); break;
                        case "ft" : textField2.setText(value * 3 + ""); break;
                        case "yd" : textField2.setText(value + ""); break;
                        case "mi" : textField2.setText(value / 1760 + ""); break;
                        default: break;
                    }
                }
                else if (selectedValue == "mi") {
                    switch (expectedValue) {
                        case "mm" : textField2.setText(value * 1609344 + ""); break;
                        case "cm" : textField2.setText(value * 160934.4 + ""); break;
                        case "m" : textField2.setText(value * 1609.344 + ""); break;
                        case "km" : textField2.setText(value * 1.609344 + ""); break;
                        case "in" : textField2.setText(value * 63360 + ""); break;
                        case "ft" : textField2.setText(value * 5280 + ""); break;
                        case "yd" : textField2.setText(value * 1760 + ""); break;
                        case "mi" : textField2.setText(value + ""); break;
                        default: break;
                    }
                }
            }
        });
    }

    public void show() {
        JFrame frame = new JFrame("MetricForm1");
        frame.setContentPane(new MetricForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MetricForm");
        frame.setContentPane(new MetricForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
