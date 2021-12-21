package threads;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, InvalidOptionException {
		
	Scanner sc=new Scanner(System.in);
	
	int opt;
			
		System.out.println("Choose From the Following:\n1.Files\n2.Vocabulary File\n3.BST\n4.Tokenized File 1 Tokenized File 2\n5.5 to exit");
		opt=sc.nextInt();
		switch(opt)
		{
		case 1:
			Thread t0=new Thread(new Files());
			t0.start();
			t0.join();
			break;
		case 2 :
			
		Thread t1= new Thread(new V_thread());

		t1.start();
		t1.join();
		break;

		case 3:
			Thread tt1= new Thread(new V_thread());

			tt1.start();
			tt1.join();
			break;
			
		case 4:
		Thread t2=new Thread(new File1_thread());
		t2.start();
		t2.join();
		
		Thread t3= new Thread (new File2_thread());
		t3.start();
		t3.join();
		
		break;
		
		case 5:
			System.out.println("Program is Quit");
			break;
			default:
				throw new InvalidOptionException();
			
			
		}
	}
}
