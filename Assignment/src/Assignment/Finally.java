package Assignment;

public class Finally {
	
	
	
		   public static void main(String[] args) {

		      try{
		         int x = 15;
		         int y = 0;
		         int result = x/y;
		      }catch(Exception e){
		         System.out.println("Error is : "+ e.getMessage());
		      }
		      finally{
		         System.out.println("Finally execution.");
		      }
		   }
		}
