import hsa.*;
public class Exercise1 {
    public static void main(String[] args) {
	Console c = new Console();

	c.print("Name 1: ");
	String name1 = c.readLine();
	c.print("Name 2: ");
	String name2 = c.readLine();
	c.print("Name 3: ");
	String name3 = c.readLine();
	c.print("Name 4: ");
	String name4 = c.readLine();
	c.print("Name 5: ");
	String name5 = c.readLine();
	if (name1.compareTo("A") >= 0 && name1.compareTo("B") <= 0) {
	    c.println(name1);
	}
	if (name2.compareTo("A") >= 0 && name2.compareTo("B") <= 0) {
	    c.println(name2);
	}
	if (name3.compareTo("A") >= 0 && name3.compareTo("B") <= 0) {
	    c.println(name3);
	}
	if (name4.compareTo("A") >= 0 && name4.compareTo("B") <= 0) {
	    c.println(name4);
	}
	if (name5.compareTo("A") >= 0 && name5.compareTo("B") <= 0) {
	    c.println(name5);
	}
    }
}
