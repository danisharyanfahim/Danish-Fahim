import java.io.*;
public class Tree{
    private  TNode root = null;
    
    public Tree(){
	root = null;
    }
    
    public Tree(TNode r){
	root = r;
    }
    
    public TNode getRoot(){
	return root;
    }
    
    public void setRoot(TNode r){
	root = r;
    }
    
    public void insertNode(TNode p){
	if (root == null){
	    root = p;
	}
	else if(p.getIdentification().compareTo(root.getIdentification()) < 0){
	    if (root.getLeft() == null){
		root.setLeft(p);
		p.setParent(root);
	    }
	    else{
		Tree tree = new Tree(root.getLeft());
		tree.insertNode(p);
	    }
	}
	else if(p.getIdentification().compareTo(root.getIdentification()) > 0){
	    if(root.getRight() == null){
		root.setRight(p);
		p.setParent(root);
	    }
	    else{
		Tree tree = new Tree(root.getRight());
		tree.insertNode(p);
	    }
	}
	else{
	    System.out.println("Error inserting a node. Id already exists.");
	}
    }
    
    public void printTree(){
	if (root != null){
	    Tree tree = null;
	    
	    tree = new Tree(root.getLeft());
	    tree.printTree();
	    
	    System.out.println(root);
	    
	    Tree tree2 = new Tree(root.getRight());
	    tree2.printTree();
	}
    }
    
    public TNode findNode(String id){
	if (root == null){
	    return null;
	}
	else if(id.equals(root.getIdentification())){
	    return root;
	}
	else if(id.compareTo(root.getIdentification()) < 0){
	    Tree tree = new Tree(root.getLeft());
	    return tree.findNode(id);
	}
	else if(id.compareTo(root.getIdentification()) > 0){
	    Tree tree = new Tree(root.getRight());
	    return tree.findNode(id);
	}
	else{
	    return null;
	}
    }
}
