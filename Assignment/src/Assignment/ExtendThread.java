package Assignment;

public class ExtendThread extends Thread{
	
		 public void run()
		 {
		  System.out.println("Thread started running");
		 }
		 public static void main( String args[] )
		 {
			 ExtendThread mt = new  ExtendThread();
		  	mt.start();
		 }
	}


