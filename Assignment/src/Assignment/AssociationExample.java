package Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {

	 
	      public static void main(String[] args) {
	            State state = new State();
	            state.setStateName("California");
	             
	             
	            Association city = new Association();
	            city.setCityName("Los Angeles");
	            Association city2 = new Association();
	            city2.setCityName("San Diago");
	             
	            List<Association> empList = new ArrayList<Association>();
	            empList.add(city);
	            empList.add(city2);
	             
	             
	            state.setState(empList);
	             
	             
	            System.out.println(state.getCities()+" are cities in the state "+
	                    state.getStateName());
	        }
	      
	 
	}
