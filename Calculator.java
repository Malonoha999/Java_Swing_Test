import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Число 1:");
        JTextField field1 = new JTextField();
        JLabel label2 = new JLabel("Число 2:");
        JTextField field2 = new JTextField();
        JButton button = new JButton("Сложить");
        JLabel resultLabel = new JLabel("Результат: ");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(field1.getText());
                    double num2 = Double.parseDouble(field2.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Результат: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка ввода");
                }
            }
        });

        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(button);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
