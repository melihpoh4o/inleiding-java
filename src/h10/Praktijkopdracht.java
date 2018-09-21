package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    Label label;
    String s, tekst;
    String  tekst1;
    String tekst2;
    String tekst3;
    String tekst4;
    String tekst5;
    double cijfer;
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double cijfer4;
    double cijfer5;
    double hoogstegetal;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak1 = new TextField("", 5);
        tekstvak2 = new TextField("", 5);
        tekstvak3 = new TextField("", 5);
        tekstvak4 = new TextField("", 5);
        tekstvak5 = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak.addActionListener(new TekstvakListener1());
        tekstvak.addActionListener(new TekstvakListener2());
        tekstvak.addActionListener(new TekstvakListener3());
        tekstvak.addActionListener(new TekstvakListener4());
        tekstvak.addActionListener(new TekstvakListener5());
        label = new Label("Type een cijfer druk op enter  ");
        s = "";
        tekst = "";
        add(tekstvak);
        add(label);
        cijfer = 3;
        cijfer1 = 0;
        cijfer2 = 4;
        cijfer3 = 5;
        cijfer4=7;
        cijfer5=11;
        hoogstegetal=11;


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 150);
        g.drawString(tekst1, 50, 100);
        g.drawString(tekst2, 50, 100);
        g.drawString(tekst3, 50, 100);
        g.drawString(tekst4, 50, 100);
        g.drawString(tekst5, 50, 100);



    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);
            if (cijfer > cijfer1) {
                tekst = "slecht";
            }
            repaint();


        }
    }

    class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer2 = Double.parseDouble(s);
            if (cijfer2 > 3 ) {
                tekst = "onvoldoende";
            }
            repaint();
        }
    }


    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer3 = Double.parseDouble(s);
            if (cijfer3 > 4 ) {
                tekst = "matig";
            }
            repaint();
        }
    }

    class TekstvakListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer4 = Double.parseDouble(s);
            if (cijfer4> 5  ) {
                tekst = "voldoende";
            }
            repaint();
        }
    }
    class TekstvakListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer4 = Double.parseDouble(s);
            if (cijfer4 > 7  ) {
                tekst = "goed";
            }
            repaint();
        }
    }
    class TekstvakListener5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer5 = Double.parseDouble(s);
            if (cijfer5 > 10  ) {
                tekst = "Er is een verkeerd cijfer is ingevoerd.";
            }
            repaint();
        }
    }


}


