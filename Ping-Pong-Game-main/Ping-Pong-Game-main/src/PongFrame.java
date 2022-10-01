import java.awt.*;
import javax.swing.*;
public class PongFrame extends JFrame {
    GamePanel panel;
    PongFrame(){
       panel = new GamePanel();
       this.add(panel);
       this.setResizable(false);
       this.setBackground(Color.black);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);
    }
}
