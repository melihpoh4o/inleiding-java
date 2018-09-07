package h06;
import java.awt.*;
import java.applet.*;

public class opdracht1 extends Applet {
    double gemiddelde, a,b,c;




    public void init (){
        a=113;
        b =1;
        c=4;
        gemiddelde=(a/b) /c;






        }

        public void paint(Graphics g){
            g.drawString("Jan krijgt:"+gemiddelde,20,20);
            g.drawString("Jeannete krijgt:"+gemiddelde,20,40);
            g.drawString("Ali krijgt:"+gemiddelde,20,60);
            g.drawString("Ik krijg:"+gemiddelde,20,80);





    }

}
