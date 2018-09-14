package h08;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class opdracht2 extends Applet {
    Button mannelijke;
    Button vrouwlijke;
    Button mannelijke2;
    Button vrouwelijke2;
    int ml;
    int vl;
    int pm;
    int pv;
    int totaal;



    public void init() {
        totaal=0 + totaal;
        mannelijke=new Button("Man ");
        mannelijke.addActionListener(new KnopListener());
        vrouwlijke=new Button("Vrouw ");
        vrouwlijke.addActionListener(new KnopListener2());
        mannelijke2=new Button("Man(leerlingen)?");
        mannelijke2.addActionListener(new KnopListener3());
        vrouwelijke2=new Button("vrouw(leerlingen)?");
        vrouwelijke2.addActionListener(new KnopListener4());
        add(mannelijke);
        add(vrouwlijke);
        add(mannelijke2);
        add(vrouwelijke2);


    }

    public void paint(Graphics g) {
        g.drawString("Mannenlijke Bezoekers"+ml, 50, 60 );
        g.drawString("Vrouwlijke bezoekers"+vl, 50, 80 );
        g.drawString("potentiële mannelijke leerlingen"+pm, 50, 100 );
        g.drawString("potentiële   leerlingen"+pv, 50, 120 );
        g.drawString("Totaal"+totaal, 50, 140 );

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
             ml= 0+ ml;
             ml++;
             totaal++;
             repaint();





        }
    }


    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vl= 0 +vl;
            vl++;
            totaal++;
            repaint();

        }
    }



    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pm=0+pm;
            pm++;
            totaal++;
            repaint();

        }
    }



    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pv=0+pv;
            pv++;
            totaal++;
            repaint();

        }


    }


}



