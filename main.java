package com.mycompany.casestudy;

import javax.swing.*;
import java.awt.event.*;

public class Casestudy extends JFrame implements ActionListener {
    JButton loginButton, signupButton;
    LoginForm loginForm;
    SignupForm signupForm;
    Dashboard dashboard;

    public Casestudy() {
        setTitle("Nutrition Home");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 50, 100, 40);
        loginButton.addActionListener(this);
        add(loginButton);

        signupButton = new JButton("Signup");
        signupButton.setBounds(150, 50, 100, 40);
        signupButton.addActionListener(this);
        add(signupButton);

        loginForm = new LoginForm(this);
        signupForm = new SignupForm();
        dashboard = new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            loginForm.setVisible(true);
            setVisible(false); // Hide Casestudy JFrame
        } else if (e.getSource() == signupButton) {
            signupForm.setVisible(true);
            setVisible(false); // Hide Casestudy JFrame
        }
    }

    public void showDashboard() {
        dashboard.setVisible(true);
    }

    public static void main(String[] args) {
        new Casestudy().setVisible(true);
    }
}
