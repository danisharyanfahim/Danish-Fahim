public class SLList{
    private SNode head = null;
    private SNode tail = null;
    
    public SLList(){
	head = null;
	tail = null;
    }
    
    public void insertNode(SNode p) {
	SNode q = null;
	SNode r = null;
	if (head == null){  //If the list doesn't exist
	    head = p;
	    tail = p;
	}
	else {
	    q = head;
	    r = head;
	    while(q != null && q.getName().compareTo(p.getName()) < 0){ //Organizes the list in alphabetical order
		r = q;
		q = q.getNext();
	    }
	    if(q == head){ // Beginning of list
		head = p;
		p.setNext(q);
	    }
	    else if(q == null){ // End of list
		tail = p;
		r.setNext(p);
	    }
	    else{   // Middle of list
		r.setNext(p);
		p.setNext(q);
	    }
	}
    }
    
    public void deleteNode(SNode p){
	if (head == tail){  // If the list contains one element
	    head = null;
	    tail = null;
	}
	else if(head == p){ // Deleting at the beginning of the list
	    head = head.getNext();
	}
	else if(tail == p){ // Deleting at the end of the list
	    SNode q = head;
	    for(; q.getNext() != p; q = q.getNext()){
		;
	    }
	    tail = q;
	    tail.setNext(null);
	}
	else{ // Deleting in the middle of the list
	    SNode q = head;
	    for(; q.getNext() != p; q = q.getNext()){
		;
	    }
	    q.setNext(p.getNext());
	}
    }
    
    public SNode findNode(String key){
	SNode p = head;
	while(p != null && !key.equals(p.getName())){
	    p = p.getNext();
	}
	return p;
    }
    
    public SNode getHead(){
	return head;
    }
    
    public SNode getTail() {
	return tail; 
    }
    
    public void setHead(SNode h){
	head = h;
    }
    
    public void setTail(SNode t){
	tail = t;
    }
    
    public String toString() {
	String s = "";
	for (SNode p = head; p != null; p = p.getNext()){
	    s = s + p.toString() + "\n";
	}
	return s;
    }
}
