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

    public MyBestLogin() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCredential(loginField1.getText(), passwordField.getText());
                    JOptionPane.showMessageDialog(MyBestLogin.this, "Login and password are correct");
                } catch (WrongLoginException ex) {
                    JOptionPane.showMessageDialog(MyBestLogin.this, "Oops something bad with login");

                } catch (WrongPasswordException ex) {
                    JOptionPane.showMessageDialog(MyBestLogin.this, "Oops something bad with password");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(MyBestLogin.this, "Access denied");

                }
            }
        });
    }

    public static void main(String[] args) {
        MyBestLogin form = new MyBestLogin();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.panel);
        form.setSize(250, 120);
        form.setResizable(false);
        form.setLocation(500, 300);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }

    private static boolean checkCredential(String login, String password) throws Exception {
        String correctlogin = "Super";
        String correctPassword = "Puper";

        if (login.length() < 3) throw new WrongLoginException("Login is short");

        if (password.length() < 3) throw new WrongPasswordException("Password is short");

        if (login.equals(correctlogin) && password.equals(correctPassword)) ;

        throw new Exception("Login or password are incorrect!");

    }
}
