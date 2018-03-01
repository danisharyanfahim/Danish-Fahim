import hsa.*;
public class Exercise4{
	public static void main(String args[]){
		int userNumber = Stdin.readInt();
		short newUserNumber = (short) userNumber;
		Stdout.println(newUserNumber);
		
		Stdout.println("Please input a number with both a whole number and a fractional part.");
		double newNumber = Stdin.readDouble();
		int numberPart = (int) newNumber;
		double fractionPart = newNumber - (int) (newNumber);
		Stdout.println(numberPart);
		Stdout.println(fractionPart, 0, 3);
		
		short a = Stdin.readShort();
		char b = (char) a;
		Stdout.println(b);
	}
}

/*import  hsa.*;
public class Exercise3{
	public static void main(String args[]){
		Console c = new Console();
		Stdout.println("Please insert 2 numbers:");
		int x = Stdin.readInt();
		int y = Stdin.readInt();
		Stdout.println("Please print 2 more numbers");
		int width = Stdin.readInt();
		int height = Stdin.readInt();
		c.drawRect(x, y, width, height);
	}
}

import hsa.*;
import java.awt.*;
public class Exercise5{
	public static void main(String args[]){
		Console c = new Console();
		c.setColor(Color.blue);
		c.drawRect(c.maxx()/4, c.maxy()/4, c.maxx()/2, c.maxy()/2);
		c.setColor(Color.red);
		c.drawOval(c.maxx()/4, c.maxy()/4, c.maxx()/2, c.maxy()/2);
		c.setColor(Color.yellow);
		c.drawLine(0, 0, c.maxx(), c.maxy());
		c.setColor(Color.yellow);
		c.drawLine(0, c.maxy(), c.maxx(), 0);
	}
}*/

