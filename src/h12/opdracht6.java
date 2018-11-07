package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht6 extends Applet {
    int getallen[];
    TextField tekstvak;
    Button knop;
    int inputgetal;
    String tekst;

    @Override
    public void init() {
        knop = new Button("Ok");
        tekstvak = new TextField(5);
        add(tekstvak);
        add(knop);
        knop.addActionListener(new KnopListener());
        getallen = new int[35];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = 1;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+tekst ,150,50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            inputgetal = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = 1;
                if (inputgetal == getallen[i]){
                    tekst= "De waarde  "  + inputgetal + " " + " komt " + " " + "" + i +  " keer in de tabel." ;
                }

                if (getallen[i] < inputgetal){
                    tekst = "De waarde" + " " + inputgetal + " komt  0 keer voor in de tabel."  ;
                }
                repaint();
            }
        }
    }
}
