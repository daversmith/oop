
public class Quizzes {
	
	//operators
	public void averageScore()
	{
		/* Your friend seems to be really good at music, 
		he managed to score 96% on his final exam!
		Now that you know all 5 subject grades, 
		update the average calculation below to calculate the 
		total average of all subjects. */

		double maths=97.5;
		double english=98;
		double science=83.5;
		double drama=75;
		double sum=maths+english+science+drama;
		double average=sum/4;
		System.out.println(average);
	}
	
	//if statement
	public void isItRaining()
	{
		boolean isRaining; // true or false
		// Write an if statement below that prints out "Windshield wipers on." when isRaining is true.
	}
	
	//Switch /Case
	public void months()
	{
		//Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
		// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

		int month; // should be a number 1-12
		String monthString;

		switch(month) {
		    case 1: monthString = "January";
		        break;
		    case 2: monthString = "February";
		        break;
		    case 3: monthString = "March";
		        break;
		    case 4: monthString = "April";
		        break;
		    case 5: monthString = "May";
		        break;
		    case 6: monthString = "June";
		        break;
		    case 7: monthString = "July";
		        break;
		    case 8: monthString = "August";
		        break;
		    case 9: monthString = "September";
		        break;
		    case 10: monthString = "October";
		        break;
		    case 11: monthString = "November";
		        break;
		    // write case 12 and a default case below
		}
		System.out.println(monthString);
	}
	
	
	///Functions
	boolean playButton; // true or false

	// Define a function playMusic() below.
	// This should print out: "Music is playing" when playButton is true
	// and "Music is paused" when playButton is false.
	
	
	//functions 2
	//  Complete function that displays comment and the amount of
	//  likes for a photo. The function should have the following 3 params:
	//  
	//  param1: 
	//       name: currentLikes 
	//       purpose: sends the number of current likes
	//  param2: 
	//       name: comment
	//       purpose:  sends the text for the comment
	//  param3: 
	//       name: like
	//       purpose: an indicator of whether the comment is liked or not
	//
	//  The function should print the 
	public void likePhoto()
	{
		//prints the comment
		System.out.println("Feedback:"+comment);
		if(like) {
			//increase number of current likes by 1
		}
		System.out.println("Number of likes" + currentLikes);
	}
	
	//functions 3
	//  modify the previous function so it returns the number of currentLikes
	
	
	// fumctions 4
	// Define a function with the name and parameters: makeChange(double itemCost, double dollarsProvided)
	// Calculate and return the calculated change which should be the dollarsProvided minus the itemCost

	// Remember to return a value you need 1) a return type and 2) a return statement
}
