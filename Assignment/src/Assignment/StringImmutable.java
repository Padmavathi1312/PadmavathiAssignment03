package Assignment;

public class StringImmutable {
	
		   public static void main(String[] args) {
		      String st1 = "Tutorials";
		      String st2 = "Point";
		      System.out.println("The hascode of st1 = " + st1.hashCode());
		      System.out.println("The hascode of st2 = " + st2.hashCode());
		      st1 = st1 + st2;
		      System.out.println("The Hashcode after st1 is changed : "+ st1.hashCode());
		   }
		}


