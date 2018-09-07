package h04;

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void paint(Graphics g) {




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
