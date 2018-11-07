package h12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    int teller;
    String[] namen;
    String[] telefoonnummers;
    TextField textFieldnam;
    TextField textFieldtel;
    Button knop;
    String tekst,tekst1;

    public void init() {
        teller = 0;
        namen = new String[3];
        telefoonnummers = new String[3];
        textFieldnam = new TextField("", 15);
        textFieldtel = new TextField("", 15);
        knop=new Button(" ok ");
        knop.addActionListener(new KnopListener());
        add(textFieldnam);
        add(textFieldtel);
        add(knop);
        tekst="";
        tekst1="";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst,50,45 );
        g.drawString(tekst1,200,45 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           tekst = textFieldnam.getText();
           tekst1 = textFieldtel.getText();
            teller++;
            repaint();

        }
    }
}
