package h04;

import java.awt.*;
import java.applet.*;

public class applet extends Applet {

    public void paint(Graphics g) {
        //Huis met deur en raam
        g.drawLine(180, 90, 90 ,0);
        g.drawLine(90, 0, 0, 90);
        g.drawLine(0, 90, 180, 90);
        g.drawRect(0, 90, 180, 180);
        g.drawRect(100,120,70,50);
        g.drawRect(30,200,40,70);

        //Nederlandse vlag aan een  vlaggenstok
        g.drawRect(20,30,10,150);
        g.setColor(Color.red);
        g.fillRect(30,30,100,50);
        g.setColor(Color.white);
        g.fillRect(30,60,100,50);
        g.setColor(Color.blue);
        g.fillRect(30,90,100,40);

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

        //ellips
        g.setColor(Color.yellow);
        g.fillArc(40,40,100,50,90,360);
        setBackground(Color.blue );

        //stoplicht
        g.drawRect(60,60,50,150);
        g.setColor( Color.red);
        g.fillOval(60,60,50,50);
        g.setColor(Color.orange);
        g.fillOval(60,110,50,50);
        g.setColor(Color.green);
        g.fillOval(60,160,50,50);

        //dobbelsteen
        g.drawRect(50,50,120,120);
        g.drawOval(80,80,10,10);
        g.drawOval(130,130,10,10);
        g.drawOval(80,130,10,10);
        g.drawOval(130,80,10,10);

        //Praktijkopdracht
        g.drawString("Lijn", 50, 45);
        g.drawLine(20, 30, 110, 30);
        g.drawString("Rechthoek", 35, 115);
        g.drawRect(20, 50, 90, 50);
        g.drawString("Afgeronde Rechthoek",20,180);
        g.drawRoundRect(20,120,90,50,30,30);
        g.drawString("Gevulde Rechthoek met ovaal",120,115);
        g.setColor(Color.magenta);
        g.fillRect(160,50,90,50);
        g.setColor(Color.black);
        g.drawOval(160,50,90,50);
        g.drawString("Gevulde  ovaal",160,180);
        g.setColor(Color.magenta);
        g.fillOval(160,120,90,50);
        g.setColor(Color.BLACK);
        g.drawString("Cirkel",310,180);
        g.drawOval(300,120,50,50);
        g.setColor(Color.magenta);
        g.fillArc(280,50,90,50,0,45);
        g.drawOval(280, 50, 90, 50);
        g.drawString("Taartpunt met ovaal eromheen",290,115);

    }

}
