package h06;
import java.awt.*;
import java.applet.*;


public class praktijkopdracht extends Applet {


    double cijfer1,cijfer2,cijfer3;
    double cijftot;
    double cijfz;
    double cijfx;


    public void init(){






        cijfer1=5.9;
        cijfer2=6.3;
        cijfer3=6.9;
        cijftot = (cijfer1 + cijfer2 + cijfer3) /3;

        cijfz = (double) cijftot * (int) 10;
        cijfx = (int) cijfz / (double) 10;



    }

    public void paint(Graphics g) {

        g.drawString(""+cijftot,20,20);




        g.drawString("Het gemiddelde is "+cijfx,20,60);







       }
}

