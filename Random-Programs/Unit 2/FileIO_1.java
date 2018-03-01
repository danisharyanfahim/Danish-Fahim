import java.io.*;
public class FileIO_1{
    public static void main (String[] args){
	RandomAccessFile f = null;
	String line = "";
    
	try{
	    f = new RandomAccessFile("countries", "rw");
	    
	    line = f.readLine();
	    while(line != null){
		System.out.println(line);
		line = f.readLine();
	    }
	    //countries.setlength(0);
	    //f.writeBytes("Sweden\n");
	    //f.writeBytes("Canada\n");
	
	    f.close();
	}
	catch(IOException error){
	    System.out.println(error);
	}
    }
}
