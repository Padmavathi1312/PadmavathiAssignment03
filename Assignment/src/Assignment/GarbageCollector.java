package Assignment;

public class GarbageCollector {
	
	 public static void main(String[] args)
	    {
	        Test garbageTest = new Test();
	        garbageTest=null;
	        System.gc();
	    }
	    public void finalize()
	    {
	        System.out.println("Garbage Collected");
	    }
	}

