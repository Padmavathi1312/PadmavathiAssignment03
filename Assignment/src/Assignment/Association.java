package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Association {
	
	
	      
	    private String cityName;
	  
	    public String getCityName() {
	        return cityName;
	    }
	  
	    public void setCityName(String cityName) {
	        this.cityName = cityName;
	    }
	    @Override
	    public String toString() {
	        return cityName;
	    }
	}
	 
	class State {
	      
	    private String stateName;
	     
	    List<Association> citys;
	  
	    public String getStateName() {
	        return stateName;
	    }
	  
	    public void setStateName(String stateName) {
	        this.stateName = stateName;
	    }
	    public List<Association> getCities() {
	        return citys;
	    }
	    public void setState(List<Association> citys) {
	        this.citys = citys;
	    }
	     
	}
	 
	