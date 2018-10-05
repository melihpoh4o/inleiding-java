package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Praktijkopdracht extends Applet {
    Button leesteken;
    TextField tekstvak;
    TextField Tekstvak;
    Button leesteken1;
    Button leesteken2;
    Button leesteken3;
    double getal1;
    double getal2;
    double totaal;


    public void init() {
        leesteken=new Button(" * ");
        leesteken.addActionListener(new KnopListener());
        leesteken1=new Button(" / ");
        leesteken2=new Button("+");
        leesteken3=new Button("-");
        leesteken3.addActionListener(new KnopListener3());
        leesteken2.addActionListener(new KnopListener2());
        leesteken1.addActionListener(new KnopListener1());
        tekstvak = new TextField(" ", 10);
        Tekstvak = new TextField(" ", 10);
        tekstvak.addActionListener( new tekstvakListener() );
        Tekstvak.addActionListener( new TekstvakListener1() );
        add(tekstvak);
        add(Tekstvak);
        add(leesteken);
        add(leesteken1);
        add(leesteken2);
        add(leesteken3);

    }

    public void paint(Graphics g) {
        g.drawString("Totaal ="+totaal,20,50);

    }





    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s=tekstvak.getText();
            getal1=Double.parseDouble( s );
            repaint();

        }
    }

    class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s=Tekstvak.getText();
            getal2=Double.parseDouble( s );
            repaint();
        }
    }





    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal=getal1*getal2;
            repaint();

        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal=getal1/getal2;
            repaint();

        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal=getal1+getal2;
            repaint();

        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal=getal1-getal2;
            repaint();

        }
    }




}
