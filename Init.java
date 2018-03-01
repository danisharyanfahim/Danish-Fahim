public class Init{
    public static int initializeSystem(){
	int error = FileIO.openMessagesFile(Globals.MESSAGES_FILE);
	if(error == Globals.PROCESS_OKAY){
	    error = FileIO.retrieveAvailableList(Globals.AVAILABLE_LIST_FILE);
	    if(error == Globals.PROCESS_OKAY){
		//do nothing
	    }
	    else{
		ErrorReport.report(2);
	    }
	}
	else{
	    ErrorReport.report(1);
	}
       return error;
    }
}
