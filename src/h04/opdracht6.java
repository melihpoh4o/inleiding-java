package h04;
import java.awt.*;
import java.applet.*;


public class opdracht6 extends Applet {

    public void paint(Graphics g){

        //stoplicht
        g.drawRect(60,60,50,150);
        g.setColor( Color.red);
        g.fillOval(60,60,50,50);
        g.setColor(Color.orange);
        g.fillOval(60,110,50,50);
        g.setColor(Color.green);
        g.fillOval(60,160,50,50);
    }
}
