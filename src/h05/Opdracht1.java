package h05;
import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte = 50;


    }

    public void paint(Graphics g){
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


    }
}
