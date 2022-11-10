package Assignment;

public class Threadtwice  implements Runnable {
	
		   @Override
		   public void run(){  
			Thread thread = Thread.currentThread();
		        System.out.println(thread.getName()+" is executing.");  
		   }  
		   
		   
		   public static void main(String args[]){  
			Thread newThread = new Thread(new Threadtwice(), "new thread"); 
			newThread.start();  
			newThread.start();  
		   } 

}
