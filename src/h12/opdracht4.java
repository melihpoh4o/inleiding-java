package h12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht4 extends Applet {
    int getallen[];
    TextField tekstvak;
    Button knop;
    int inputgetal;
    String tekst;

    @Override
    public void init() {
        knop = new Button("ok");
        tekstvak = new TextField(5);
        add(tekstvak);
        add(knop);
        knop.addActionListener(new KnopListener());
        getallen = new int[35];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = 1 * i + 1;
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i], 50, 20 * i + 20);
        }
        g.drawString(""+tekst ,150,50);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            inputgetal = Integer.parseInt( s );
            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = 1 * i + 1;
                if (inputgetal == getallen[i]){
                    tekst = " De index is  " + getallen[i];
                }

                if (inputgetal > 35 ){
                    tekst = "De waarde is niet gevonden";
                }
            }
            repaint();
        }


    }


}