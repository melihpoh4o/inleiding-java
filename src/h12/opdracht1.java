package h12;
import java.awt.*;
import java.applet.*;



public class opdracht1 extends Applet {
    double getallen[];
    double gemiddlede;
    double gemiddlede1;

    @Override
    public void init() {
        getallen = new  double[10];

        for (int teller = 0; teller < getallen.length; teller ++) {
            getallen[teller] = 10 * teller + 10;
            gemiddlede = getallen[teller] + getallen[teller] * 4.5   ;
            gemiddlede1 = gemiddlede / 10;
        }




    }

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);

             g.drawString(""+gemiddlede1,100,100);



        }
    }
}