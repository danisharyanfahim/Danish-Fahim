import java.io.*;
public class Record{
    private final byte[] data = new byte[Globals.RECORD_DATA_LEN];
    public int next = Globals.END_OF_MESSAGE;
    
    public Record(){
	for(int i = 0; i < data.length; i++){
	    data[i] = (byte)(Globals.BLANK);
	}
	next = Globals.END_OF_MESSAGE;
    }
    
    public Record(String s, int nextRecord){
	setData(s, nextRecord);
    }
    
    public String getData(){
	String dataString = "";
	for(int i = 0; i < data.length; i++){
	    dataString = dataString + (char)((data[i] + 256) % 256);
	}
	return dataString;
    }
    
    public void setData(String txt, int nextRecord){
	for(int i = 0; i < data.length; i++){
	    data[i] = (byte)(Globals.BLANK);
	}
	for(int i = 0; i < txt.length() && i < data.length; i++){
	    data[i] = (byte)(txt.charAt(i));
	}
	next = nextRecord;
    }
    
    public int getNext(){
	return next;
    }
    
    public int readFromMessagesFile(int recordNumber){
	try{
	    Globals.msg.seek(recordNumber * Globals.RECORD_LEN);
	    int bytes = Globals.msg.read(data);
	    next = Globals.msg.readInt();
	    return Globals.PROCESS_OKAY;
	}
	catch(IOException error){
	    return Globals.PROCESS_ERROR;
	}
    }
    
    public int writeToMessagesFile(int recordNumber, int mode){
	try{
	    Globals.msg.seek(recordNumber * Globals.RECORD_LEN);
	    Globals.msg.write(data);
	    Globals.msg.writeInt(next);
	    if (mode == Globals.APPEND){
		Globals.totalRecordsInMessagesFile += 1;
	    }
	    return Globals.PROCESS_OKAY;
	}
	catch(IOException error){
	    return Globals.PROCESS_ERROR;
	}
    }
    
    public int deleteFromMessagesFile(int recordNumber){
	int error = readFromMessagesFile(recordNumber);
	if(error == Globals.PROCESS_OKAY){
	    data[0] = (byte) Globals.DELETED;
	    error = writeToMessagesFile(recordNumber, Globals.MODIFY);
	    if(error == Globals.PROCESS_OKAY){
		Globals.availableList.addRecord(recordNumber);
	    }
	    else{
		System.out.println("Error writing to messages file. In method deleteFromMessagesFile.");
	    }
	}
	else{
	    System.out.println("Error writing to messages file. In method deleteFromMessagesFile.");
	}
	return error;
    }
    
    public String toString(){
	return (this.getData()) + next;
    }
}
//readInt() reads 4 bytes at a time.
