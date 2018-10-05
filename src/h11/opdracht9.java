package h11;
import java.awt.*;
import java.applet.*;

public class opdracht9 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int y, x, breedte, hoogte;
        breedte = 30;
        hoogte = 30;
        y = 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;

        }

        //tweede rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //derde rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;


        }

        //vierde rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        //vijfde  rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        //zesde rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        //zevende  rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.drawRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }

        //achtste rij
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.drawRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
    }



}





















