package h13;
import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet {
    int drieH;

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        int x1 = 180;
        int x2 = 90;
        int x3 = 0;
        int y1 = 90;
        int y2 = 0;
        int y3 = 90;
        drieH = tekenDriehoek(g,  x1,  y1,  x2,  y2,  x3,  y3);
    }

    int tekenDriehoek(Graphics g, int X1, int Y1, int X2, int Y2, int X3, int Y3) {
        g.drawLine(X1, Y1,90 ,0 );
        g.drawLine(X2, Y2,0 ,90 );
        g.drawLine(X3, Y3,180 , 90);
        return drieH;
    }
}
