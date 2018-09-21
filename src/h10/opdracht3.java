package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(tekstvak);


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari 31 dagen";
                    break;
                case 2:
                    tekst = "Febeuari 28 dagen" ;
                    break;
                case 3:
                    tekst = "Maart 31 dagen" ;
                    break;
                case 4:
                    tekst = "April 30 dagen" ;
                    break;
                case 5:
                    tekst = "Mei 31 dagen" ;
                    break;
                case 6:
                    tekst = "Juni 30 dagen" ;
                    break;
                case 7:
                    tekst = "Juli 31 dagen" ;
                    break;
                case 8:
                    tekst = "Augustus 31 dage " ;
                    break;
                case 9:
                    tekst = "September 30 dagen" ;
                    break;
                case 10:
                    tekst = "Oktober 31 dagen";
                    break;
                case 11:
                    tekst = "November 30 dagen" ;
                    break;
                case 12:
                    tekst = "December 31 dagen" ;
                    break;

                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;

            }
            repaint();
        }
    }


}



