package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht1 extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int inputgetal;
    int hoogstegetal;


    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        label = new Label("Typ een getal en druk op enter");
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(" Hoogste getal " + hoogstegetal, 50, 55);

    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            if (inputgetal > hoogstegetal) {
                hoogstegetal=inputgetal;
            }
            else {

            }
            repaint();
             inputgetal = Integer.parseInt(s);
        }
    }




}






