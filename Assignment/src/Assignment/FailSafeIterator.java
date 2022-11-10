package Assignment;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
	
	 public static void main(String[] args){
	      ConcurrentHashMap<String, Integer> failSafeMap = new ConcurrentHashMap<String, Integer>();
	      //Adding elements to map
	      failSafeMap.put("Infy", 1);
	      failSafeMap.put("IBM", 2);
	      //Getting an Iterator from map
	      Iterator<String> company = failSafeMap.keySet().iterator();
	      while (company.hasNext()){
	      String key = (String) company.next();
	         System.out.println(key+" : "+failSafeMap.get(key));
	         failSafeMap.put("Google", 3);
	      }
	   }

}
