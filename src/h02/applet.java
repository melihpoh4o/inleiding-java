package h02;
import java.awt.*;
import java.applet.*;


public class applet extends Applet {
    public void init() {

        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.drawString(" Melih ", 50, 60);
        g.setColor(Color.red);
        g.drawString(" Redzhebov ", 50, 80);
    }



}
