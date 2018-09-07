package h05;
import java.applet.Applet;
import java.awt.*;


public class opdracht2 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;

    int Valerie, Jeroen, Hans;




    public void init() {
        //initialisatie
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        Valerie=40;
        Jeroen=110;
        Hans=80;




    }

    public void paint(Graphics g) {



        g.drawString("100",10,10);
        g.drawString("80",10,30);
        g.drawString("60",10,50);
        g.drawString("40",10,70);
        g.drawString("20",10,90);
        g.drawString("0",10,110);
        g.drawString("Valerie",30,120);
        g.setColor(opvulkleur);
        g.fillRect(40,110 - Valerie, 30,Valerie);
        g.setColor(Color.blue);
        g.fillRect(75,110-Jeroen,30,Jeroen);
        g.drawString("Jeroen",70,120);
        g.setColor(Color.red);
        g.fillRect(110,110-Hans,30,Hans);
        g.drawString("Hans",110,120);






































    }
}


