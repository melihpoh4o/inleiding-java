package h11;
import java.awt.*;
import java.applet.*;

public class opdracht1 extends  Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int x=0;


        for( int count = 0; count < 10; count++) {
            x+=20;
            g.drawLine(x,100,x,300);

        }
    }
}