import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerClass implements ActionListener {
    private final JTextField textField;

    public ActionListenerClass(JTextField textField){
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (textField.getText().equals("0")) {
            textField.setText(command);
        } else {
            textField.setText(textField.getText() + command);
        }
    }
}