package tugas2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hitung extends JFrame implements ActionListener {
    private JTextField inputAlas, inputTinggi;
    private JButton btnHitung;
    private JLabel lblHasil, lAlas, lTinggi;

    public Hitung() {
        setTitle("Hitung Siku-Siku");
        setSize(400, 300); // ini ukuran frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        // biar framenya di tengah
        setLocationRelativeTo(null);

        // buat inputan
        inputAlas = new JTextField(10);
        inputTinggi = new JTextField(10);
        btnHitung = new JButton("Hitung");
        lblHasil = new JLabel("Sisi miring: -");

        btnHitung.addActionListener(this);

        
        add(lAlas = new JLabel("Alas:"));
        add(inputAlas);
        add(lTinggi = new JLabel("Tinggi:"));
        add(inputTinggi);
        add(btnHitung);
        add(lblHasil);
        
        // buat atur layoutny
        lAlas.setBounds(50, 30, 80, 20);
        inputAlas.setBounds(140, 30, 150, 25);
        lTinggi.setBounds(50, 70, 80, 20);
        inputTinggi.setBounds(140, 70, 150, 25);
        lblHasil.setBounds(160, 130, 100, 30);
        btnHitung.setBounds(160, 190, 100, 30);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double alas = Double.parseDouble(inputAlas.getText());
            double tinggi = Double.parseDouble(inputTinggi.getText());

            // Hitung sisi miring pakai rumus Pythagoras
            double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));

            lblHasil.setText("Sisi miring: " + String.format("%.2f", miring));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
