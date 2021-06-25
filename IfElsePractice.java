package homework;
import java.util.Scanner;

public class IfElsePractice {

	public static void IfElsePractice(String[] args) {
		
		    Scanner sc= new Scanner(System.in);
		    int myNumber=7;   
		    System.out.println("Pick a a number from 1 to 10");
		    int userNumber = Integer.parseInt(sc.nextLine());
		    
		    if(myNumber==userNumber) {
		    	System.out.println("Wow!");
		    	System.exit(0);
		    }else {
		    	System.out.println("Nope");
		    }
		        
		    
		    //int passGrade=60;
		    System.out.println("Whats your grade?");
		    int userGrade=Integer.parseInt(sc.nextLine());
		          
		    if(userGrade>=60) {
		    	System.out.println("You passed!");
		    }else {
		    	System.out.println("You failed!");
		    }
		          
		          
		          	        
		          
	}
	}


