
public class IntegerOrdList extends OrderedList {

	//calls contructer and give it a name
	public IntegerOrdList(String name) {
		super(name);
	
	}

	protected int compare(Object obj1, Object obj2) {
		//compare two Numbers
	
		//values are returned as 0,1 and -1 that is used for sorting the number list
		if((Integer) obj1 > (Integer) obj2)	
		
		{
			
			return 1;	
		}
		else if((Integer) obj1 == (Integer) obj2)
		{
			
			return 0;
		}
		else
		{
		
			return -1;
		}
			
		
	}

}
