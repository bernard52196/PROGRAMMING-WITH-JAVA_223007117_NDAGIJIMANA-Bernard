package calculate;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculate implements ActionListener {

    JFrame frame;
    JLabel lblAmount = new JLabel("Amount requested");
    JLabel lblDuration = new JLabel("Duration (year)");
    JLabel lblTotal = new JLabel("Total to return");

    JTextField txtAmount = new JTextField();
    JTextField txtDuration = new JTextField();
    JTextField txtTotal = new JTextField();

    JButton btnCalculate = new JButton("Calculate");

    public Calculate() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    private void createWindow() {
        frame = new JFrame();
        frame.setTitle("Loan Calculator");
        frame.setBounds(100, 100, 400, 250);
        frame.getContentPane().setBackground(new Color(100, 149, 237)); // light blue
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    private void setLocationAndSize() {
        lblAmount.setBounds(30, 20, 120, 30);
        txtAmount.setBounds(160, 20, 180, 30);

        lblDuration.setBounds(30, 60, 120, 30);
        txtDuration.setBounds(160, 60, 180, 30);

        lblTotal.setBounds(30, 100, 120, 30);
        txtTotal.setBounds(160, 100, 180, 30);
        txtTotal.setEditable(false); 

        btnCalculate.setBounds(100, 150, 180, 40);
    }

    private void addComponentsToFrame() {
        frame.add(lblAmount);
        frame.add(txtAmount);
        frame.add(lblDuration);
        frame.add(txtDuration);
        frame.add(lblTotal);
        frame.add(txtTotal);
        frame.add(btnCalculate);
    }

    private void addActionEvent() {
        btnCalculate.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String amountStr = txtAmount.getText();
        String durationStr = txtDuration.getText();

        if (amountStr.equals("") || durationStr.equals("")) {
            txtTotal.setText("Enter both values!");
            return;
        }

        double amount = Double.parseDouble(amountStr);
        int years = Integer.parseInt(durationStr);


        double interestRate = 0.006;
        double total = amount + (amount * interestRate * years);

        txtTotal.setText(String.format("%.0f", total));
    }
}