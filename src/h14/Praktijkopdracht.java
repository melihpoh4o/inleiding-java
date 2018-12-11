package h14;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {
    Button knop;
    private URL pad;  private URL pad1;
    Image afbeelding;   Image afbeelding1;
    Label label;
    TextField tekstvak;
    String  tekst;
    double r;
    int inputgetal , rest ,   computer, worp;

    public void init() {
        knop = new Button(" spel ");
        knop.addActionListener(new KnopListener());
        computer = 0;
        rest = 23;
        tekstvak = new TextField("", 5);
        tekst = "";
        label = new Label("Hoeveel smileys neem je (één, twee of drie)?");
        add(label);
        add(tekstvak);
        add(knop);
        pad = Image.class.getResource("/resources/");
        afbeelding = getImage(pad, "smiley.jpg");
        pad1 = Image.class.getResource("/resources/");
        afbeelding1 = getImage(pad, "boos-gezicht-geschetst-emoticon-symbool_318-72032.jpg");
    }

    public void paint(Graphics g) {
        for (int i1=0; i1< 21; i1++ ){
            if (rest == 21)  {
                g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
            }
            for (int i = 0; i < 20  ; i++) {
                if ( rest == 20){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
            for (int i2 = 0; i2 < 19  ; i2++) {
                if ( rest == 19){
                    g.drawImage(afbeelding1, 50 * i2 + 25, 150, 25, 25, this);
                }
            }
        }
        for (int i3=0; i3< 18; i3++ ){
            if (rest == 18)  {
                g.drawImage(afbeelding1, 50 * i3 + 25, 150, 25, 25, this);
            }

            for (int i1 = 0; i1 < 17  ; i1++) {
                if ( rest == 17){
                    g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
                }
            }
            for (int i1 = 0; i1 < 16  ; i1++) {
                if ( rest == 16){
                    g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
                }
            }
        }
        for (int i1=0; i1< 15; i1++ ){
            if (rest == 15)  {
                g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
            }
            for (int i = 0; i < 14  ; i++) {
                if ( rest == 14){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
            for (int i = 0; i < 13  ; i++) {
                if ( rest == 13){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
        }
        for (int i1=0; i1< 12; i1++ ){
            if (rest == 12)  {
                g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
            }
            for (int i = 0; i < 11  ; i++) {
                if ( rest == 11){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
            for (int i = 0; i < 10  ; i++) {
                if ( rest == 10){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
        }
        for (int i1=0; i1< 9; i1++ ){
            if (rest == 9)  {
                g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
            }
            for (int i = 0; i < 8  ; i++) {
                if ( rest == 8){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
            for (int i = 0; i < 7  ; i++) {
                if ( rest == 7){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
        }
        for (int i1=0; i1< 6; i1++ ){
            if (rest == 6)  {
                g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
            }
            for (int i = 0; i < 5  ; i++) {
                if ( rest == 5){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
            for (int i = 0; i < 4  ; i++) {
                if ( rest == 4){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
        }
        for (int i1=0; i1< 3; i1++ ){
            if (rest == 3)  {
                g.drawImage(afbeelding1, 50 * i1 + 25, 150, 25, 25, this);
            }
            for (int i = 0; i < 3  ; i++) {
                if ( rest == 3){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
            for (int i = 0; i < 2  ; i++) {
                if ( rest == 2){
                    g.drawImage(afbeelding1, 50 * i + 25, 150, 25, 25, this);
                }
            }
        }
        if (rest==1){
            g.drawImage(afbeelding1, 50, 150, 150, 150, this);
            tekst = "Je hebt gewonnen";
            rest = 0;
        }
        if (rest == 0 || rest < 0 ){
            tekst ="Ha!!! Je hebt verloren";
            g.drawImage(afbeelding, 80   + 25, 100, 150, 150, this);
        }
        g.drawString("" + tekst, 50, 85);
        g.drawString("Aantal resterende smileys" + " " + rest + " " + "Jouw beurt", 50, 40);
        g.drawString("De computer heeft" + " " + worp + " " + "smileys weggehaald", 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            inputgetal = Integer.parseInt(s);
            repaint();
            if (rest == 23 && inputgetal == 1 || inputgetal == 2   || inputgetal == 3 ){
                r = Math.random();
                worp = (int)(r + 1 );
            }if (rest == 21 && inputgetal == 1 || rest == 17 || rest == 13 || rest == 9 || rest == 5    ){
                r = Math.random();
                worp = (int)(r + 3 );
            }if (rest == 21 && inputgetal == 2 || rest == 17 || rest == 13 || rest == 9 || rest == 5){
                r = Math.random();
                worp = (int)(r + 2 );
            } if (rest == 21 && inputgetal == 3 || rest == 17 || rest == 13 || rest == 9 || rest == 5){
                r = Math.random();
                worp = (int)(r + 3 );
            }else {
                r = Math.random();
            }
            if (inputgetal == 1 || inputgetal == 2 || inputgetal == 3) {
                rest =  rest -  worp - inputgetal ;
                tekst = "";
                repaint();
            } else {
                tekst = "Onjuiste invoer";
                repaint();
            }
        }
    }
}
