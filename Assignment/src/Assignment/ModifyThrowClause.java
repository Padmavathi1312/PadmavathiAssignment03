package Assignment;

import java.io.FileNotFoundException;
import java.io.IOException;


	
	class ModifyThrowClause
	{
	    void methodOfSuperClass() throws IOException, ClassNotFoundException, NumberFormatException
	    {
	        System.out.println("Super class method is throwing both checked and unchecked exceptions");
	    }
	}
	 
	class SubClass extends ModifyThrowClause
	{
	    @Override
	    void methodOfSuperClass() throws IOException, ClassNotFoundException
	    {
	        System.out.println("Can be Overrided with same checked exceptions");
	    }
	}
	 
	class SubClassOne extends ModifyThrowClause
	{
	    @Override
	    void methodOfSuperClass() throws FileNotFoundException
	    {
	        System.out.println("Can be overrided with checked Exception with lesser scope");
	    }
	}
	 
	class SubClassTwo extends ModifyThrowClause
	{
	    @Override
	    void methodOfSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException
	    {
	        System.out.println("Can be overrided with any other unchecked exceptions and checked exception with lesser scope");
	    }
	}
	 
	class SubClassThree extends ModifyThrowClause
	{
	    @Override
	    void methodOfSuperClass()
	    {
	        //Compile time error
	        //Can not be overrided with checked exception with higher scope
	    }
	}


