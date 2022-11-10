package Assignment;

public class Final {
	
	 final int value = 1;

	   // The following are examples of declaring constants:
	   public static final int HEIGHT = 8;
	   static final String ROLE = "Lead";
	   public void changeValue() {
	      value = 2; // will give an error
	   }
	   public void displayValue(){
	      System.out.println(value);
	   }
	   public static void main(String[] args) {
	      Final fin = new Final();
	      fin.changeValue();
	      fin.displayValue();
	   }

}
