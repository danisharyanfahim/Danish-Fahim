import hsa.*;
import java.text.DecimalFormat;
public class VolumeOfCylinder{
    public static DecimalFormat twoPointDouble = new DecimalFormat(".##");
    public static void main(String[] args) {
	
	//This is excersize 2
	double radius = 4.18;
	double height = 11.18;
	double volume = 3.14 * height * radius * radius;
	System.out.println("radius = " + radius + "u ,height = " + height + "u, volume = " + twoPointDouble.format(volume) + " cu. u");

    }
}

