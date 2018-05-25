
public class ListNode {
	
	private Object data; //creates a object name data
	private ListNode next; //Reference to list node
	
	//This is a constructor
	public ListNode(Object newData, ListNode newNext)
	{
		data = newData;
		next = newNext;
	}
	
	public Object getData()// to read data getter 
	{
		return data;
	}
	public void setData(Object newData)// to set data
	{
		data = newData;
	}
	public ListNode getNext() //to get what is it pointing at
	{
		return this.next;
	}
	public void setNext(ListNode newNext) // to set what it should point at
	{
		this.next = newNext;
	}

}
