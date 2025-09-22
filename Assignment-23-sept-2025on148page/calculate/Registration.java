package calculate;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Registration implements ActionListener {

    JFrame frame;
    JLabel lblNames = new JLabel("Names");
    JLabel lblUserName = new JLabel("UserName");
    JLabel lblPassword = new JLabel("Password");

    JTextField txtNames = new JTextField();
    JTextField txtUserName = new JTextField();
    JPasswordField txtPassword = new JPasswordField();

    JButton btnRegister = new JButton("Register");
    JButton btnReset = new JButton("Reset");

    public Registration() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    private void createWindow() {
        frame = new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(new Color(100, 149, 237)); // blue
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    private void setLocationAndSize() {
        lblNames.setBounds(50, 30, 100, 30);
        txtNames.setBounds(160, 30, 200, 30);

        lblUserName.setBounds(50, 80, 100, 30);
        txtUserName.setBounds(160, 80, 200, 30);

        lblPassword.setBounds(50, 130, 100, 30);
        txtPassword.setBounds(160, 130, 200, 30);

        btnRegister.setBounds(100, 190, 100, 40);
        btnReset.setBounds(220, 190, 100, 40);
    }

    private void addComponentsToFrame() {
        frame.add(lblNames);
        frame.add(txtNames);

        frame.add(lblUserName);
        frame.add(txtUserName);

        frame.add(lblPassword);
        frame.add(txtPassword);

        frame.add(btnRegister);
        frame.add(btnReset);
    }

    private void addActionEvent() {
        btnRegister.addActionListener(this);
        btnReset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            String names = txtNames.getText();
            String username = txtUserName.getText();
            String password = new String(txtPassword.getPassword());

            if (names.equals("") || username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields!");
            } else {
                JOptionPane.showMessageDialog(frame, 
                    "Registered Successfully!\n" +
                    "Name: " + names + "\n" +
                    "Username: " + username);
            }
        }

        if (e.getSource() == btnReset) {
            txtNames.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
        }
    }
}
