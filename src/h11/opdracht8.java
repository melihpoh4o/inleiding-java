package h11;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht8 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int x, y, w, h;
        int teller;
        x = 200;
        y = 200;
        w = 20;
        h = 20;
        for (teller = 0; teller < 100; teller++) {

            g.drawOval(x, y, w, h);

            w = w + 5;
            h = h + 5;


        }







    }


}
