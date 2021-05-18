import com.sun.source.tree.Tree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

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
    private JButton powButton;
    private JButton sqrtButton;
    private JButton binButton;
    private JButton multButton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton threeButton;
    private JButton zeroButton;
    private JButton hexButton;
    private JButton eqButton;
    private Boolean isOneOperator = false;

    public void errorMessage() {
        JOptionPane.showMessageDialog(null, "Error. Division by zero.");
    }

    private void setIsOneOperatorToTrue() {
         isOneOperator = true;
    }

    private void setIsOneOperatorToFalse() {
        isOneOperator = false;
    }

    public void calculate() {

        char expression[] = textField1.getText().toCharArray();
        int firstNumber = 0, secondNumber = 0, result = 0, powerIndex = 0;
        Boolean flag = false;
        char operator = ' ';

        for (int i = expression.length - 1; i >= 0; i--) {
            if (expression[i] == '+' || expression[i] == '-' || expression[i] == '*' ||
                    expression[i] == '/' || expression[i] == '%') {
                flag = true;
                powerIndex = 0;
                operator = expression[i];
            }
            else {
                if (!flag) {
                    secondNumber += (expression[i] - '0') * Math.pow(10, powerIndex);
                    powerIndex++;
                } else {
                    firstNumber += (expression[i] - '0') * Math.pow(10, powerIndex);
                    powerIndex++;
                }
            }
        }

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    errorMessage();
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                break;
        }

        textField1.setText(result + "");
    }

    private void substituteOrSetTrue(char operator) {

        if (isOneOperator) {
            calculate();
            setIsOneOperatorToFalse();
        }
        else {
            setIsOneOperatorToTrue();
            textField1.setText(textField1.getText() + operator);
        }

    }

    public CalculatorForm() {
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("0")) {
                    textField1.setText(textField1.getText() + "");
                }
                else {
                    textField1.setText(textField1.getText() + "0");
                }
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substituteOrSetTrue('+');
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substituteOrSetTrue('-');
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substituteOrSetTrue('*');
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substituteOrSetTrue('/');
            }
        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substituteOrSetTrue('%');
            }
        });
        powButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(Math.pow(Integer.parseInt(textField1.getText()), 2) + "");
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(Math.sqrt(Integer.parseInt(textField1.getText())) + "");
            }
        });
        binButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < textField1.getText().length(); i++) {

                }

                textField1.setText("");
            }
        });
        hexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        eqButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                setIsOneOperatorToFalse();
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
