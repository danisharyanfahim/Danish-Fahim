public class Exercise2{
    public static void main(String args[]){
	String c = "cat";
	String d = "dog";
	String s = c;
	c = d;
	d = s;
	System.out.println("c is " + c);
	System.out.println("d is " + d);
    }
}
