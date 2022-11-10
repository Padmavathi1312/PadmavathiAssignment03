package Assignment;

public class Finalize {
	
		   public void finalize() throws Throwable{
		      System.out.println(" garbage collected for the Object.");
		   }
		   public static void main(String[] args) {

		      Finalize Finalize = new Finalize();
		      Finalize = null;
		      System.gc();
		   }

}
