public class Testing{
    public static void main(String[] args){
	/*SLList list = new SLList();
	list.insertNode(new SNode("John", 82.6, null));
	list.insertNode(new SNode("Paul", 99, null));
	list.insertNode(new SNode("Peter", 97, null));
	list.insertNode(new SNode("Fayyad", 42, null));
	list.insertNode(new SNode("Peggy", 69, null));
	list.insertNode(new SNode("Kohava", 33, null));
	list.insertNode(new SNode("Nafis", 0, null));
	SNode a = new SNode("Mario", 45, null);
	list.insertNode(a);*/  
	
	/*AvailableList list2 = new AvailableList();
	list2.addRecord(5);
	list2.addRecord(7);
	list2.addRecord(0);
	
	System.out.println(list2);
	System.out.println(list2.getNextRecord());*/
	
	/*System.out.println(list);
	//SNode p = list.findNode("Nafis");
	//System.out.println(p != null ? p.toString(): "not found");
	
	list.deleteNode(a);
	System.out.println("\n" + list);*/

	Globals.availableList = new AvailableList();
	Message message = new Message();
	/*int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	if(error == Globals.PROCESS_OKAY){
	    message.setText("Hello how are you today?asdddddddddddddddddddddddddddddddddddddddddddddddddddsafffffdfssadffffffffffffffffffffffffffffffffffffdsdsfsdfaaddddddddddddddddddddsadsfdsfdsfsdffds");
	    int recordNumber = message.writeToMessagesFile();
	    message.readFromMessagesFile(1);
	    System.out.println(message);
	    FileIO.closeMessagesFile();
	}*/

	/*int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	if(error == Globals.PROCESS_OKAY){
	    int recordNumber = message.writeToMessagesFile();
	    message.readFromMessagesFile(0);
	    System.out.println(message);
	    FileIO.closeMessagesFile();
	} */
	
	
	System.out.println(Utils.longToBytesStr(Utils.bytesStrToLong("CATALYST")));
    }
}
