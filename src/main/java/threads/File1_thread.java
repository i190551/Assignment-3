package threads;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;  
import java.util.*;
import java.io.File;
import java.io.FileInputStream;

public class File1_thread  implements Runnable  {
	
	String [] file1 = new String [1000];
	int index=0;
	StringTokenizer StrToken;
	
	public void run() {
	try 
	 {
	      File myObj = new File("input1.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) 
	      {
	    	  	String data = myReader.nextLine();
	    	  	StrToken = new StringTokenizer(data);
	    	  	while (StrToken.hasMoreTokens())
	    	  	{
		    	file1[index] = StrToken.nextToken(" ");
		        file1[index].replace(".","");
		        index++;
	    	  	}
	      }
	      myReader.close();
	 } catch (FileNotFoundException e)
     {
		 try {
	      throw new FilenNotFound();
		 }catch(FilenNotFound ef)
		 {
			 ef.printStackTrace();
		 }
		 
	 }

	System.out.println("\nInput File 1 Array");
	 for(int i=0; i<index; i++)
		{
			System.out.println(file1[i]);
		}
	 
	 
	 
		
	 
	 try {
		 Thread.sleep(1000);
		 
	 }catch(InterruptedException e)
	 {
		 e.printStackTrace();
		 }
}

	

}

	


