package h11;
import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 20;
        int y = 10;

        while (teller < 21) {
            y += 25;
            g.drawLine(50, y, 300, y);
            g.drawString("" + teller, 305, y);
            teller--;
        }
    }

}


