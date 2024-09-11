import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;

    public Calculator() {

        super("Calculator Swing");


        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH);
        add(setBody(), BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 500);
        setResizable(false);
        setVisible(true);
    }

    JPanel setTop() {
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEditable(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);

        return top;
    }

    JPanel setBody() {
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(5, 4));


        ActionListener click = new ActionListenerClass(textField);

        JButton clear = new JButton("C");

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        JButton backspace = new JButton("Backs");
        // use anonymous interface -> YOUR TASK

        JButton pow = new JButton("**");
        // use anonymous interface -> make POW, YOUR TASK

        JButton minus = new JButton("-");
        minus.addActionListener(click);

        body.add(clear);
        body.add(backspace);
        body.add(pow);
        body.add(minus);

        for (int counter = 9; counter >= 0; counter--) {
            JButton btn = new JButton(String.valueOf(counter));
            btn.addActionListener(click);
            body.add(btn);
        }

        JButton addition = new JButton("+");
        addition.addActionListener(click);
        JButton division = new JButton("/");
        division.addActionListener(click);
        JButton multiply = new JButton("*");
        multiply.addActionListener(click);
        JButton dot = new JButton(".");
        dot.addActionListener(click);
        JButton equals = new JButton("=");

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = textField.getText();
                String result = evaluateExpression(expression);
                textField.setText(result);
            }
        });

        JButton modus = new JButton("%");
        modus.addActionListener(click);

        body.add(addition);
        body.add(division);
        body.add(multiply);
        body.add(modus);
        body.add(dot);
        body.add(equals);

        return body;
    }

    private String evaluateExpression(String expression) {
        if (expression.contains("+")) {
            String[] splitSum = expression.split("\\+");
            double sumResult = Double.parseDouble(splitSum[0].trim()) + Double.parseDouble(splitSum[1].trim());
            return Double.toString(sumResult);
        } else if (expression.contains("-")) {
            String[] splitSub = expression.split("-");
            double subResult = Double.parseDouble(splitSub[0].trim()) - Double.parseDouble(splitSub[1].trim());
            return Double.toString(subResult);
        } else if (expression.contains("*")) {
            String[] splitMult = expression.split("\\*");
            double multResult = Double.parseDouble(splitMult[0].trim()) * Double.parseDouble(splitMult[1].trim());
            return Double.toString(multResult);
        } else if (expression.contains("/")) {
            String[] splitDiv = expression.split("/");
            double divResult = Double.parseDouble(splitDiv[0].trim()) / Double.parseDouble(splitDiv[1].trim());
            return Double.toString(divResult);
        }

        return "Error";
    }
}
