public class DanishFahim{
    public static void main(String args[]){
	Message message = new Message();
	Globals.availableList = new AvailableList();
	int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	if(error == Globals.PROCESS_OKAY){
	    message.setText("Hello how are you today?asdddddddddddddddddddddddddddddddddddddddddddddddddddsafffffdfssadffffffffffffffffffffffffffffffffffffdsdsfsdfaaddddddddddddddddddddsadsfdsfdsfsdffds");
	    int recordNumber = message.writeToMessagesFile();
	    
	    FileIO.closeMessagesFile();
	}
    }
    
    
}
