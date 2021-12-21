package threads;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class V_thread implements Runnable
{

	String [] ary = new String[1000];

	public void run() {
		// TODO Auto-generated method stub
		

		int index=0;
	try {
	      File myObj = new File("Vocabulary.txt");
	      Scanner myReader = new Scanner(myObj);
	      System.out.println("In Vocabulary.txt file:");
	      
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	       System.out.println(data);
	        ary[index]=data;
	        index++;
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	    	try {
	  	      throw new FilenNotFound();
	  		 }catch(FilenNotFound ef)
	  		 {
	  			 ef.printStackTrace();
	  		 }
	    	e.printStackTrace();
	    }
	
	  
	
	System.out.println("\nNow After BinarySearchTree Operation");

	BinarySearchTree BST=new BinarySearchTree();
		  for(int i=0;i<index;i++) { 
			  BST.insertinto(ary[i]);
			  }
		  	
		  BST.printtree();
		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
			 
		 }

	}





