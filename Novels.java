package MiniProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Novels   {
 	 
	public static float novels() {
		 Scanner scanner=new Scanner(System.in);
		 float novelTotal=0.0f;
		 char ch1  ;
		 do {
		 List<Books> novelList=new ArrayList<Books>();
		 novelList.add(new  Books(1,120.02f,"Smile A while")); 
		 novelList.add(new Books(2,590.12f,"The lost man"));
		 novelList.add(new Books(3,250.10f,"The Girl behind the glass")); 
		 novelList.add(new Books(4,225.25f,"The visiting Moon")); 
		 novelList.add(new Books(5,675.13f,"Private scandals")); 
		 try
			{
		 System.out.println("Choose the book");
		 System.out.println("      1. Smile A while" );
		 System.out.println("      2.The lost man ");
		 System.out.println("      3.The Girl behind the glass ");
		 System.out.println("      4.The visiting Moon ");
		 System.out.println("      5.Private scandals ");
		
		 int num=scanner.nextInt ();
		 float price=novelList.get(num-1).getPrice();
		 System.out.println("The cost Of the Book is:"+price);
		 System.out.println("    Press Y to confirm " );
		 char ch  =scanner.next().charAt(0); 
		 
		 if(ch=='y'||ch=='Y')
		 {  
			 System.out.println("How many Books Do you need?"  );
				int quantity=scanner.nextInt();
				novelTotal=novelTotal+(price*quantity);
		  }	
		 System.out.println("Do you want to continue with novels then press Y");
		  } catch( Exception ex ) 
			{ 
			  System.out.println("InputMismatchException Occured ");
			 }ch1  =scanner.next().charAt(0);
		 }while(ch1 =='y'|| ch1  =='Y');
			return novelTotal;
		
	} 	 
}
 