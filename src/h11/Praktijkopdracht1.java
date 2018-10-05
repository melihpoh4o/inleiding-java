package h11;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    String s;



    public void init() {
        tekstvak = new TextField(" ", 20);
        label = new Label("");
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        int teller;
        int number, y, y5, y2, y3, y4, y6, y7, y8, y9;
        int numberT6, numberT2, numberT3, numberT4, numberT5, number7, number8, number9, number10;
        int
                y1 = 40;
        y5 = 40;
        y = 40;
        y2 = 40;
        y3 = 40;
        y4 = 40;
        y6 = 40;
        y7 = 40;
        y8 = 40;
        y9 = 40;
        numberT2 = 0;
        numberT6 = 0;
        number = 0;
        numberT3 = 0;
        numberT4 = 0;
        numberT5 = 0;
        number7 = 0;
        number8 = 0;
        number9 = 0;
        number10 = 0;


        for (teller = 0; teller < 10; teller++) {
            number = number + 1;
            y = y + 40;
            g.drawString(" 1 " + " x " + number + "  = " + number, 50, y);

            numberT2 = numberT2 + 2;
            y1 = y1 + 40;
            g.drawString(" 2 " + " x " + number + " = " + numberT2, 250, y1);


            numberT3 = numberT3 + 3;
            y2 = y2 + 40;
            g.drawString(" 3 " + "x" + number + " = " + numberT3, 450, y2);

            numberT4 = numberT4 + 4;
            y3 = y3 + 40;
            g.drawString(" 4 " + "x" + number + " = " + numberT4, 650, y3);

            numberT5 = numberT5 + 5;
            y4 = y4 + 40;
            g.drawString(" 5 " + "x " + number + " = " + numberT5, 850, y4);


            numberT6 = numberT6 + 6;
            y5 = y5 + 40;
            g.drawString(" 6 " + "x " + number + " = " + numberT6, 1050, y5);

            number7 = number7 + 7;
            y6 = y6 + 40;
            g.drawString(" 7 " + "x " + number + " = " + number7, 1250, y6);

            number8 = number8 + 8;
            y7 = y7 + 40;
            g.drawString(" 8 " + "x " + number + " = " + number8, 1450, y7);


            number9 = number9 + 9;
            y8 = y8 + 40;
            g.drawString(" 9 " + "x " + number + " = " + number9, 1650, y8);


            number10 = number10 + 10;
            y9 = y9 + 40;
            g.drawString(" 10 " + "x " + number + " = " + number10, 1850, y9);


        }


    }


}















































