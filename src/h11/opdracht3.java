package h11;
import java.awt.*;
import java.applet.*;


public class opdracht3 extends Applet {
    int a;
    int b;
    int totaal;

    public void init() {
        a=0;
        b=1;

    }

    public void paint(Graphics g) {
        int teller,x;
        for(teller = 0; teller < 10; teller++) {


            }
            x = 50;
            x = x+50;

        a=b;
        b=totaal;
        totaal=a+b;



        g.drawString(""+totaal,x,50);

        }


    }

