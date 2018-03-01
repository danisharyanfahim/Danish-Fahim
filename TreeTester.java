public class TreeTester{
    public static void main(String[] args){
	//System.out.println(p);
	Tree t = new Tree();
	Tree t2 = new Tree();
	TNode a = new TNode ("034553", 76, null, null, null);
	TNode b = new TNode ("034554", 35, null, null, null);
	TNode c = new TNode ("034555", 80, null, null, null);
	TNode d = new TNode ("034552", 61, null, null, null);
	TNode e = new TNode ("034551", 42, null, null, null);
	TNode f = new TNode ("034559", 53, null, null, null);
	TNode g = new TNode ("034558", 87, null, null, null);
	TNode h = new TNode ("034557", 27, null, null, null);
	
	System.out.println("Test 1:");
	t.insertNode(a);
	t.printTree();
	System.out.println("");
	
	System.out.println("Test 2:");
	t.insertNode(b);
	t.printTree();
	System.out.println("");
	
	System.out.println("Test 3:");
	t.insertNode(c);
	t.printTree();
	System.out.println("");
	
	System.out.println("Test 4 and 5:");
	t.insertNode(d);
	t.insertNode(e);
	t.insertNode(f);
	t.insertNode(g);
	t.insertNode(h);
	t.printTree();
	System.out.println("");
	
	for(int i = 0; i < 500; i++){
	    int r = (int) (Math.random() * 100000);
	    String id = Utils.leftPad("" + r, 6, '0');
	    TNode randomNode = new TNode(id, i, null, null, null);
	    t.insertNode(randomNode);    
	}
	System.out.println("Test 6:");
	t.printTree();
	System.out.println("");
	
	System.out.println("Test 7:");
	System.out.println(t2.findNode("000"));
	System.out.println("");
	
	System.out.println("Test 8:");
	System.out.println(t.findNode("034551"));
	System.out.println("");
	
	System.out.println("Test 9:");
	System.out.println(t.findNode("034559"));
	System.out.println("");
	
	System.out.println("Test 10:");
	System.out.println(t.findNode("000000"));
    }
}
