package h05;
import java.applet.Applet;
import java.awt.*;


public class variabelen extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int Valerie, Jeroen, Hans;




    public void init() {
        //initialisatie
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte = 50;
        Valerie=40;
        Jeroen=100;
        Hans=80;




    }

    public void paint(Graphics g) {
        //teken rechthoek
        g.drawRect(0,40,breedte,hoogte);
        g.drawString("Rechthoek",20,105);

        //teken lijn
        g.drawLine(0,20,breedte,20);
        g.drawString("Lijn",40,35);

        //Afgeronde rechthoek
        g.drawRoundRect(0,110,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",0,175);

        //Gevulde Rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(120,40,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(120,40,breedte,hoogte);
        g.drawString("Rechthoek met ovaal",110,100);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(120,110,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",130,170);

        //cirkel
        g.drawOval(265,110,50,50);
        g.drawString("Cirkel",270,175);

        //Taartpunt met ovaal eromheen
        g.drawOval(240,40,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(240,40,100,50,0,45);

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


