import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

public class Test {
    public static void main(String[] args) {
        new frame();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
class frame extends JFrame {
    frame(){
        setBounds(300,300,550,550);
        setVisible(true);
        setLayout(null);
        mypanel p = new mypanel();
        add(p);
        p.setBounds(0,0,550,550);

    }
    class mypanel extends JPanel {
        mypanel() {
            setLayout(null);
            setBackground(Color.WHITE);
            myButton b = new myButton();
            b.setBounds(250,250,150,50);
            add(b);
        }
        @Override
        public void paintComponent(Graphics g) {
            Graphics2D G = (Graphics2D) g;
            for(int i =0 ;i <= 550;i+= 50) {
                G.setColor(Color.BLUE);
                G.draw(new Line2D.Double(i, 0, i, 570));
                G.setColor(Color.MAGENTA);
                G.draw(new Line2D.Double(0,i,570,i));
            }

        }

    }
    class myButton extends JButton{
        myButton(){
            setPreferredSize(new Dimension(150,55));
        }
        @Override
        public void paintComponent(Graphics g){
            RoundRectangle2D rec = new RoundRectangle2D.Double(0,0,150,55,45,45);
            Graphics2D G = (Graphics2D) g;
            G.setColor(Color.yellow);
            G.fill(rec);
            G.draw(rec);
        }
    }
}