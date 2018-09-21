package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2 extends Applet {
    TextField Tekstvak;
    Label label;
    String s, tekst;
    int inputgetal;
    int hoogstegetal;


    public void init() {
        Tekstvak = new TextField("", 5);
        Tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        label = new Label("Typ een getal en druk op enter");
        add(label);
        add(Tekstvak);


    }


    public void paint(Graphics g) {
        g.drawString(" Hoogste getal " + hoogstegetal, 50, 55);
        g.drawString("Laagste getal" + inputgetal, 50, 75);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Tekstvak.getText();
            if (inputgetal > hoogstegetal) {
                hoogstegetal = inputgetal;
            } else {
                inputgetal = hoogstegetal;

            }
            repaint();
            inputgetal = Integer.parseInt(s);

        }
    }

}