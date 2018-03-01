import java.io.*;
public class EmailServer{
    public static void main(String args[]) {
	int error = Init.initializeSystem();
	if(error == Globals.PROCESS_OKAY){
	    FileIO.closeMessagesFile();
	}
	else{
	    ErrorReport.report(0);
	}
	/*Record record = new Record("Hello Sun!", 6);
	int i = 0;
	for (i = 0; i < record.data.length; i++){
	    System.out.println((char)(record.data[i]) + " " + i);
	}
	System.out.println(record.next);
	System.out.println(record.getData());*/
	
	//int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	if (error == Globals.PROCESS_OKAY){
	    Record record = new Record("Dear Susan, how are you today? I am going to try to write you more frequently ab", 2);
	    record.writeToMessagesFile(0, Globals.APPEND);
	    record = new Record("Hi Johnny, do you want to go to the movies tonight? I have free passes. Suzie   ", -1);
	    record.writeToMessagesFile(1, Globals.APPEND);
	    record = new Record("out the material that we had left open last time. It seems that the entries that", 3);
	    record.writeToMessagesFile(2, Globals.APPEND);
	    record = new Record("you had included in the invoices contain some calculation errors. For example, t", 4);
	    record.writeToMessagesFile(3, Globals.APPEND);
	    record = new Record("he first item has a price of $39.75 and there were 5 items ordered. The resultin", 6);
	    record.writeToMessagesFile(4, Globals.APPEND);
	    record = new Record("To everyone at the sales department: This is a reminder that our monthly luncheo", 8);
	    record.writeToMessagesFile(5, Globals.APPEND);
	    record = new Record("g price should be $39.75 x 5 = $198.75 but you have it showing as $201.25, and t", 7);
	    record.writeToMessagesFile(6, Globals.APPEND);
	    record = new Record("he tax is calculated based on this figure of $201.25. Could you please review th", 9);
	    record.writeToMessagesFile(7, Globals.APPEND);
	    record = new Record("n will take place at Favourite Pizza, 275 Pepperoni Road. See you all there.    ", -1);
	    record.writeToMessagesFile(8, Globals.APPEND);
	    record = new Record("e entire worksheet and email me a new copy. I truly appreciate it. Sincerely Pet", 10);
	    record.writeToMessagesFile(9, Globals.APPEND);
	    record = new Record("er, Inventory Manager.", -1);
	    record.writeToMessagesFile(10, Globals.APPEND);
	    //record.readFromMessagesFile(2);
	    FileIO.closeMessagesFile();
	    Message message = new Message();
	    message.readFromMessagesFile(0);
	    System.out.println(message);
	}
	else{
	    System.out.println("Error opening messages file");
	}
    }
}
