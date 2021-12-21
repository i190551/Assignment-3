package threads;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;  
import java.util.*;
import java.io.File;

public class File2_thread implements Runnable {
	
	String [] file2 = new String [1000];
	int index=0;
	StringTokenizer StrToken;
	public void run() {
	try 
	 {
	      File myObj = new File("input2.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) 
	      {
	    	  	String data = myReader.nextLine();
	    	  	StrToken = new StringTokenizer(data);
	    	  	while (StrToken.hasMoreTokens())
	    	  	{
		    	file2[index] = StrToken.nextToken(" ");
		        file2[index].replace(".","");
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
	      e.printStackTrace();
	 }

	System.out.println("\nInput File 2 Array");
	 for(int i=0; i<index; i++)
		{
			System.out.println(file2[i]);
		}
	 
	 
	 try {
		 Thread.sleep(1000);
		 
	 }catch(InterruptedException e)
	 {
		 e.printStackTrace();
		 }
}

	

}

	


