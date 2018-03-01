public class Statistic{
    private int mean = 0;
    private int maximum = 0;

    public Statistic(){
	mean = 0;
	maximum = 0;    
    }
    
    public Statistic(int a, int b, int c, int d){
	mean = (a + b + c + d)/4;
	if (a > b && a > c && a > d){
	    maximum = a;
	}
	else if(b > a && b > c && b > d){
	    maximum = b;
	}
	else if(c > a && c > b && c > d){
	    maximum = c;
	}
	else if(d > a && d > b && d > c){
	    maximum = d;
	}
    }
    
    public int getMean(){
	return mean;
    }
    
    public int getMaximum(){
	return maximum;
    } 
}
