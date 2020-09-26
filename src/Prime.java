import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Defining Variables
		boolean primeNum = true;
		int temp = 0;
		//Taking an input from the user
     Scanner scan = new Scanner(System.in);
     //Asking the user to Enter a number
     System.out.println("Enter a number: ");
     int num = scan.nextInt();
     scan.close();
     //Using for loop 
     for(int i = 2; i <= num/2; i++) {
    	 temp = num % i;
    	
    	//If the temp variable is equal to 0 then primeNum is false
    	 //which means the number that the user enters is not divisible by 2
    	 if(temp==0) 
    	 {
    		 primeNum = false;
    		 break;
    	 }
     } //If the number is not divisible by 2 it will print the following output
    	 if(primeNum)
    	 {
    		 System.out.println(num + " " + "is a Prime Number.");
    	 }
    	 //if the number is divisible by 2 it will print the following output
    	 else
    	 {
    		 System.out.println(num + " " + "is not a Prime Number.");
    	 }
    }
}
