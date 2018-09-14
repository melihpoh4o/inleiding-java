package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class opdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    Button reset;
    Button knop;
    String s;


    public void init(){
        tekstvak = new TextField("", 30);
        label = new Label("Type iets in het tekstvak " +
                "en druk op ok");
        reset=new Button("reset");
        reset.addActionListener(new KnopListener2());
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(label);
        add(tekstvak);
        add(knop);
        add(reset);
        s = "";




    }
     public void paint(Graphics g){
         g.drawString(s, 100, 80 );

     }

     class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
     }

     class KnopListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");
            repaint();
        }
     }


}
