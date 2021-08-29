import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    JFrame logIn = new JFrame("Log in");
    JLabel l1 = new JLabel("Password");
    JLabel l2 = new JLabel("Username");
    JTextField userName = new JTextField();
    JPasswordField password = new JPasswordField("Password");
    JButton submitBtn = new JButton("Submit");

    Main() {
        logIn.setLocationRelativeTo(null);
        logIn.setLayout(null);
        logIn.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        logIn.setSize(500, 200);
        logIn.add(l1);
        logIn.add(password);
        logIn.add(l2);
        logIn.add(userName);
        logIn.add(submitBtn);
        logIn.setVisible(true);


        l1.setBounds(15, 20, 100, 20);
        l2.setBounds(15, 50, 100, 20);
        userName.setBounds(100, 50, 150, 20);
        password.setBounds(100, 20, 150, 20);
        submitBtn.setBounds(100, 100, 150, 20);


        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userText = userName.getText();
                String passText = password.getText();

                System.out.println(userText + passText);

                if (passText.equals("Kobe24") && userText.equals("Kobe123")) {

                    logIn.dispose();

                    JOptionPane.showMessageDialog(null, "Welcome", "Successful Login",
                            JOptionPane.INFORMATION_MESSAGE);

                    ImageIcon icon = new ImageIcon("kobe.jpg");
                    JLabel l1 = new JLabel();
                    l1.setIcon(icon);

                    JFrame succesLog = new JFrame("Welcome to the Page");
                    succesLog.setSize(300,400);
                    succesLog.add(l1);
                    succesLog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Log in Falls", "Error Log in",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

    }


    public static void main(String[] args) {

        Main main = new Main();


    }
}
