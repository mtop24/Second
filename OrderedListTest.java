import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderedListTest {

	public static void main(String[] args) {
		
		IntegerOrdList intList = new IntegerOrdList("Integer List");
		StringOrdList stringList = new StringOrdList("String List");
		
		
		
		do //so that code can run at least once
		{
			System.out.println("Please choose from following options");
			System.out.println("1: Insert integer values");
			System.out.println("2: Insert String values");
			System.out.println("3: Print Integer and String data");
			System.out.println("4: Remove integer value");
			System.out.println("5: Remove String value");
			System.out.println("6: Exit");
			
			Scanner myScanner = new Scanner(System.in); 
				//declare the scanner to be able to take user input
			try 
			{
				int option = myScanner.nextInt(); 	
				//takes the user input and store that to option variable
				switch(option)
				{
				case 1: 
				{
					
					System.out.println("Please enter the total number of data to insert");
					//ask user to input frequency
					int totalData = myScanner.nextInt();
					// takes the user input of number of data
					for(int i =0; i <totalData; i++)
					{//to take the totalNumber number of data
						System.out.println("Please enter a number to insert");
						int number = myScanner.nextInt(); 
						intList.insert((Integer)(number));
						//calls method insert in OrderedList class to insert data into the node 
					}
				}
					break;
				case 2:
				{ //to take the input of string and inserting them into ordered linked list
					System.out.println("Please enter the total number of data to insert");
					int totalData = myScanner.nextInt();
					for(int i =0; i <totalData; i++)
					{
						System.out.println("Please enter a word to insert");
						String inputString = myScanner.next(); 
						System.out.println(inputString + " has been inserted");
						stringList.insert(inputString);
					}
				}
					break;
				case 3:
				{
					System.out.println("The string and number data are shown below:");
					
					if(intList.getFirst() != null)
						//to check if there is some data in intList for integer data
						System.out.println(intList);
					else
						System.out.println("Sorry integer list is empty");
						
					if(stringList.getFirst() != null)
						//to check if there is some data in stringList for of sting 
						System.out.println(stringList);
					else
						System.out.println("Sorry string list is empty");
				}
					break;
				case 4:
				{//To take the input of number from user and if it exist then remove it
					System.out.println("Please enter a number to remove");
					int number = myScanner.nextInt(); 
					//get input from user to remove that number from list
					
					if(intList.remove((Integer)number))
						//calls remove method which removes the number if it exist in the list
					{
						System.out.println( number + " is succesfully removed from list");
					}
					else
						//if the number does not exist in the list then following message is printed
						System.out.println("Sorry " + number + " does not exist!");
				}break;
				case 5:
				{// to take the input of string from user and remove if it exist in the list
					System.out.println("Please enter a string to remove");
					String string = myScanner.next(); 
					// get the input of string from user and store that to string variable
					
					if(stringList.remove(string))
						//calls remove method which removes the string if it exist in the list
					{
						System.out.println(string + " is succesfully removed from list");
					}
					else
						System.out.println("Sorry, "+string + " does not exist in the list");
					
				}break;
								
				case 6:
				{
					System.out.println("You are about to exit. Goodbye.."); 
					System.exit(0); //exit condition is true
				}
					break;
				default:
				{
					System.out.println("Sorry you must enter a valid option");
					//if the input option value is none off the cases then this message is printed to user
				}
					break;
				}
			}
			catch (InputMismatchException inputMismatchException) 
				//if the user input wrong data type then the following message is displayed
			{
				System.err.println("You've entered a wrong data type. Please try again.");
			}
			catch(NegativeArraySizeException negativeArrayException) 
				//if the user input negative number
			{
				System.err.println("You've entered unacceptable number. Please try again.");
			}
			catch(NullPointerException outOfBoundsException) 
				//if the user enters no arguments
			{
				System.err.println("You should input something");
			}
		}while(true);

		
	}

}
