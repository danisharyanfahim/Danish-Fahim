public class AvailableList{
    private Available head = null;
    private Available tail = null;
    
    public AvailableList(){
	head = null;
	tail = null;
    } 
    
    public AvailableList(Available h, Available t){
	head = h;
	tail = t;
    }
    
    public Available getHead(){
	return head;
    }
    
    public Available getTail(){
	return tail; 
    }
    
    public void setHead(Available h){
	head = h;
    }
    
    public void setTail(Available t){
	tail = t;
    }
    
    public void addRecord(int recordNumber){
	if(head == null){   //If the list is empty
	    head = new Available(recordNumber);
	    tail = head;
	}
	else{               //If the list contains something
	    tail.setNext(new Available(recordNumber));
	    tail = tail.getNext();
	}
    }
    
    public int getNextRecord(){
	if(head == null){ //If the list is empty
	    return Globals.EMPTY_AVAILABLE_LIST;
	}
	else{
	    int rec = head.getRecordNumber();
	    head = head.getNext();
	    tail = head == null?  null : tail;
	    return rec;
	}
    }
    
    public String toString(){
	String s = "";
	for(Available p = head; p != null; p = p.getNext()){
	    s = s + p.toString() + "\n";
	}
	return s;
    }
} 
