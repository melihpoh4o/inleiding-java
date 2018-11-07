package h13;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {
    int mrbt;
    int mrgb;
    Button knopRM;
    Button knopB;
    boolean RodeMuur = false;
    boolean ZwarteMuur = false;

    @Override
    public void init() {
        knopRM = new Button(" Rode Muur ");
        knopRM.addActionListener(new KnopListener());
        add(knopRM);
        knopB = new Button(" Grijze Betonblokken ");
        knopB.addActionListener(new KnopListener1());
        add(knopB);
    }

    @Override
    public void paint(Graphics g) {
        int y, x, breedte, hoogte;
        breedte = 30;
        hoogte = 30;
        y = 100;
        x = 35;
        mrbt = MuurRodeBakstenen(g, y, x, breedte, hoogte);

        int y1, x1, breedte1, hoogte1;
        breedte1 = 40;
        hoogte1 = 40;
        y1 = 100;
        x1 = 35;
        mrgb = MuurGijzeBetonblokken(g, y1, x1, breedte1, hoogte1);
    }

      class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            RodeMuur=true;
            repaint();
            }
        }

   int MuurRodeBakstenen(Graphics g, int Y, int X, int Breedte, int Hoogte) {
        if (RodeMuur){
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
             }
        return mrbt;
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ZwarteMuur=true;
            repaint();
        }
    }

    int MuurGijzeBetonblokken(Graphics g, int Y1,int X1,int Breedte1,int Hoogte1) {
        if (ZwarteMuur) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(35, 100, 400, 160);
            for (int kolom = 0; kolom < 10; kolom++) {
                g.setColor(Color.BLACK);
                g.drawRect(X1, Y1, Breedte1, Hoogte1);
                g.drawRect(X1, Y1 + 60, Breedte1, Hoogte1);
                g.drawRect(X1, Y1 + 120, Breedte1, Hoogte1);
                g.drawRect(X1, Y1 + 30, Breedte1, Hoogte1);
                g.drawRect(X1, Y1 + 90, Breedte1, Hoogte1);
                X1 += Breedte1;
            }
        }
        return mrgb;
    }
}