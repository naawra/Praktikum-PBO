package tugas2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JPanel implements ActionListener {
    private JTextField inputUser;
    private JPasswordField inputPass;
    private JLabel luser, lpass;
    private JButton btnSubmit;

    public Login(){
        setLayout(null);
        
        luser = new JLabel("Username:"); 
        inputUser = new JTextField();

        lpass = new JLabel("Password:");
        inputPass = new JPasswordField();

        btnSubmit = new JButton("Login");
        btnSubmit.addActionListener(this);

        // Tambahkan ke panel
        add(luser);
        add(inputUser);
        add(lpass);
        add(inputPass);
        add(btnSubmit);
        
        luser.setBounds(50, 30, 80, 20);
        inputUser.setBounds(140, 30, 150, 25);
        lpass.setBounds(50, 70, 80, 20);
        inputPass.setBounds(140, 70, 150, 25);
        btnSubmit.setBounds(160, 190, 100, 30);
    }

    public void actionPerformed(ActionEvent event){ 
        if(event.getSource() == btnSubmit){
            String username = inputUser.getText().trim();
            String password = new String(inputPass.getPassword()).trim();
        
            String validUser = "tukang_68";
            String validPass = "tukang_68";
            
            if (username.equals(validUser) && password.equals(validPass)) {
                JOptionPane.showMessageDialog(this, "Login Berhasil!");
                SwingUtilities.getWindowAncestor(this).dispose(); // Tutup window login
                new Hitung(); // Pindah ke menu hitung siku
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
