package h14;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdracht1 extends Applet {
    String[] Kleuren = {"ruiten", "harten", "schoppen", "klaveren"};
    String[] kaartenbinnenkleuren = {"2", "3", "4", "5","6", "7", "8", "9" , "10","boer", "aas", "vrouw", "heer" };
    Button knop;
    boolean kleurkaarten = false;
    boolean kleurbinnenkaarten = false;
    int simukaarten;
    int simukaartenbinen;


    @Override
    public void init() {
        knop = new Button(" Deel kaart ");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        simukaarten = SimulatieKaartenKleuren(g);
        simukaartenbinen = SimulatieBinnenKaartenKleuren(g);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleurkaarten=true;
            kleurbinnenkaarten=true;
            repaint();
        }
    }

    int SimulatieKaartenKleuren(Graphics g) {
        if (kleurkaarten){
            int rand = (int) (Math.random() * 4);
            g.drawString("" + Kleuren[rand], 50, 60);
            }
        return simukaarten;
        }

   int  SimulatieBinnenKaartenKleuren(Graphics g) {
        if (kleurbinnenkaarten){
            int rand1 = (int) (Math.random() * 13);
            g.drawString("" + kaartenbinnenkleuren[rand1],120,60);
        }
        return simukaartenbinen;
    }

    }









