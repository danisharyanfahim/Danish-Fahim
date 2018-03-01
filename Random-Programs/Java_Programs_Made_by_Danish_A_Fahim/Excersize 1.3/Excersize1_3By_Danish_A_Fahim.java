import hsa.*;
import java.text.DecimalFormat;
public class Declerationstatement{

    public static DecimalFormat twoPointDouble = new DecimalFormat(".##");
    public static DecimalFormat onePointDouble = new DecimalFormat(".#");
    public static DecimalFormat noPointDouble = new DecimalFormat("");
    public static void main(String[] args) {
    
	Console g = new Console();
    
	//This is excersize 1
	int maxBankAccounts = 5;
	int maxSpeedAirplane = 954;
	boolean prevJobApplication = false;
	int numPeopleInClass = 21;
	double bankAccountValue = 1893.39;
	int basketballCount = 23;
	double basketballPrice = 18.99; 
	
	//This is excersize 2
	double radius = 4.18;
	double height = 11.18;
	double volume = 3.14 * height * radius * radius;
	System.out.println("radius = " + radius + "u ,height = " + height + "u, volume = " + twoPointDouble.format(volume) + " cu. u");

	//This is excersize 3
	double x1 = 5;
	double y1 = 1;
	double x2 = -3;
	double y2 = 5;
	double slope = ((y2 - y1)/(x2 - x1));
	System.out.println("Slope of the line through (" + noPointDouble.format(x1) + ", " + noPointDouble.format(y1) + ") and (" + noPointDouble.format(y1) + ", " + noPointDouble.format(y2) + ") is " + slope);
	
	//This is excersize 4
	double test1 = 75.5;
	double test2 = 81.0;
	double test3 = 80.0;
	double averageTestMark = (test1 + test2 + test3) / 3;
	System.out.println("Average mark is " + onePointDouble.format(averageTestMark) + "%");
	
	//This is excersize 5
	int upperLeftX = 60;
	int upperLeftY = 110;
	int width = 250;  
	int height1 = 150;  //Used height1 instead of height because height is already used.
	g.drawRect(upperLeftX, upperLeftY, width, height1);
	
	
	
	
	
    }
}

