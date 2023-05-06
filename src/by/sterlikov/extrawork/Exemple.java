package by.sterlikov.extrawork;

import javax.swing.*;

public class Exemple extends JFrame {
    private JButton okButton;
    private JTextField textField1;
    private JPasswordField passwordField1;

    private JLabel panel;
    private JPanel panel1;

    public static void main(String[] args) {
        Exemple form = new Exemple();
        form.setTitle("This is my fist window");
        form.setContentPane(form.panel1);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
