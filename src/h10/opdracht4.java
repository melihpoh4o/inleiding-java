package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht4 extends  Applet {
    TextField tekstvak;
    TextField Tekstvak;
    Label label1;
    Label label;
    String s, tekst;
    String s1, Tekst;
    int maand;
    int dag;
    int Februari;


    public void init() {
        tekstvak = new TextField("", 50);
        Tekstvak = new TextField("", 50);
        label = new Label("Typ een maand een druk enter");
        tekstvak.addActionListener(new TekstvakListener());
        Tekstvak.addActionListener(new TekstvakListener1());
        label1 = new Label("Type een jaar en druk op enter  ");
        tekst = "";
        Tekst = "";
        add(tekstvak);
        add(Tekstvak);
        add(label);
        add(label1);
        s = "";
        Februari = 29;

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 120);
        g.drawString(Tekst, 50, 120);

    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari 31 dagen";
                    break;
                case 2:
                    tekst = "Februari" + Februari + "dagen";
                    break;
                case 3:
                    tekst = "Maart 31 dagen";
                    break;
                case 4:
                    tekst = "April 30 dagen";
                    break;
                case 5:
                    tekst = "Mei 31 dagen";
                    break;
                case 6:
                    tekst = "Juni 30 dagen";
                    break;
                case 7:
                    tekst = "Juli 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus 31 dagen ";
                    break;
                case 9:
                    tekst = "September 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober 31 dagen";
                    break;
                case 11:
                    tekst = "November 30 dagen";
                    break;
                case 12:
                    tekst = "December 31 dagen";
                    break;


            }

        }
    }


    class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = Tekstvak.getText();
            dag = Integer.parseInt( s1);
            if ( (dag % 4 == 0 && !(dag % 100 == 0)) ||
                    dag % 400 == 0 ) {
                tekst = ""+ dag + " is een schrikkeljaar Dus Februari heeft  " + Februari+"dagen"   ;
            }
            else {
                tekst = ""+ dag + " is geen schrikkeljaar";
            }
            repaint();



        }

    }
}



