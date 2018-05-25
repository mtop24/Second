
public class List {
	protected ListNode firstNode;
	protected ListNode lastNode;
	protected String name;
	
	public void insertAtFront(Object newData)
	{
		if(firstNode == null)
		{
			firstNode = lastNode = new ListNode(newData, firstNode);
		}
		else{
			ListNode newFirstNode = new ListNode(newData, firstNode);
			firstNode = newFirstNode;
		}
	}
	public void InsertAtBack(Object newData)
	{
		if(firstNode == null)
			firstNode = lastNode = new ListNode(newData, null);
		else
		{
			ListNode newLastNode = new ListNode(newData,null);
			lastNode.setNext(newLastNode);
			lastNode = newLastNode;
		}
	}
	public Object removeFromFront(){ //remove Object from front
		if(firstNode == null)//empty list
			return null;
		
		Object removedData = firstNode.getData();
		
		if(firstNode == lastNode) //only one list node
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNext();
		
		return removedData; //returns reference to new first node
	}
	public Object removeFromBack(){
		if (firstNode == null)// empty list
			return null;
		
		Object removedData = lastNode.getData();
		
		if(firstNode == lastNode) //only one node in the list 
			firstNode = lastNode = null;
		else
		{
			ListNode current = firstNode;
			while(current.getNext() != lastNode)
				current = current.getNext();
			lastNode = current;
			current.setNext(null);
		}
		return removedData;
	}
	
	public ListNode getFirst(){
		return firstNode;
		
	}
	public String toString()
	{
		String output = new String();
		ListNode current = firstNode;
		
		output = name + ":";
		while(current != null)
		{
			//we are implicitly calling the data object toString method
			output += " "+ current.getData();
			current = current.getNext();
		}
		return output;
	 }
		
	//constructors 
	public List (String listName)
	{
		firstNode = lastNode = null; 
		name = listName;
	}
	public List()
	{
		this("List");
	}
	

}
