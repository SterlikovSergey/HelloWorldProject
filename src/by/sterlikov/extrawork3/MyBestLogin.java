package by.sterlikov.extrawork3;

import by.sterlikov.classwork.lesson11.WrongLoginException;
import by.sterlikov.classwork.lesson11.WrongPasswordException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBestLogin extends JFrame {
    private JPanel panel;
    private JTextField loginField1;
    private JPasswordField passwordField;
    private JButton button1;
    private JPasswordField passwordField1;

    public MyBestLogin() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCredential(loginField1.getText(), passwordField.getText(), passwordField1.getText());
                    JOptionPane.showMessageDialog(MyBestLogin.this, "All are correct");
                } catch (WrongLoginException ex) {
                    JOptionPane.showMessageDialog(MyBestLogin.this, ex.getMessage());
                } catch (WrongPasswordException ex) {
                    JOptionPane.showMessageDialog(MyBestLogin.this, ex.getMessage());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(MyBestLogin.this, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        MyBestLogin form = new MyBestLogin();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.panel);
        form.setSize(250, 200);
        form.setResizable(false);
        form.setLocation(500, 300);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }

    private static boolean checkCredential(String login, String password, String confirmPassword) throws Exception {
        if (login.length() > 20) throw new WrongLoginException("login must not be longer than 20 characters");
        if (login.contains(" ")) throw new WrongLoginException("login must not contain a space");
        if (password.length() > 20) throw new WrongPasswordException("Password must not be longer than 20 characters");
        if (password.contains(" ")) throw new WrongPasswordException("Password must not contain a space");
        if ((password.codePoints().filter(Character::isDigit).count() < 1))
            throw new WrongPasswordException("Password must contain numbers");
        if (confirmPassword.equals(password)) {
            return true;
        }
        throw new Exception("Passwords do not match");
    }
}
