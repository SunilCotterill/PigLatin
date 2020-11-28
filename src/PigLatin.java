/* Sunil Cotterill's, 20814212, Tutorial 5 assignment made on Feb 11 2020. This program takes a word as input and outputs the same word
translated into piglatin. This program uses a method to translate the word and a while loop (in the main method) to ask for input/see if
the user is quitting. 
 * */


//importing scanner
import java.util.Scanner;

public class PigLatin {
	//scanner and while loop constant
	static Scanner console = new Scanner(System.in);
	static boolean dontQuit = true;
	
	//main method
	public static void main(String[] args) {
		//prompter
		System.out.println("Please type your word and it will be translated into Pig Latin. Enter \"q\" to quit.");
		
		//while loop that takes input and translates word
		while (dontQuit) {
			
			//taking input and storing it as a string
			String right = console.next();
			
			//testing for q to quit
			if (right.equals("q") || right.equals("Q")) {
				dontQuit = false;
				System.out.print("Thank you for using the translator!");
				
			}
			
			//if it isn't q translate word
			else{
				//translate the word and print it out
				right=translate(right);
				System.out.println(right);
				
			}
			
		}

	}
	
	//translate method
	public static String translate(String word) {
		//shifts word to lower case
		word = word.toLowerCase();
		
		//checks if word starts with vowel
		if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
				|| word.startsWith("u")) {
			
			//adds way to end of word and > to the beginning
			word = ">"+word + "Way";
			//returns word
			return word;

		}
		//for the consonant case
		else {
			//converts word to upper case to extract the first char
			word=word.toUpperCase();
			char first = word.charAt(0);
			//back to lower case for outputting
			word=word.toLowerCase();
			//adds > to the beginning of the word, prints word starting starting at second character, adds first and ay to end 
			word=">"+word.substring(1)+first+"ay";
			return word;

		}

	}

}
