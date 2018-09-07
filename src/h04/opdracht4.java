package h04;
import java.awt.*;
import java.applet.*;

public class opdracht4 extends Applet {

    public void paint(Graphics g){

        //Staafdiagram
        g.setColor(Color.blue);
        g.drawString("Valerie",30,120);
        g.fillRect(30,67,30,45);
        g.drawString("100",10,10);
        g.drawString("80",10,30);
        g.drawString("60",10,50);
        g.drawString("40",10,70);
        g.drawString("20",10,90);
        g.drawString("0",10,110);
        g.setColor(Color.red);
        g.drawString("Jeroen",70,120);
        g.fillRect(67,0,30,110);
        g.setColor(Color.green);
        g.drawString("Hans",110,120);
        g.fillRect(110,20,30,90);
    }
}
