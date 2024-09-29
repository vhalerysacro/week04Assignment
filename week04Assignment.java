package week04;

public class week04Assignment {

	public static void main(String[] args) {
	
	//1.	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //array with values of ages
	//a.
	int difference = ages[0] - ages[ages.length - 1]; //difference of first element in ages and last
	System.out.println("Difference: " + difference);
	//b.
	int[] ages2 = {45, 5, 22, 7, 33, 12, 63, 43, 88}; // [] after data type to create an array
	int difference2 = ages2[0] - ages2[ages2.length - 1]; //using .length - 1 will always show the last element in an array of any length 
	System.out.println("Difference 2: " + difference2);
	//c.
	int sum = 0; //sum 
	for (int age : ages) { //enhanced for loop which iterates through each element in ages array
	    sum += age; //adds current age to sum
	}
	double average = (double)sum / ages.length; //finds average by dividing sum to length of array, using double to ensure decimal shows
	System.out.println("Age average: " + average);
	//2.
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//a.
	int sumNames = 0; //declares sumNames initialize at 0 
	for (String name : names){ //enhanced for loops which iterates through each element in names array
		sumNames += name.length(); //adds the length of names to sumNames
	}
	double average2 =(double)sumNames / names.length; // finds average by dividing sumNames to length of array, double to show decimal
	System.out.println("Name length average: " + average2);
	
	//b.
	String concatenateNames = ""; // concatenateNames 
	for (String name : names) {
	    concatenateNames += name + " ";
	}	System.out.println("Names: " + concatenateNames);
	//3. to access the last element of an array, type in the data type first following .length - 1 after 
	//4. to access the first element of an array is to use 0
	//5.
	int[] nameLengths= new int[names.length]; //creates a new array to store length of names
	for (int i = 0; i < names.length; i++) { //start at 0, as long as it's less than the amount of elements the loop will continue, loops in increments of 1 to next element
	    nameLengths[i] = names[i].length(); //element in nameLengths array, string element in names array, length of that name
	}
	//6.
	int sumArrays = 0; //declares sumArrays initialize at 0
	for (int nameLength : nameLengths) { // iterates through elements in nameLengths array
		sumArrays += nameLength; // adds length of names
	} System.out.println("Sum of all elements: " + sumArrays);
	
	
	}
	//7. 
	public static String repeatedWords(String word, int n) { //declares repeatedWords with two parameters
	String result = ""; //empty string that stores concatenated words
	for ( int i = 1; i <= n; i++) { //initializes at 1, loops as long as its less than or equal to n, iterates by 1
	result = result + word; //adds word to the end of the result string

	}
	return result; //returns string result
	}
	//8.
	public static String fullName(String firstName, String lastName) { //declares fullName with two parameters
		 return firstName + " " + lastName; // returns concatenated firstName and lastName with space in between
	}
	//9.
	public static boolean isSumGreaterThan100(int[] arrays) { //declares boolean isSumGreaterThan100
	    int theSum = 0; // initializes integer variable theSum, stores sum of elements in array
	    for (int array : arrays) { // loops through elements in arrays
	        theSum += array; // gathers sum of elements in array
	    }
	    return theSum > 100; //returns boolean result
	}
	//10.
	public static double averageArray(double[] averages) { //declares double averageArray
	    double total = 0; // initializes double variable total, stores sum of elements in array
	    for (double average : averages) { // loops through elements in averages
	      total += average;  // gathers sum of elements in average
	    
	    }
	    return total/averages.length; //returns average of arrays
	}
	//11.
	public static boolean doubleArrays (double[] arrays1, double [] arrays2) { //declares boolean doubleArrays with 2 parameters
		double isItTrue = 0; // initializes double variable isItTrue
		for (double array1 : arrays1) { //loops through elements in arrays1
			isItTrue += array1; //gathers sum of elements in array1
		} 
		double isItFalse = 0; // initializes double variable isItFalse
		for (double array2 : arrays2) { //loops through elements in arrays2
			isItFalse += array2; //gathers sum of elements in array2
		}
		return isItTrue > isItFalse; //returns boolean result 
}
	//12.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) { //declares boolean willBuyDrink with 2 parameters
			return isHotOutside && moneyInPocket > 10.50; //returns boolean is both are true
			}
	//13.
	public static boolean travelToHawaii (int ifPlaneTicket, int averageMonthlyTemperature) { //declares boolean travelToHawaii with 2 parameters
		return ifPlaneTicket < 500 && averageMonthlyTemperature < 90; // returns boolean if both are true
}	//created this method to solve the problem of whether I should travel to Hawaii or not, Hawaii is my paradise, depending on the season and prices will I only travel there

	
}
