package h04;
import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet {

    public void paint(Graphics g) {
        //Nederlandse vlag aan een  vlaggenstok
        g.drawRect(20,30,10,150);
        g.setColor(Color.red);
        g.fillRect(30,30,100,50);
        g.setColor(Color.white);
        g.fillRect(30,60,100,50);
        g.setColor(Color.blue);
        g.fillRect(30,90,100,40);


    }

}
