package h13;
import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    int mrbt;

    public void paint(Graphics g){
        int y, x, breedte, hoogte;
        breedte = 30;
        hoogte = 30;
        y = 100 ;
        x = 35;
        mrbt = MuurRodeBakstenen(g, y,x,breedte,hoogte);
    }

    int MuurRodeBakstenen (Graphics g, int Y, int X, int Breedte, int Hoogte) {
        g.setColor(Color.red);
        g.fillRect(35,100,300,150);

        for (int kolom = 0; kolom < 10; kolom++) {
            g.setColor(Color.BLACK);
            g.drawRect(X, Y, Breedte, Hoogte);
            g.drawRect(X, Y + 60, Breedte, Hoogte);
            g.drawRect(X, Y + 120, Breedte, Hoogte);
            g.drawRect(X, Y + 30, Breedte, Hoogte);
            g.drawRect(X, Y + 90, Breedte, Hoogte);
            X += Breedte;
        }
        return mrbt;
    }
}
