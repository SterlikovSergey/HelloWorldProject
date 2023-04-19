package by.sterlikov.extrawork2;

import javax.swing.*;

public class LoginForm extends JFrame{
    private JButton button1;
    private JTextField textField1;
    private JPanel textField;
    //HelloForm helloForm  = new HelloForm(getDoctorByPlan(textField1));

    private LoginForm loginForm;



    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setTitle("This is my fist app");
        form.setContentPane(form.textField1);
        form.setSize(300,200);
        form.setResizable(false);
        form.setLocation(500,500);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);

    }

    private static String getDoctorByPlan (String plan){
        if(plan.equals("1")) return "you need to visit terapist";
        if(plan.equals("2")) return "you need to visit dontist";
        if(plan.equals("3")) return "you need to visit medic";

        return "Default";
    }
}
