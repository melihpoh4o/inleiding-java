package h13;
import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    int boomM;
    int boomMB;

    @Override
    public void paint(Graphics g) {
        int y , x, breedte, hoogte;
        int YB, YB2 , XB, breedteB, hoogteB,Y2;
        breedte = 60;   breedteB = 35 ;
        y = 12 ;        YB = 60;   YB2 = 250;
        hoogte = 60;    hoogteB = 100;
        x = 40;         XB= 50 ;   Y2 = 200;
        boomM =  BoomMaken( g, y,  x,  breedte,  hoogte,  YB, XB,  breedteB,  hoogteB,YB2 ,Y2);
    }

    int BoomMaken(Graphics g,  int Y, int X, int Breedte, int Hoogte , int YB, int XB, int BreedteB, int HoogteB,
                  int YB2, int Y2) {
        //rij 1 Groen
        for (int i = 0; i < 15; i++){
            g.setColor(Color.GREEN);
           g.fillOval(X,Y,Breedte,Hoogte);
            X += Breedte;

        }
        //rij 1 Bruin
        for (int i = 0; i < 15; i++){
            g.setColor(Color.ORANGE);
            g.fillRect(XB  ,YB,BreedteB   ,HoogteB);
            XB += Breedte;
        }
        //rij 2 Bruin
        for (int i = 0; i < 15; i++){
            g.setColor(Color.ORANGE);
            XB +=Breedte;
            g.fillRect(XB  ,YB2,BreedteB   ,HoogteB);
        }
        //rij 2 Groen
        for (int i = 0; i < 15; i++){
            g.setColor(Color.GREEN);            g.fillOval(X+55 ,Y2,Breedte,Hoogte);
            X += Breedte;
        }
        return boomM;
    }





}
