package h14;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class opdracht2 extends Applet {
    String[] kleuren = {"ruiten", "harten", "schoppen", "klaveren"};
    String[] kaarten = {"2", "3", "4", "5","6", "7", "8", "9" , "10","boer", "aas", "vrouw", "heer" };
    String[] deck4 = new String[13];
    String[] deck1 = new String[13];
    String[] deck2 = new String[13];
    String[] deck3 = new String[13];
    String simukaarten;
    Button knop;
    boolean kleurkaarten = false;

    public void init() {
        for (int d = 0, s=0, v = 0;  d<deck1.length ; d++ ) {
            deck1[d] = kleuren[s] + " " + kaarten[v];
            deck2[d] = kleuren[s] + " " + kaarten[v];
            deck3[d] = kleuren[s] + " " + kaarten[v];
            deck4[d] = kleuren[s] + " " + kaarten[v];
            v++;
            if (v == 13){
                v = 0;
                s++;
            }
        }
        knop = new Button(" ok ");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        simukaarten = deelKaart(g);
    }

    private String deelKaart( Graphics g) {
        for (int d = 0; d < deck1.length ; d++) {
            g.drawString(" Speler 1" , 45 , 360 );
            g.drawString(" Speler 2" , 145 , 360 );
            g.drawString(" Speler 3" , 245 , 360 );
            g.drawString(" Speler 4" , 345 , 360 );
            int random = new Random().nextInt(deck1.length );
            int random1 = new Random().nextInt(deck2.length );
            int random2 = new Random().nextInt(deck3.length );
            int random3 = new Random().nextInt(deck4.length );
            g.drawString(deck1[random],50,25 * d  + 25);
            g.drawString(deck2[random1],150,25 * d + 25);
            g.drawString(deck3[random2],250,25 * d + 25);
            g.drawString(deck4[random3],350,25 * d + 25);
        }
        return  simukaarten;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleurkaarten=true;
            repaint();
        }
    }
}
