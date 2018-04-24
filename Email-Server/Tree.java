import java.io.*;
public class Tree
{
    private TNode root = null;

    public Tree ()
    {
	root = null;
    }


    public Tree (TNode r)
    {
	root = r;
    }


    public TNode getRoot ()
    {
	return root;
    }


    public void setRoot (TNode r)
    {
	root = r;
    }

    public void insertNode (TNode p)
    {
	if (root == null)
	{
	    root = p;
	}
	else if (p.getIdentification ().compareTo (root.getIdentification ()) < 0)
	{
	    if (root.getLeft () == null)
	    {
		root.setLeft (p);
		p.setParent (root);
	    }
	    else
	    {
		Tree tree = new Tree (root.getLeft ());
		tree.insertNode (p);
	    }
	}
	else if (p.getIdentification ().compareTo (root.getIdentification ()) > 0)
	{
	    if (root.getRight () == null)
	    {
		root.setRight (p);
		p.setParent (root);
	    }
	    else
	    {
		Tree tree = new Tree (root.getRight ());
		tree.insertNode (p);
	    }
	}
	else
	{
	    System.out.println ("Error inserting a node. Id already exists.");
	}
	
	int leftHeight  = root.getLeft()  != null ? root.getLeft().getHeight()  : 0;
	int rightHeight = root.getRight() != null ? root.getRight().getHeight() : 0;
	root.setHeight(Math.max(leftHeight, rightHeight) + 1);
    }

    public void printTree ()
    {
	if (root != null)
	{
	    Tree tree = null;

	    tree = new Tree (root.getLeft ());
	    tree.printTree ();

	    System.out.println (root);

	    Tree tree2 = new Tree (root.getRight ());
	    tree2.printTree ();
	}
    }


    public void printTree (int level)
    {
	if (root != null)
	{
	    Tree tree = new Tree (root.getLeft ());
	    tree.printTree (level + 1);

	    System.out.println ("Root: " + root + " Level: " + level);

	    Tree tree2 = new Tree (root.getRight ());
	    tree2.printTree (level + 1);
	}
    }


    public TNode findNode (String id)
    {
	if (root == null)
	{
	    return null;
	}
	else if (id.equals (root.getIdentification ()))
	{
	    return root;
	}
	else if (id.compareTo (root.getIdentification ()) < 0)
	{
	    Tree t = new Tree (root.getLeft ());
	    return t.findNode (id);
	}
	else if (id.compareTo (root.getIdentification ()) > 0)
	{
	    Tree t = new Tree (root.getRight ());
	    return t.findNode (id);
	}
	else
	{
	    System.out.println ("Error");
	    return null;
	}
    }


    public TNode findNode (String key, int where)
    {
	if (key.length () == Globals.IDENTIFICATION_LEN)
	{
	    return findNode (key);
	}
	else if (root == null)
	{
	    return null;
	}
	else
	{
	    int n = key.length ();

	    if (key.compareTo (root.getIdentification ().substring (0, n)) < 0)
	    {
		Tree tree = new Tree (root.getLeft ());
		return tree.findNode (key, where);
	    }
	    else if (key.compareTo (root.getIdentification ().substring (0, n)) > 0)
	    {
		Tree tree = new Tree (root.getRight ());
		return tree.findNode (key, where);
	    }
	    else
	    {
		TNode p = root;
		if (where == 0)
		{
		    TNode q = p.getLeft ();
		    while (q != null)
		    {
			if (q.getIdentification ().equals (key))
			{
			    p = q;
			    q = q.getLeft ();
			}
			else
			{
			    q = q.getRight ();
			}
		    }
		}
		else
		{
		    TNode q = p.getRight ();
		    while (q != null)
		    {
			if (q.getIdentification ().equals (key))
			{
			    p = q;
			    q = q.getRight ();
			}
			else
			{
			    q = q.getLeft ();
			}
		    }
		}
		return p;
	    }
	}
    }


    public int height ()
    {
	int treeHeight = 0;
	if (this.getRoot () != null)
	{
	    Tree lTree = new Tree (this.getRoot ().getLeft ());
	    int lHeight = 1 + lTree.height ();

	    Tree rTree = new Tree (this.getRoot ().getRight ());
	    int rHeight = 1 + rTree.height ();

	    treeHeight = lHeight > rHeight ? lHeight:
	    rHeight;
	}
	return treeHeight;
    }


    public void breadthFirstRetrieve (String fileName)
    {
	try
	{
	    RandomAccessFile f = new RandomAccessFile (fileName, "rw");
	    int nodes = (int) (f.length () / (Globals.IDENTIFICATION_LEN + Globals.INT_LEN));
	    TNode p = null;
	    byte[] identification = new byte [Globals.IDENTIFICATION_LEN];
	    String identificationString = Globals.STR_NULL;

	    for (int i = 0 ; i < nodes ; i++)
	    {
		identificationString = Globals.STR_NULL;
		f.read (identification);

		for (int j = 0 ; j < identification.length ; j++)
		{
		    identificationString = identificationString + (char) identification [j];
		}

		p = new TNode (identificationString, f.readInt (), null, null, null);
		this.insertNode (p);
	    }

	    f.close ();
	}
	catch (IOException error)
	{
	    System.out.println ("***Error: Unable to retrieve tree file " + fileName);
	}
    }


    public void breadthFirstSave (String fileName)
    {
	try
	{
	    RandomAccessFile f = new RandomAccessFile (fileName, "rw");
	    f.setLength (0);

	    for (int i = 0 ; i < height () ; i++)
	    {
		writeLevel (i, f);
	    }
	    f.close ();
	}
	catch (IOException error)
	{
	    System.out.println (error);
	}
    }


    public void writeLevel (int level, RandomAccessFile f)
    {
	if (level == 0)
	{
	    try
	    {
		if (root != null)
		{
		    f.write (root.getIdentification ().getBytes ());
		    f.writeInt (root.getRecordNumber ());
		}
	    }
	    catch (IOException error)
	    {
		System.out.println (error);
	    }
	}
	else if (root != null)
	{
	    Tree tree = new Tree (root.getLeft ());
	    tree.writeLevel (level - 1, f);
	    tree = new Tree (root.getRight ());
	    tree.writeLevel (level - 1, f);
	}
    }


    public void setParentsChildLink (TNode p, TNode q)
    {
	if (p.getIdentification ().compareTo (p.getParent ().getIdentification ()) < 0)
	    p.getParent ().setLeft (q);
	else if (p.getIdentification ().compareTo (p.getParent ().getIdentification ()) > 0)
	    p.getParent ().setRight (q);
	else
	    System.out.println ("Error in deleting the node from the tree.");
    }


    public void deleteNode (TNode p)
    {
	if (p != null)
	{
	    TNode q = null;
	    //TNode r = null;
	    if (p.getLeft () == null & p.getRight () == null)
	    {
		//r = p.getParent();

		if (p == root)
		    root = null;
		else
		    setParentsChildLink (p, null);
	    }
	    else if ((p.getLeft () != null && p.getRight () == null) ||
		    (p.getRight () != null && p.getLeft () == null))
	    {
		q = (p.getLeft () != null) ? p.getLeft ():
		p.getRight ();

		if (p == root)
		    root = q;
		else
		    setParentsChildLink (p, q);

		q.setParent (p.getParent ());
		//r = q.getParent();
	    }
	    else
	    {
		q = p.getLeft ();
		if (p.getLeft ().getRight () == null)
		{
		    if (p == root)
			root = q;
		    else
			setParentsChildLink (p, q);

		    q.setParent (p.getParent ());
		    q.setRight (p.getRight ());
		    q.getRight ().setParent (q);

		    //r = q
		}
		else
		{
		    while (q.getRight () != null)
			q = q.getRight ();
		    //r = q.getParent()
		    q.getParent ().setRight (q.getLeft ());

		    if (q.getLeft () != null)
			q.getLeft ().setParent (q.getParent ());

		    if (p == root)
			root = q;
		    else
			setParentsChildLink (p, q);

		    q.setParent (p.getParent ());
		    q.setLeft (p.getLeft ());
		    p.getLeft ().setParent (q);
		    q.setRight (p.getRight ());
		    p.getRight ().setParent (q);
		}
	    }
	    p.delete ();
	    p = null;
	}
    }
    
    public TNode rightRotate(){
	TNode p = root.getLeft();
	p.setParent(root.getParent());
	root.setLeft(p.getRight());
	
	if (root.getLeft() != null)
	    root.getLeft().setParent(root);
	    
	p.setRight(root);
	p.getRight().setParent(p);
	
	return p;
    }
    
    public TNode leftRotate(){
	TNode p = root.getRight();
	p.setParent(root.getParent());
	root.setLeft(p.getLeft());
	
	if (root.getRight() != null)
	    root.getRight().setParent(root);
	    
	p.setLeft(root);
	p.getLeft().setParent(p);
	
	return p;
    }


    public void buildFromMessagesFile (int whatId)
    {
	Record record = new Record ();
	for (int recordNumber = 0 ; recordNumber < Globals.totalRecordsInMessagesFile ; recordNumber++)
	{
	    record.readFromMessagesFile (recordNumber);
	    if (record.getData ().charAt (Globals.FIRST_RECORD_MARKER_POS) ==
		    Globals.FIRST_RECORD_MARKER)
	    {
		Message message = new Message ();
		message.readFromMessagesFile (recordNumber);

		String key = Globals.STR_NULL;
		if (whatId == Globals.SENDER_ID)
		    key = message.getSenderFirst ();
		else if (whatId == Globals.RECEIVER_ID)
		    key = message.getReceiverFirst ();
		else
		    System.out.println ("***invalid whatKey parameter in buildFromMessagesFile method");
		insertNode (new TNode (key, recordNumber, null, null, null));
	    }
	}
    }
}
