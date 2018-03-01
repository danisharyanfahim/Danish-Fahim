import hsa.*;
import java.text.DecimalFormat;
public class AverageMark{
    public static DecimalFormat onePointDouble = new DecimalFormat(".#");
    public static void main(String[] args) {

	//This is excersize 4
	double test1 = 75.5;
	double test2 = 81.0;
	double test3 = 80.0;
	double averageTestMark = (test1 + test2 + test3) / 3;
	System.out.println("Average mark is " + onePointDouble.format(averageTestMark) + "%");  
	
    }
}

