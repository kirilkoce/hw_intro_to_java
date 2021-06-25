package homework;

import java.util.Scanner;

public class animalSounds {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter type of animal:");
		String animal = input.nextLine();
		String sound;
		
		switch (animal) {
		
		case "cat": 
			sound = "meow";
			break;
			
		case "tiger":
			sound = "roar";
			break;
			
		case "dog": 
			sound = "woof";
			break;
			
		case "Donkey":
			sound = "hee-haw";
			break;
			
		default: 
			sound = "that's some other animal..";
			break;
			
		}
		
		System.out.println(sound);

	}

}
