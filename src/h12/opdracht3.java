package h12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class opdracht3 extends Applet {
    TextField[] textField;
    Button knop;
    ArrayList<Integer> count = new ArrayList<>();


    @Override
    public void init() {
        knop=new Button(" Sorteer ");
        knop.addActionListener(new KnopListener());
        textField = new  TextField[5];
        for (int i = 0; i < 5 ; i++) {
            textField[i]= new TextField("",5);
            add(textField[i]);
        }
        add(knop);





    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            count.clear();
            for (int j = 0; j < 5 ; j++) {
                int i1 = Integer.parseInt(textField[j].getText());
                count.add(i1);
            }
            Collections.sort(count);
            for (int i2 = 0; i2 < 5 ; i2++) {
                textField[i2].setText(""+count.get(i2));

           }


        }
    }

}