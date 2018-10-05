package h11;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht5 extends Applet {
    public void init(){

    }

    public void paint(Graphics g){
        int x,y,w,h;
        x=20;
        y=40;
        w=50;
        h=50;

        int teller;



        for(teller = 0; teller < 5; teller++) {
            g.drawRect(x,y,w,h);
            x = x + w ;
            y = y + h ;








        }

    }


}
