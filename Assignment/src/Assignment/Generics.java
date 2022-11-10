package Assignment;

public class Generics {
	   // generic method printArray
	   public static < E > void printArray( E[] inputArray ) {	    
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	   }

	   public static void main(String args[]) {	      
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);  
	   }
	}
