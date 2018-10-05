package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2 extends Applet {
    TextField Tekstvak;
    Label label;
    String s, tekst;
    int hoogstegetal;
    int laagstegetal;



    public void init() {

        laagstegetal=Integer.MAX_VALUE;
        hoogstegetal=Integer.MIN_VALUE;
        Tekstvak = new TextField("", 5);
        Tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        label = new Label("Typ een getal en druk op enter");
        add(label);
        add(Tekstvak);


    }


    public void paint(Graphics g) {
        if (hoogstegetal> Integer.MIN_VALUE){
            g.drawString(" Hoogste getal " + hoogstegetal, 50, 55);
            g.drawString("Laagste getal" + laagstegetal, 50, 75);
        }

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Tekstvak.getText();
            int invoer=Integer.parseInt(s);
            if (invoer > hoogstegetal) {
                hoogstegetal = invoer;
            }
            if (invoer < laagstegetal){
                laagstegetal  =invoer;
            }
            repaint();


        }
    }

}