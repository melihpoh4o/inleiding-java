package h06;
import java.awt.*;
import java.applet.*;


public class opdracht3 extends Applet {
    int Cijfer1,Cijfer2,uitkomst;


    public void init(){
        Cijfer1=3;
        Cijfer2=4;
        uitkomst=Cijfer1+-Cijfer2;





    }

    public void paint(Graphics g){

        g.drawString(""+uitkomst,20,60);



    }
}
