import hsa.*;
import java.awt.*;
public class Exercise10part2{
    public static void main(String args[]){
	Console c = new Console();
	Console d = new Console();
	
	d.drawLine(0, (d.maxy() + 1)/2, d.maxx(), (d.maxy() + 1) / 2);
	d.drawLine((d.maxx()+ 1) / 2, 0, (d.maxx()+ 1)/2, d.maxy());
	int period = 360;
	for (int x = -1 * period; x <= period; x++){
	    double y = Math.sin(Math.toRadians(x));
	    c.print(x);
	    c.println(y, 19, 15);
	    d.setColor(Color.blue);
	    d.drawOval(x * d.maxx() / 2  / period + ((d.maxx() + 1) / 2),(int) (y * -100 + (d.maxy() + 1) / 2), 1, 1);
	}
    }
}
