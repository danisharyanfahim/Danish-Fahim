import java.io.*;
public class FileIO{
    public static void copyFile(String source, String target){
	RandomAccessFile src = null;
	RandomAccessFile tgt = null;
	try{
	    src = new RandomAccessFile(source, "r");
	    try{
		tgt = new RandomAccessFile(target, "rw");
		String line = src.readLine();
		while(line != null){
		    tgt.writeBytes(line + "\r\n");
		    line = src.readLine();
		}
		tgt.close();
	    }
	    catch(IOException error){
		System.out.println(error);
	    }
	    src.close();
	}
	catch(IOException error){
	    System.out.println(error);
	}    
    }
    
    public static void compareFiles(String f1, String f2){
    
    }
    
    public static void main(String[] args){
	copyFile("famous people.txt", "famous people copy.txt");
    }
}

/*
remember to import java.io.*, and also name the files txt
or not include txt when seraching for the file. For every
new line character, Windows will add an extra /r to it. So
The windows file will increase the byte size by 1 bytes per
line and 2 bytes for the last line where it will add both a
/r and /n. Other operating systems will not add a /n on the
last line.
*/
