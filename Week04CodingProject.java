package Week04CodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. create an array of int called ages
int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93}; 

//you can also declare the size of the array and add the elements in on another line
int[] ages2 = new int[8];
ages2[0] = 3;
ages2[1] = 9;
ages2[2] = 23;
ages2[3] = 64;
ages2[4] = 2;
ages2[5] = 8;
ages2[6] = 28;
ages2[7] = 93;

// 1a. subtract the first element in the array from the value in the last element of the array and print the result

System.out.println(ages[ages.length - 1] - ages[0]);  // the last element in an array will always have an index of 1 - (the length) of the array.


//1b. create a new array with 9 elements

int[] moreAges = new int[ages.length + 1]; // ages already has 8 elements

//1c. loop through the array and calculate the average age, printing the result to the console

double ageSum = 0; // using a double as it's more accurate
double averageAge = 0;
for (int i = 0; i < ages.length; i++) {
	ageSum += ages[i]; //this will take all of the elements in ages and add them together
	averageAge = ageSum / ages.length;
	
}
System.out.println(averageAge);


// 2. create an array of strings called "names"

String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

// 2a. use a loop to iterate through the array and calculate the average number of letters per name and print to the console

double lengthSum = 0;
double averageLength = 0;
for (int i = 0; i < names.length; i++) {
	lengthSum += names[i].length(); //using the length method for strings must include the ()
	averageLength = lengthSum / names.length;

}

System.out.println(averageLength);



// 3. How do you access the last element in an array?
// because arrays are zero-based, the last element in an array will always have an index of  one less than the length of the array

System.out.println(names[names.length - 1]);


//4. How do you access the first element in an array?
//because arrays are zero-based, the first element in an array will always be index 0.

System.out.println(names[0]);

//5. create a new array of int called "nameLengths"; write a loop to iterate over "names" and add the length of each
//name to namesLength

int[] nameLengths = new int[names.length]; //we know that the length of this array will be the same as the length of "names" as we are using the same elements
for (int i = 0; i < names.length; i++) {
	nameLengths[i] = names[i].length();
}

//6. write a loop to iterate over "namesLength" and calculate the sum of all of the elements, print

int namesLengthSum = 0;
for (int element : nameLengths) { // using an enhanced for loop as we already did this with a traditional for loop earlier
	namesLengthSum += element;
}
 System.out.println(namesLengthSum);
 
 //7. testing the method that returns a string added to itself n number of times
 
 System.out.println(concatenate("Hello", 3));

//8. testing the method that takes 2 strings and returns a string separated by a space
 
 System.out.println(fullName("Joe", "Fish"));


// 9. testing the method that takes an array of ints and returns true if sum of the elements is greater than 0
 
 int[] testArray = new int[] {3, 50};
 System.out.println(greaterThanHundred(testArray));

//10. testing the method that takes an array of double and returns the average of the elements
 
 double[] weights = new double[] {30, 55.17, 10.5, 65, 41.375, 22.44444};
 System.out.println(average(weights));

//11.  testing method of comparing the average fo the elements between 2 arrays of double
 
 double[] moreWeights = new double[] {10000, 25.5, 18.777};
 System.out.println(compareArrays(weights, moreWeights));

 //12. testing willBuyDrink
 
 System.out.println(willBuyDrink(true, 7.23));
 
 //13. testing goToBed
 
 System.out.println(goToBed(true, false, true));

	}
	
	//7. write a method that takes a string and an int and returns the word concatenated to itself that many times
	
	public static String concatenate(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	
	
	
	
	
	
	// 8. write a method that takes 2 strings (firstName and lastName), and returns a full name (first and last name separated by a space)
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName; //saving space by not assigning a variable
	}
	
	// 9. write a method that takes an array of int and returns true if sum of all ints in the array is greater than 100
	
	public static boolean greaterThanHundred(int[] numbers) {
		int sum = 0;
		boolean boo = false; // assigning the boolean to a variable so that we can call the return outside of the loops
		for (int element : numbers) {
			sum += element;
		}
		if (sum > 100) {
			boo = true;
		}
		return boo;
	} 
	
	//10. write a method that takes an array of double and returns the average of all the elements in the array
	
	public static double average(double[] moreNumbers) {
		double sum = 0;
		double elementsAverage = 0;
		for (double element : moreNumbers) {
			sum += element;
			elementsAverage = sum / moreNumbers.length;
		}
		return elementsAverage;
	}
	
	//11. write a method that takes 2 arrays of double and returns true if the average in the first array is greater than the 
	//average of the elements in the 2nd array
	
	public static boolean compareArrays(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		double average1 = 0;
		double average2 = 0;
		boolean compare = false;
		for (double element : array1) {
			sum1 += element;
			average1 = sum1 / array1.length;
		}
		for (double element2 : array2) {
			sum2 += element2;
			average2 = sum2 / array2.length;
		}
		if (average1 > average2) {
			compare = true;
		}
		return compare;
	}
	
	//12. write a method that takes a boolean and a double and returns true if it is hot outside and we have more than $10.50
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean answer = false;
		if (isHotOutside && moneyInPocket > 10.50) { //isHotOutside will default to True
			answer = true;
		}
		return answer;
		
	}
	
	
	//13. My problem is that there is always work to do 
	public static String goToBed(boolean amITired, boolean doIHaveWorkToDo, boolean isThereIceCream) {
		String result = "";
		if (amITired && doIHaveWorkToDo == false && isThereIceCream == false) {
			result = "Go to bed!";
		} else if (amITired && doIHaveWorkToDo) {
			result = "Do your work in the morning and go to bed!";
		} else if (amITired && isThereIceCream) {
			result = "There is always time for ice cream!";
		} else if (doIHaveWorkToDo == false) {
			result = "Time for Netflix!";
		} else {
			result = "Get your work done!";
		}
		return result;
	}
	
	
	
	
	
	
	
}
