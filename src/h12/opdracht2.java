package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht2 extends Applet {
     Button[] buttons = new Button[25];

    @Override
    public void init() {

        for (int i = 0; i < buttons.length ; i++) {
            buttons[i] = new Button("" + i);
        }

        for (int i = 0; i < buttons.length ; i++) {
            add(buttons[i]);
        }



    }

    @Override
    public void paint(Graphics g) {


        }



    }











