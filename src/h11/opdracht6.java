package h11;
import java.awt.*;
import java.applet.*;


public class opdracht6 extends Applet {


    public  void init(){

    }

    public void paint(Graphics g){
        int x,y,w,h;
        int teller;
        x=150;
        y=100;
        w=5;
        h=10;
        for(teller = 0; teller < 5; teller++) {

            g.drawOval(x,y,w,h);
           x = x - 5 ;
            y = y - 5 ;
           w = w + 10 ;
           h = h + 10;



        }






    }


}
