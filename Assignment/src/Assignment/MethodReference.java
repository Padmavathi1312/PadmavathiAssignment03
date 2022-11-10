package Assignment;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}
public class MethodReference {
	    
	    public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
		MethodReference obj = new MethodReference();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  
	}


