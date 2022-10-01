package MiniProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ShortStories {

	public static float story() {
		Scanner scanner=new Scanner(System.in);
		float shortTotal=0.0f;
		char ch1;
		do {
		List<Books> storybkList=new ArrayList<Books>();
		storybkList.add(new  Books(1,195.42f,"The Sound of water")); 
		storybkList.add(new Books(2,335.15f,"The Everest hotel"));
		storybkList.add(new Books(3,999.01f,"The Path made Clear")); 
		storybkList.add(new Books(4,200.31f,"The Mystic temple")); 
		storybkList.add(new Books(5,450.18f,"A year of marvellous ways")); 
		try
		 {
		  System.out.println("Choose the book");
		 System.out.println("      1.The Sound of water" );
		 System.out.println("      2.The Everest hotel");
		 System.out.println("      3.The Path made Clear");
		 System.out.println("      4.The Mystic temple");
		 System.out.println("      5.A year of marvellous ways ");
		 
		 int num=scanner.nextInt ();
		 float price=storybkList.get(num-1).getPrice();
		 System.out.println("The cost Of the Book is:"+price);
		 System.out.println("    Press Y to confirm " );
		 char ch  =scanner.next().charAt(0); 
		 if(ch=='y'||ch=='Y')
		 { 
			 System.out.println("How many Books Do you need?"  );
			 int quantity=scanner.nextInt();
			 shortTotal=shortTotal+(price*quantity);
		 }
		 System.out.println("Do you want to continue with ShortStories then press Y");
			} catch(InputMismatchException ex ) 
			{ 
				System.out.println("InputMismatchException Occured ");
			 }ch1  =scanner.next().charAt(0);  
		 }while(ch1 =='y'|| ch1  =='Y');
		  return shortTotal;
		 
	} 	 
}
