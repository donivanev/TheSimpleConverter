import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyForm {

    private JPanel panel1;
    private JButton convertButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox2;
    private JComboBox comboBox1;

    public CurrencyForm() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstCurrencyValue = Double.parseDouble(textField1.getText());
                //double secondCurrencyValue = Double.parseDouble(textField2.getText());

                double[] exchangeRateBGNtoOthers = { 0.62, 0.45, 0.51, 45.87, 5.12, 4.00, 67.53, 692.16 };
                double[] exchangeRateUSDtoOthers = { 0.72, 0.82, 73.75, 8.24, 6.43, 108.59, 1112.97 };
                double[] exchangeRateGBPtoOthers = { 1.15, 103.07, 11.51, 8.99, 151.74, 1555.32 };
                double[] exchangeRateEURtoOthers = { 89.71, 10.02, 7.82, 132.07, 1353.73 };
                double[] exchangeRateRUBtoOthers = { 0.11, 0.087, 1.47, 15.10 };
                double[] exchangeRateTRYtoOthers = { 0.78, 13.18, 135.12 };
                double[] exchangeRateCNYtoOthers = { 16.88, 173.02 };
                double exchangeRateJPYtoKRW = 10.25;

                if (comboBox1.getSelectedItem().toString() == "BGN") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText(firstCurrencyValue + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[0]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[1]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[2]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[3]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[4]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[5]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[6]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateBGNtoOthers[7]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "USD") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[0]) + ""); break;
                        case "USD" : textField2.setText(firstCurrencyValue + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[0]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[1]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[2]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[3]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[4]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[5]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateUSDtoOthers[6]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "GBP") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[1]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[0]) + ""); break;
                        case "GBP" : textField2.setText(firstCurrencyValue + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue * exchangeRateGBPtoOthers[0]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue * exchangeRateGBPtoOthers[1]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue * exchangeRateGBPtoOthers[2]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateGBPtoOthers[3]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateGBPtoOthers[4]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateGBPtoOthers[5]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "EUR") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[2]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[1]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue / exchangeRateGBPtoOthers[0]) + ""); break;
                        case "EUR" : textField2.setText(firstCurrencyValue + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue * exchangeRateEURtoOthers[0]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue * exchangeRateEURtoOthers[1]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateEURtoOthers[2]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateEURtoOthers[3]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateEURtoOthers[4]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "RUB") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[3]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[2]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue / exchangeRateGBPtoOthers[1]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue / exchangeRateEURtoOthers[0]) + ""); break;
                        case "RUB" : textField2.setText(firstCurrencyValue + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue * exchangeRateRUBtoOthers[0]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateRUBtoOthers[1]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateRUBtoOthers[2]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateRUBtoOthers[3]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "TRY") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[4]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[3]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue / exchangeRateGBPtoOthers[2]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue / exchangeRateEURtoOthers[1]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue / exchangeRateRUBtoOthers[0]) + ""); break;
                        case "TRY" : textField2.setText(firstCurrencyValue + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateTRYtoOthers[0]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateTRYtoOthers[1]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateTRYtoOthers[2]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "CNY") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[5]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[4]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue / exchangeRateGBPtoOthers[3]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue / exchangeRateEURtoOthers[2]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue / exchangeRateRUBtoOthers[1]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue / exchangeRateTRYtoOthers[0]) + ""); break;
                        case "CNY" : textField2.setText(firstCurrencyValue + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateCNYtoOthers[0]) + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateCNYtoOthers[1]) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "JPY") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[6]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[5]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue / exchangeRateGBPtoOthers[4]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue / exchangeRateEURtoOthers[3]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue / exchangeRateRUBtoOthers[2]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue / exchangeRateTRYtoOthers[1]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue / exchangeRateCNYtoOthers[0]) + ""); break;
                        case "JPY" : textField2.setText(firstCurrencyValue + ""); break;
                        case "KRW" : textField2.setText((firstCurrencyValue * exchangeRateJPYtoKRW) + ""); break;
                        default: break;
                    }
                }
                else if (comboBox1.getSelectedItem().toString() == "KRW") {
                    switch (comboBox2.getSelectedItem().toString()) {
                        case "BGN" : textField2.setText((firstCurrencyValue / exchangeRateBGNtoOthers[7]) + ""); break;
                        case "USD" : textField2.setText((firstCurrencyValue / exchangeRateUSDtoOthers[6]) + ""); break;
                        case "GBP" : textField2.setText((firstCurrencyValue / exchangeRateGBPtoOthers[5]) + ""); break;
                        case "EUR" : textField2.setText((firstCurrencyValue / exchangeRateEURtoOthers[4]) + ""); break;
                        case "RUB" : textField2.setText((firstCurrencyValue / exchangeRateRUBtoOthers[3]) + ""); break;
                        case "TRY" : textField2.setText((firstCurrencyValue / exchangeRateTRYtoOthers[2]) + ""); break;
                        case "CNY" : textField2.setText((firstCurrencyValue * exchangeRateCNYtoOthers[1]) + ""); break;
                        case "JPY" : textField2.setText((firstCurrencyValue * exchangeRateJPYtoKRW) + ""); break;
                        case "KRW" : textField2.setText(firstCurrencyValue + ""); break;
                        default: break;
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency");
        frame.setContentPane(new CurrencyForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}
