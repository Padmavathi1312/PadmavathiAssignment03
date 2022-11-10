package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

public class Resource {
	
	private static void printFile() throws IOException {

	    try(FileInputStream input = new FileInputStream("file.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}

}
