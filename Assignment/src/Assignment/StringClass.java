package Assignment;

public class StringClass {
	
	
		public static String concatinateString(){
		String string = "Abhi";
		for (int i=0; i<10000; i++){
		string = string + "Android";
		}
		return string;
		}
		public void append(String string) {
			// TODO Auto-generated method stub
			
		}
		
		public static String concatinateStringBuffer(){
		StringBuffer stringbuffer = new StringBuffer();
		for (int i=0; i<10000; i++){
		stringbuffer.append("Android");
		}
		return stringbuffer.toString();
		}
		 
		public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		concatinateString();

		System.out.println("Time taken for Concatination with String: "+(System.currentTimeMillis()-startTime)+"ms");

		startTime = System.currentTimeMillis();

		concatinateStringBuffer();

		System.out.println("Time taken for Concatination with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		}
		}
