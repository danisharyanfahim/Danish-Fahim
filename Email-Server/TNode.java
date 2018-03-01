public class TNode{
    private String identification = "";
    private int recordNumber = -1;
    private TNode left = null;
    private TNode right = null;
    private TNode parent = null;
    
    public TNode(){
	identification = "";
	recordNumber = -1;
	left = null;
	right = null;
	parent = null;
    }
    
    public TNode(String i, int n, TNode l, TNode r, TNode p){
	identification = i;
	recordNumber = n;
	left = l;
	right = r;
	parent = p;
    }
    
    public String getIdentification(){
	return identification;
    }
    
    public int getRecordNumber(){
	return recordNumber;
    }
    
    public TNode getLeft(){
	return left;
    }
    
    public TNode getRight(){
	return right;
    }
    
    public TNode getParent(){
	return parent;
    }
    
    public void setIdentification(String id){
	identification = id;
    }
    
    public void setRecordNumber(int r){
	recordNumber = r;
    }
    
    public void setLeft(TNode l){
	left = l;
    }
    
    public void setRight(TNode r){
	right = r;
    }
    
    public void setParent(TNode p){
	parent = p;
    }
    
    public String toString(){
	if (this == null){
	    return "null";
	}
	else{
	    return "Id: " + identification + " Record number: " + recordNumber;
	}
    }
}

