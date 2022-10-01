import javax.swing.*;

public class gameframe extends JFrame {
    gameframe(){
        this.add(new gamepanel());
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
