import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    private JFrame frame;
    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textFieldResult;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private JPanel panel;
    private Scanner scanner;

    public Calculator() {
        frame = new JFrame("Calculator");

        textField1 = new JTextField(1);
        textField1.setBackground(Color.DARK_GRAY);
        textField1.setFont(new Font("Arial", Font.BOLD, 20));
        textField1.setForeground(Color.WHITE);

        textField2 = new JTextField(1);
        textField2.setBackground(Color.DARK_GRAY);
        textField2.setFont(new Font("Arial", Font.BOLD, 20));
        textField2.setForeground(Color.WHITE);

        buttonAdd = new JButton("+");
        buttonAdd.setBackground(Color.DARK_GRAY);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
        buttonAdd.setForeground(Color.WHITE);

        buttonSubtract = new JButton("-");
        buttonSubtract.setBackground(Color.DARK_GRAY);
        buttonSubtract.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSubtract.setForeground(Color.WHITE);

        buttonMultiply = new JButton("*");
        buttonMultiply.setBackground(Color.DARK_GRAY);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMultiply.setForeground(Color.WHITE);

        buttonDivide = new JButton("/");
        buttonDivide.setBackground(Color.DARK_GRAY);
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDivide.setForeground(Color.WHITE);

        textFieldResult = new JTextField(2);
        textFieldResult.setBackground(Color.DARK_GRAY);
        textFieldResult.setFont(new Font("Arial", Font.BOLD, 20));
        textFieldResult.setForeground(Color.WHITE);
        textFieldResult.setEditable(false); // make the result field non-editable

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(textField1);
        panel.add(textField2);
        panel.add(buttonAdd);
        panel.add(buttonSubtract);
        panel.add(buttonMultiply);
        panel.add(buttonDivide);
        panel.add(textFieldResult);
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        scanner = new Scanner(System.in);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = calculate(number1, number2, "+");
                textFieldResult.setText("REZULTAT: " + String.valueOf(result));
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = calculate(number1, number2, "-");
                textFieldResult.setText("REZULTAT: " + String.valueOf(result));
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = calculate(number1, number2, "*");
                textFieldResult.setText("REZULTAT: " + String.valueOf(result));
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = calculate(number1, number2, "/");
                textFieldResult.setText("REZULTAT: " + String.valueOf(result));
            }
        });
    }

    public static void main(String[] args) {
        try {
            // Create a new Calculator object
            Calculator calculator = new Calculator();
            // Set the frame to be visible
            calculator.frame.setVisible(true);
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    calculator.frame.setVisible(true);
                    textField1.setText("");
                    textField2.setText("");
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public double calculate(double num1, double num2, String operation) {
        // Check the value of the "operation" argument and perform the corresponding calculation
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        } else if (operation.equals("/")) {
            return num1 / num2;
        } else {
            // If the operation is invalid, return 0
            return 0;
        }
    }
}
