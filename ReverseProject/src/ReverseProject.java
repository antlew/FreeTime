import java.util.Scanner;

public class ReverseProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		String sentence;
		String reverse = "";
		
		
		System.out.println("Please enter a number.");
		sentence = reader.nextLine();
		
		int length = sentence.length();
		
		for(int i = length - 1; i >= 0; i--){
			reverse = reverse + sentence.charAt(i);
		}
		System.out.println("Reverse of the entered sentence is: " + reverse);
			
		reader.close();
		
		

	}

}
