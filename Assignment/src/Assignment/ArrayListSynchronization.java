package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronization {
	
	  public static void main (String[] args) {
		  List<String> colors = new ArrayList<String>();
	        colors.add("Yellow");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Red");
	        
	        colors = Collections.synchronizedList(colors);
	        synchronized(colors) {
	            Iterator<String> itr = colors.listIterator();
	            while(itr.hasNext()) {
	                System.out.println(itr.next());
	            }
	        }
	  }
}
