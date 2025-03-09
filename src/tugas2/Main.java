
package tugas2;
import javax.swing.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Aplikasi Hitung");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // biar masuk ke framenya
        add(new Login());
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
