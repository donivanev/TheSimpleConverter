import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureForm {

    private JPanel panel1;
    private JButton convertButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public TemperatureForm() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedTempScale = comboBox1.getSelectedItem().toString();
                String expectedTempScale = comboBox2.getSelectedItem().toString();
                double selectedValue = Double.parseDouble(textField1.getText());

                if (selectedTempScale == "°C") {
                    if (expectedTempScale == "°C") {
                        textField2.setText(selectedValue + "");
                    }
                    else if (expectedTempScale == "°F") {
                        textField2.setText(1.8 * selectedValue + 32 + "");
                    }
                    else if (expectedTempScale == "°K") {
                        textField2.setText(selectedValue + 273.15 + "");
                    }
                    else if (expectedTempScale == "°R") {
                        textField2.setText((selectedValue + 273.15) * 9 / 5 + "");
                    }
                }
                else if (selectedTempScale == "°F") {
                    if (expectedTempScale == "°C") {
                        textField2.setText((selectedValue - 32) / 1.8 + "");
                    }
                    else if (expectedTempScale == "°F") {
                        textField2.setText(selectedValue + "");
                    }
                    else if (expectedTempScale == "°K") {
                        textField2.setText((selectedValue + 459.67) * 5 / 9 + "");
                    }
                    else if (expectedTempScale == "°R") {
                        textField2.setText(selectedValue + 459.67 + "");
                    }
                }
                else if (selectedTempScale == "°K") {
                    if (expectedTempScale == "°C") {
                        textField2.setText(selectedValue - 273.15 + "");
                    }
                    else if (expectedTempScale == "°F") {
                        textField2.setText(selectedValue * 1.8 - 459.67 + "");
                    }
                    else if (expectedTempScale == "°K") {
                        textField2.setText(selectedValue + "");
                    }
                    else if (expectedTempScale == "°R") {
                        textField2.setText(selectedValue * 1.8 + "");
                    }
                }
                else if (selectedTempScale == "°R") {
                    if (expectedTempScale == "°C") {
                        textField2.setText((selectedValue - 491.67) * 5 / 9 + "");
                    }
                    else if (expectedTempScale == "°F") {
                        textField2.setText(selectedValue - 459.67 + "");
                    }
                    else if (expectedTempScale == "°K") {
                        textField2.setText(selectedValue * 5 / 9 + "");
                    }
                    else if (expectedTempScale == "°R") {
                        textField2.setText(selectedValue + "");
                    }
                }
            }
        });
    }

    public void show() {
        JFrame frame = new JFrame("Temperature1");
        frame.setContentPane(new TemperatureForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature");
        frame.setContentPane(new TemperatureForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
