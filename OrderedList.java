
public abstract class OrderedList extends List {
	
	//constructer
	public OrderedList(String name)
	{
		firstNode = null;
		this.name = name;
	}
	
	protected abstract int compare(Object obj1, Object obj2); //declaring the abstract function to use which does not have implementation yet
	
	public void insert (Object newData) // function to insert new data object
	{
		ListNode current, previous, newNode; // declaring local variables to use for insert data
		current = this.firstNode; // sets current to firstnode
		previous = current;
		Boolean complete = false; // keeps track of if dat is complete or not
		
		
		if(current == null) //to check if the list is empty
		{
			newNode = new ListNode(newData, null); // create new node with newData
			this.firstNode = newNode; // we set it to firstnode
		}
		else if(current.getNext() == null) // to check if there is only one node in the list
		{	
			if(this.compare(newData, current.getData()) >= 1) // compare between newData and current data
			{
				newNode = new ListNode(newData, null); //assign new data into the newNode
				current.setNext(newNode); //set next pointer of the current node to the new node
			}
			else if(this.compare(newData, current.getData()) == 0) //insert to the right 
			{
				newNode = new ListNode(newData, null);
				current.setNext(newNode);
			}
			else
			{
				newNode = new ListNode(newData, null);//insert to the left if inserted data is smaller than current data
				firstNode = newNode;
				newNode.setNext(current);
			}
		}
		else //if there is more than one node
		{
			current = firstNode.getNext(); //set current to the second node
			previous = firstNode; //set previous to first
			while(current!= null) // loop until current node point the null
			{
				if(current.getNext() == null && compare(newData, current.getData()) >= 1)
					// if it is at the last node data to be inserted is greter than current data
				{
					newNode = new ListNode(newData, null);
					current.setNext(newNode);
					complete = true;
				}
				else if(compare(newData,previous.getData())>=1 && compare(newData, current.getData())<=-1)
				{	// if the data is between previous and current data then insert in between
					newNode = new ListNode(newData, null);
					newNode.setNext(current);
					previous.setNext(newNode);
					complete = true;
				}
				else if(previous == this.firstNode && (compare(newData,previous.getData()) <= -1 || compare(newData,previous.getData())==0  ))
				{   //if the data is smallest value insert at the front
					newNode = new ListNode(newData, null);
					newNode.setNext(previous);
					this.firstNode = newNode;
					complete = true;
				}
				
				else if(compare(newData,current.getData()) == 0 && !complete)
				{	//if the current data is same as inserted, it inserts to the left
					newNode = new ListNode(newData, null);
					newNode.setNext(current);
					previous.setNext(newNode);
					complete = true;
				}
				previous = current;//sets previous  equal to current for next loop
				current = current.getNext();// sets current node to the next node
				
			}
		}
	}
	public Boolean remove (Object remData) // to remove the data the user wants to remove
	{
		ListNode current, previous;//local varibles used to remove the node
		Boolean returnValue = false;//returns true if find and removed the data otherwise returns false
		current = this.firstNode; //sets current to firstnode
		previous = null;
		if(current == null) //to check if list is empty
		{
			return false;
		}
		else if(current.getNext() == null) // to check if there is only one node
		{
			this.firstNode = null;
			return true;
		}
		else // executes this if there is more than one node
		{
			while(current != null) // to loop to through every node to check if there is a input data 
			{
				if(compare(remData,current.getData()) == 0 ) //check if the data is matched 
				{
					if(previous == null) // if the data to be removed is at very start of the
					{
						while (current.getNext() != null && compare(remData, current.getNext().getData()) == 0) 
						{
							current = current.getNext();
						}
						this.firstNode = current.getNext();
						returnValue = true;
					}
					else if(current.getNext() != null) // if the data to be removed is not the last node
					{
						previous.setNext(current.getNext());
						current = previous;
						returnValue = true;
					}
					else // if the data to be removed is last node
					{
						previous.setNext(null);
						returnValue = true;
					}
		
				}
				previous = current; // to loop through
				current = current.getNext();
				
			}
		}
	
		return returnValue;
	}
	public Object removeFromBack(){
		
		System.out.println("Error! you can not use this function");
		return null;
	}
	public Object removeFromFront(){
		System.out.println("Error! you can not use this function");
		return null;
	}
	public void insertAtFront(Object newData)
	{
		System.out.println("Error! you can not use this function");
		
	}
	public void InsertAtBack(Object newData){
		System.out.println("Error! you can not use this function");
	}
}

