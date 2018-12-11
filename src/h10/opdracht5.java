package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht5 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    String d, tekst1;
    double cijfer;
    double cijfer1;
    Button knop;
    double inputgetal;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Type een cijfer druk op enter  ");
        knop = new Button(" * ");
        knop.addActionListener(new KnopListener());
        s = "";
        tekst = "";
        tekst1 = "";
        cijfer1 = 5.5;
        add(tekstvak);
        add(label);
        add(knop);


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 150);
        g.drawString(tekst1, 50, 200);


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer > cijfer1) {
                tekst = "" + "voldoende";
            } else {
                tekst = "" + "onvoldoende";
            }
            repaint();

        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputgetal = Double.parseDouble(s);
            if (inputgetal > cijfer1)
                tekst1 = "geslaagd";
            else{
                tekst1="gezakt";
            }repaint();

        }


    }
}