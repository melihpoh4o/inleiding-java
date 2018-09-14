package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht3 extends Applet {
    Button getal5;
    TextField tekstvak;
    Label label;
    double getal;
    double btw;

    public void init() {
        getal5=new Button("ok");
        getal5.addActionListener(new KnopListener());
        tekstvak = new TextField(" ", 20);
        label = new Label("Vul een bedrag in");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        add(getal5);


    }

    public void paint(Graphics g) {
        g.drawString("Bedrag inclusief btw "+ btw, 50, 60);


    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btw=getal*1.21;
            repaint();





        }
    }

}