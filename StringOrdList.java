
public class StringOrdList extends OrderedList {
	//inherits from OrderedList class

		//constructer for StringOrdList
	public StringOrdList(String name) {
		super(name);
		//calls OrderedList constructer with name as passing argument
	}
	protected int compare(Object obj1, Object obj2) {
		//compares two strings to order them
		
		return (obj1.toString().compareToIgnoreCase(obj2.toString()));
	}
}
