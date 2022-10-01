package MiniProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BiographyAndAutobiography {

	public static float biography() {
		Scanner scanner=new Scanner(System.in);
		float bioTotal=0.0f;
		char ch1;
		do {
		List<Books> biographyList=new ArrayList<Books>();
		biographyList.add(new  Books(1,595.15f,"Fearless governance")); 
		biographyList.add(new Books(2,395.32f,"In the line of fire"));
		biographyList.add(new Books(3,600.07f,"The last white hunter")); 
		biographyList.add(new Books(4,250.29f,"The golden tap")); 
		biographyList.add(new Books(5,109.05f,"Adolf hitler")); 
		 try
		 { 
		  System.out.println("Choose the book");
		 System.out.println("      1.Fearless governance" );
		 System.out.println("      2.In the line of fire");
		 System.out.println("      3.The last white hunter");
		 System.out.println("      4.The golden tap");
		 System.out.println("      5.Adolf hitler");
		
		 int num=scanner.nextInt ();
		 float price=biographyList.get(num-1).getPrice();
		 System.out.println("The cost Of the Book is:"+price);
		 System.out.println("    Press Y to confirm " );
		 char ch  =scanner.next().charAt(0); 
		 if(ch=='y'||ch=='Y')
		 { 
			 System.out.println("How many Books Do you need?"  );
			 int quantity=scanner.nextInt();
			 bioTotal=bioTotal+(price*quantity);
		 }
		 System.out.println("Do you want to continue with BiographyAndAutobiography then press Y");
		} catch(InputMismatchException ex ) 
		{ 
			System.out.println("InputMismatchException Occured ");
		 }ch1  =scanner.next().charAt(0);  
		 }while(ch1 =='y'|| ch1  =='Y');
		  return bioTotal;
		 
	} 	 
}
