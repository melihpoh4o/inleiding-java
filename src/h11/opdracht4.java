package h11;
import java.awt.*;
import java.applet.*;

public class opdracht4 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String s;
       


    public void init(){

    }

    public void paint(Graphics g) {
        int teller;
        int number, y;
        y = 50;
        number = 0;

        for(teller = 0; teller < 10; teller++) {
            number = number + 3 ;
            y = y +50;
            g.drawString(""+number,50,y);


        }

    }

}

