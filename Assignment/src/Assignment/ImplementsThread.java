package Assignment;

public class ImplementsThread implements Runnable {
	

	    public static void main(String args[])
	    {
	        // create an object of Runnable target
	        GFG gfg = new GFG();
	  
	        // pass the runnable reference to Thread
	        Thread thread = new Thread("gfg");
	  
	        // start the thread
	        thread.start();
	  
	        // get the name of the thread
	        System.out.println(thread.getName());
	    }
	    @Override public void run()
	    {
	        System.out.println("Inside run method");
	    }
	}


