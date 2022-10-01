import java.awt.*;
import java.awt.event.*;
public class Paddle extends Rectangle {
    int id;
    int YVelocity;
    int speed = 10;
    Paddle(int x,int y,int PADDLE_WIDTH,int PADDLE_HEIGHT,int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }
    public void keyPressed(KeyEvent e){
           switch (id){
               case 1:
                   if(e.getKeyCode()==KeyEvent.VK_W){
                       setYDrection(-speed);
                       move();
                   }
                   if(e.getKeyCode()==KeyEvent.VK_S){
                       setYDrection(speed);
                       move();
                   }
                   break;
               case 2:
                   if(e.getKeyCode()==KeyEvent.VK_P){
                       setYDrection(-speed);
                       move();
                   }
                   if(e.getKeyCode()==KeyEvent.VK_SEMICOLON){
                       setYDrection(speed);
                       move();
                   }
                   break;
           }
    }
    public void keyRealeased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDrection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDrection(0);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_P) {
                    setYDrection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
                    setYDrection(0);
                    move();
                }
                break;
        }
    }
    public void setYDrection(int yDrection){
          YVelocity=yDrection;
    }
    public  void move(){
         y=y+YVelocity;
    }
    public void draw (Graphics g){
        if (id==1)
            g.setColor(Color.blue);
            else
                g.setColor(Color.red);
            g.fillRect(x,y,width,height);
    }
}
