package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class FailFastIterator {
	  public static void main(String[] args)   
      {   
          Map<String, String> cityName = new HashMap<String, String>();   
          cityName.put("NYC", "New york");   
          cityName.put("LA", "Los Angels");   
          cityName.put("MO", "Missouri");   
          Iterator iterator = cityName.keySet().iterator();   
          while (iterator.hasNext()) {   
              System.out.println(cityName.get(iterator.next()));   
              // adding an element to Map   
              // exception will be thrown on next call   
              // of next() method.   
              cityName.put("Istanbul", "Turkey");   
          }   
      }   

}
