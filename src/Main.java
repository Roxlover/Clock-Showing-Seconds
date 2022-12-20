import java.awt.*;
import javax.swing.*;

class Main {
    public static void main(String[] args) {
        Clock m=new Clock();
        JFrame f=new JFrame("My Drawing");
        f.add(m);
        f.getContentPane().setBackground(Color.white);
        f.setSize(600,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}