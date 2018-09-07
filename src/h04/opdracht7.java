package h04;
import java.awt.*;
import java.applet.*;

public class opdracht7 extends Applet {
    public void paint(Graphics g) {

        //dobbelsteen
        g.drawRect(50,50,120,120);
        g.drawOval(80,80,10,10);
        g.drawOval(130,130,10,10);
        g.drawOval(80,130,10,10);
        g.drawOval(130,80,10,10);


    }
}
