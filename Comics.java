package MiniProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Comics {

	public static float comics() {
		Scanner scanner=new Scanner(System.in);
		float comicsTotal=0.0f;
		char ch1;
		do {
		List<Books> comicsList=new ArrayList<Books>();
		comicsList.add(new  Books(1,500.15f,"Big book of fun")); 
		comicsList.add(new Books(2,214.42f,"A frozen Adventure"));
		comicsList.add(new Books(3,295.34f,"The Detective dog")); 
		comicsList.add(new Books(4,310.58f,"The Smartest Giant in town")); 
		comicsList.add(new Books(5,410.38f,"The Snail and the Whale")); 
		try
		 {
		  System.out.println("Choose the book");
		 System.out.println("      1.Big book of fun" );
		 System.out.println("      2.A frozen Adventure");
		 System.out.println("      3.The Detective dog");
		 System.out.println("      4.The Smartest Giant in town");
		 System.out.println("      5.The Snail and the Whale ");
		 
		 int num=scanner.nextInt ();
		 float price=comicsList.get(num-1).getPrice();
		 System.out.println("The cost Of the Book is:"+price);
		 System.out.println("    Press Y to confirm " );
		 char ch  =scanner.next().charAt(0); 
		 if(ch=='y'||ch=='Y')
		 { 
			 System.out.println("How many Books Do you need?"  );
			 int quantity=scanner.nextInt();
			 comicsTotal=comicsTotal+(price*quantity);
		 }
		 System.out.println("Do you want to continue with Comics then press Y");
		} catch(InputMismatchException ex ) 
		{ 
			System.out.println("InputMismatchException Occured ");
		 }ch1  =scanner.next().charAt(0);  
		 }while(ch1 =='y'|| ch1  =='Y');
		  return comicsTotal;
		 
	} 	 
}
