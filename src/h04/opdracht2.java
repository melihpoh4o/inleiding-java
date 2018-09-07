package h04;
import java.awt.*;
import java.applet.*;


public class opdracht2 extends Applet {

    public void paint(Graphics g) {
        //Huis met deur en raam
        g.drawLine(180, 90, 90 ,0);
        g.drawLine(90, 0, 0, 90);
        g.drawLine(0, 90, 180, 90);
        g.drawRect(0, 90, 180, 180);
        g.drawRect(100,120,70,50);
        g.drawRect(30,200,40,70);
    }


}
