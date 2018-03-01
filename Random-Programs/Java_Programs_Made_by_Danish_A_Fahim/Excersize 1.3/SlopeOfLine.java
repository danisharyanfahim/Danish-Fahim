import hsa.*;
import java.text.DecimalFormat;
public class SlopeOfLine{
    public static DecimalFormat noPointDouble = new DecimalFormat("");
    public static void main(String[] args) {

	//This is excersize 3
	double x1 = 5;
	double y1 = 1;
	double x2 = -3;
	double y2 = 5;
	double slope = ((y2 - y1)/(x2 - x1));
	System.out.println("Slope of the line through (" + noPointDouble.format(x1) + ", " + noPointDouble.format(y1) + ") and (" + noPointDouble.format(y1) + ", " + noPointDouble.format(y2) + ") is " + slope);

    }
}

