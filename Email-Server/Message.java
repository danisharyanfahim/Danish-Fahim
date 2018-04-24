import java.util.*;
public class Message{
    private String text = Globals.STR_NULL;
    private char command = Globals.NULL;
    private String sender = Globals.STR_NULL;
    private String receiver = Globals.STR_NULL;
    private String dateTime = Globals.STR_NULL;
    private char marker = Globals.NULL;
    private String subject = Globals.STR_NULL;
    private char eosMarker = Globals.NULL;
    
    public Message(){
	text = Globals.STR_NULL;
	command = Globals.NULL;
	sender = Globals.STR_NULL;
	receiver = Globals.STR_NULL;
	dateTime = Globals.STR_NULL;
	marker = Globals.NULL;
	subject = Globals.STR_NULL;
	eosMarker = Globals.NULL;
    }
    
    public Message(String s){
	setMessage(s);
    }
    
    public void setMessage(String s){
	command = s.charAt(Globals.COMMAND_POS);
	sender = s.substring(Globals.SENDER_POS, Globals.RECEIVER_POS);
	receiver = s.substring(Globals.RECEIVER_POS, Globals.DATE_TIME_POS);
	dateTime = s.substring(Globals.DATE_TIME_POS, Globals.FIRST_RECORD_MARKER_POS);
	marker = s.charAt(Globals.FIRST_RECORD_MARKER_POS);
	subject = s.substring(Globals.FIRST_RECORD_MARKER_POS + 1, s.indexOf(Globals.END_OF_SUBJECT_MARKER));
	eosMarker = s.charAt(s.indexOf(Globals.END_OF_SUBJECT_MARKER));
	text = s.substring(s.indexOf(Globals.END_OF_SUBJECT_MARKER) + 1);
    }
    
    public void setText(String t){
	text = t;
    }
    
    public void setCommand(char c){
	command = c;
    }
    
    public void setSender(String s){
	sender = s;
    }
    
    public void setReceiver(String r){
	receiver = r;
    }
    
    public void setDateTime(String d){
	dateTime = d;
    }
    
    public void setMarker(char m){
	marker = m;
    }
    
    public void setSubject(String s){
	subject = s;
    }
    
    public void setEosMarker(char e){
	eosMarker = e;
    }
    
    public String getText(){
	return text;
    }
    
    public char getCommand(){
	return command;
    }
    
    public String getSender(){
	return sender;
    }
    
    public String getReceiver(){
	return receiver;
    }
    
    public String getDateTime(){
	return dateTime;
    }
    
    public char getMarker(){
	return marker;
    }
    
    public String getSubject(){
	return subject;
    }
    
    public char getEosMarker(){
	return eosMarker;
    }
    
    public String getID(){
	return sender + receiver + dateTime;
    }
    
    public String getSenderFirst(){
	return sender + receiver + dateTime;
    }
    
    public String getReceiverFirst(){
	return receiver + sender + dateTime;
    }
    
    public void readFromMessagesFile(int recordNumber){
	String data = Globals.STR_NULL;
	Record record = new Record();
	do{
	    record.readFromMessagesFile(recordNumber);
	    data += record.getData();
	    recordNumber = record.getNext();
	}while(recordNumber != Globals.END_OF_MESSAGE);
	setMessage(data);
    }
    
    public int writeToMessagesFile(){
	String s = text;
	int recordNumber = -1;
	int nextRecordNumber = -1;
	int startRecordNumber = Globals.availableList.getHead() == null ?
				Globals.totalRecordsInMessagesFile :
				Globals.availableList.getHead().getRecordNumber();                                        ;
	
	if (Globals.availableList.getHead() == null){
	    startRecordNumber = Globals.totalRecordsInMessagesFile;
	}
	else{
	    startRecordNumber = Globals.availableList.getHead().getRecordNumber();
	}
	
	Record record = new Record();
	
	while (s != null){
	    if (Globals.availableList.getHead() == null){
		recordNumber = Globals.totalRecordsInMessagesFile;
		if(s.length() <= Globals.RECORD_DATA_LEN){
		    record.setData(s, Globals.END_OF_MESSAGE);
		    record.writeToMessagesFile(recordNumber, Globals.APPEND);
		    s = null;
		}
		else{
		    if (Globals.availableList.getHead() == null){
			nextRecordNumber = Globals.totalRecordsInMessagesFile;
		    }
		    else{
			nextRecordNumber = Globals.availableList.getHead().getRecordNumber();
		    }
		    record.setData(s.substring(0,Globals.RECORD_DATA_LEN), nextRecordNumber);
		    record.writeToMessagesFile(recordNumber, Globals.MODIFY);
		    s = s.substring(Globals.RECORD_DATA_LEN);
		}
	    }
	    else{
		
	    }
	}
	return startRecordNumber;
    }
    
    public void deleteFromMessagesFile(int recordNumber){
	Record record = new Record();
	while (recordNumber != Globals.END_OF_MESSAGE){
	    //record.readFromMessagesFile(recordNumber);
	    record.deleteFromMessagesFile(recordNumber);
	    recordNumber = record.getNext();
	}
    } 
    
    public String toString(){
	//Date date = new Date(Utils.bytesStrToLong(dateTime));
	return( "Command     : " + command   + "\n" +
		"Sender      : " + sender    + "\n" +
		"Receiver    : " + receiver  + "\n" +
		"Date/Time   : " + dateTime  + "\n" +
		"Marker      : " + marker    + "\n" +
		"Subject     : " + subject   + "\n" +
		"EOS Marker  : " + eosMarker + "\n" +
		"Message Text: " + text);
    }
}
