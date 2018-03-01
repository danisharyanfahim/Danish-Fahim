public class Exercise5{
	public static void main(String args[]){
		System.out.println(distanceBetweenTwoPoints(1,5,25,36));	
	}
	
	public static double distanceBetweenTwoPoints(int x1,
			     			      int y1,
			     			      int x2,
			     			      int y2){
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
}