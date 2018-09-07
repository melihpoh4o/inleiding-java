package h06;
import java.awt.*;
import java.applet.*;


public class opdracht2 extends Applet {
    int SecondeUur,SecondeDag,Secondejaar,uitkomstUur,uitkomstDag,uitkomstJaar,SecondeMin;



    public void init(){

        SecondeMin=60;
        SecondeUur=3600;
        SecondeDag=86400;
        Secondejaar=31536000;
        uitkomstUur=SecondeMin*60;
        uitkomstDag=SecondeUur*24;
        uitkomstJaar=SecondeDag*365;


    }


    public void paint(Graphics g){

        g.drawString("Seconde in 1 uur = " +uitkomstUur,20,20);
        g.drawString("Seconde in 1 dag = "+uitkomstDag,20,40);
        g.drawString("Seconde in 1 Jaar ="+uitkomstJaar,20,60);



    }
}
