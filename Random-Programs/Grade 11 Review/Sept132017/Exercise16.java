import java.awt.*;
import hsa.*;
public class Exercise16{
    public static void main(String args[]){
	Console c = new Console();
	Stdout.println("Enter the location and radius of circle 1:");
	int locationX1 = Stdin.readInt();
	int locationY1 = Stdin.readInt();
	int radius1 = Stdin.readInt();
	
	Stdout.println("Enter the location and radius of circle 2:");
	int locationX2 = Stdin.readInt();
	int locationY2 = Stdin.readInt();
	int radius2 = Stdin.readInt();
	
	double distance = Math.pow(Math.pow(locationX1 - locationX2, 2)+ Math.pow(locationY1 - locationY2, 2), 0.5);
	if (radius1 + radius2 < distance){
	    Stdout.println("Circles don't overlap");   
	}
	else{
	    Stdout.println("Circles overlap"); 
	}
	
	c.drawOval(locationX1, locationY1, radius1 * 2, radius1 * 2);
	c.setColor(Color.cyan);
	c.drawOval(locationX2, locationY2, radius2 * 2, radius2 * 2); 

    }
}
