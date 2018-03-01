import hsa.*;
public class Methods_2
{
    public static void main (String[] args)
    {
	/*address ();
	contactInfo ();
	multipleFactors (1, 5, 10);
	xor (false, true);
	analyticGeometryMenu ();*/
	generateCode (30);
	reversal ("FUCK");
    }


    public static void address ()
    {
	Stdout.println ("Peter Jones");
	Stdout.println ("100 Greenwood Avenue");
	Stdout.println ("Toronto, Ontario");
	Stdout.println ("M4J 4B7");
	Stdout.println ("--------------------");
    }


    public static void contactInfo ()
    {
	Stdout.println ("647-683-4234");
	Stdout.println ("647-683-4675");
	Stdout.println ("76 Park View North");
	Stdout.println ("http://www.WhatsUpJerk.com");
    }


    public static boolean multipleFactors (int p, int q, int r)
    {
	boolean factored = false;
	if (q % p == 0 && r % q == 0)
	{
	    factored = true;
	}
	Stdout.println (factored);
	return factored;
    }


    public static boolean xor (boolean p, boolean q)
    {
	boolean XOR = false;
	if ((p == true || q == true) && (p != q))
	{
	    XOR = true;
	}
	Stdout.println (XOR);
	return XOR;
    }


    public static int analyticGeometryMenu ()
    {
	Stdout.println ("Analytic Geometry Menu:");
	Stdout.println ("");
	Stdout.println ("1. Midpoint between two points");
	Stdout.println ("2. Distance between two points");
	Stdout.println ("3. Equation of a line");
	Stdout.println ("4. Quit");
	Stdout.println ("");
	Stdout.println ("Enter an option: ");

	int option = Stdin.readInt ();

	switch (option)
	{
	    case 1:
		Stdout.println ("You have chosen option 1");
		break;
	    case 2:
		Stdout.println ("You have chosen option 2");
		break;
	    case 3:
		Stdout.println ("You have chosen option 3");
		break;
	    case 4:
		Stdout.println ("You have chosen option 4");
		break;
	    default:
		Stdout.println ("...You have not chosen a valid option...");
		break;
	}
	if (option == 2)
	{
	    Stdout.print ("x1: ");
	    int x1 = Stdin.readInt ();
	    Stdout.print ("y1: ");
	    int y1 = Stdin.readInt ();
	    Stdout.print ("x2: ");
	    int x2 = Stdin.readInt ();
	    Stdout.print ("y2: ");
	    int y2 = Stdin.readInt ();

	    distanceBetweenTwoPoints (x1, y1, x2, y2);
	}
	return option;
    }


    public static double distanceBetweenTwoPoints (int x1, int y1, int x2, int y2)
    {
	double distanceBetweenTwoPoints = Math.pow (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2), 0.5);
	Stdout.println ("The distance between points (" + x1 + ", " + y1 + ") and points (" + x2 + ", " + y2 + ") is " + distanceBetweenTwoPoints + " units.");
	return distanceBetweenTwoPoints;
    }


    public static String generateCode (int size)
    {
	String newString = "No value";
	for (int i = 0 ; i <= size ; i++)
	{
	    String numberString = Integer.toString ((int) (Math.random () * 10));
	    if (i == 0)
	    {
		newString = numberString;
	    }
	    else
	    {
		newString = newString + numberString;
	    }
	}
	Stdout.println (newString);
	return newString;
    }


    public static String reversal (String message)
    {
	int length = message.length ();
	String reverse = "no value";
	for (int i = 0 ; i <= length ; i++)
	{
	    String letter = Character.toString (message.charAt (length - i - 1));
	    Stdout.println (letter);
	    if (i == 0)
	    {
		reverse = letter;
	    }
	    else
	    {
		reverse = reverse + letter;
	    }

	}
	Stdout.println (reverse);
	return reverse;
    }
}


