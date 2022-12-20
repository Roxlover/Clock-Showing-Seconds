import java.awt.*;
import java.util.Random;
import java.lang.Thread;
public class Clock extends Canvas{
    private Point[] clock;
    private Point[] secLoc;

    Clock() {
        clock= new Point[12];
        secLoc= new Point[60];
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Random r=new Random();
        clock = findPointsOnCircle(12, 115);
        secLoc=findPointsOnCircle(90, 90);

        g.setColor(Color.red);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(200, 200, 200, 200);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.BOLD,12));
        g.drawString(12+"", clock[0].x, clock[0].y);
        for(int i=1;i<12;i++)
            g.drawString(i+"", clock[i].x, clock[i].y);

        g2.setStroke(new BasicStroke(2));
        for(int i=0;i<60;i++){
            g.setColor(Color.BLUE);
            g.drawLine(300, 300, secLoc[i].x, secLoc[i].y);
            try{Thread.sleep(1000);}catch(Exception e){}
            g.setColor(Color.white);
            g.drawLine(300, 300, secLoc[i].x, secLoc[i].y);
        }
    }


    private Point[] findPointsOnCircle(int numOfPoints,int radius) {
        Point []points= new Point[numOfPoints];
        int x,y;
        for(int i=0;i<numOfPoints;i++){
            x=300+((int)(radius*Math.cos(-Math.toRadians(360/numOfPoints)*i+Math.PI/2)));
            y=300-((int)(radius*Math.sin(-Math.toRadians(360/numOfPoints)*i+Math.PI/2)));
            points[i]= new Point(x,y);
        }
        return points;
    }
}