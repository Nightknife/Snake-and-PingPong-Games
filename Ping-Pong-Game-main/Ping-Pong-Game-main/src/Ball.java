import java.awt.*;
import java.util.*;
public class Ball extends Rectangle{
    Random random;
    int XVelocity;
    int YVelocitty;
    Ball(int x,int y,int width,int height){
        super(x,y,width,height);
        random = new Random();
        int i = 6;
        int randomXDirection= (6);
        if(randomXDirection==0)
            randomXDirection--;
        setXDirection(randomXDirection);
        int randomYDirection= random.nextInt(6);
        if(randomYDirection==0)
            randomYDirection--;
        setYDirection(randomYDirection);
    }
    public  void setXDirection(int randomXDirection){
            XVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
            YVelocitty = randomYDirection;
    }
    public void move(){
       x+=XVelocity;
       y+=YVelocitty;
    }
    public void draw(Graphics g){
         g.setColor(Color.white);
         g.fillOval(x,y,height,width);
    }
}
