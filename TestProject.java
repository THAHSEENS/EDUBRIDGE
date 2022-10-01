package MiniProject;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class TestProject implements Serializable{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int category=0;
		int num=0;
		String address=""; 
		float novelTotal=0.00f,shortTotal=0.00f,totalAmount=0.00f,comicsTotal=0.00f,bioTotal=0.00f;
		 char ch;
		Scanner scanner=new Scanner(System.in);
		System.out.println("**********Welcome To The Online Book Store**********");
		System.out.println("Are you a" );
		try { 
		System.out.println("      1.New User ");
		System.out.println("      2.Registered User");
		System.out.println("Enter the Option");
		int opt=scanner.nextInt();
		switch(opt) 
		{
		case 1:
			System.out.println("Enter the Email Id And Password to create the new account");
			Login user=new Login( scanner.next(),scanner.next()); 
			Login.signUp(user);
			System.out.println("Login Successfully"); 
			break;
		case 2:
			do
				{
				System.out.println("Enter the Email Id And Password ");
				String email=scanner.next ();
				String password=scanner.next ();
				Login regUser =new Login(email, password) ;  
				num=  Login.signIn(regUser);
				if(num==1) 
				{
					System.out.println("Login Successfully"); 
					break;
				}else  
					System.out.println("Invalid UserId and Password");	
					System.out.println("Do you want to continue then press Y" );
					ch  =scanner.next().charAt(0);  
			 }while(ch =='y'|| ch  =='Y');
				 
			 default: System.out.println("Enter the valid option");
			break;		
		 }
		do {
	 	System.out.println("Choose the Category");
		System.out.println("      1.Novels");
		System.out.println("      2.Short stories");
		System.out.println("      3.Comics");
		System.out.println("      4.Biography and autobiograpy");
		category=scanner.nextInt();
		
		switch(category ) {
		case 1:
			novelTotal=Novels.novels();
			break;
		case 2:
			shortTotal=ShortStories.story();
			break;	
		case 3:
			comicsTotal=Comics.comics();
			break;
		case 4:
			bioTotal=BiographyAndAutobiography.biography();
			break;
			
		 default: System.out.println("Enter the valid option");
			break;
		}
		System.out.println("Would you like to see other category then press Y" );
		ch  =scanner.next().charAt(0);  
		}while(ch =='y'|| ch  =='Y');
		totalAmount=novelTotal+shortTotal+comicsTotal+bioTotal;
		 System.out.printf(" The Total amount is :%.2f",totalAmount);
		 System.out.println("");
		 System.out.println(" Enter the location: ");
		 address=scanner.next(); 
		 System.out.println(" Order Placed Successfully,It will be delivered soon");
		 System.out.println("*******ThankYou, Visit Again*******");
		}catch(Exception ex)
		{
			System.out.println("InputMismatchException Occured ");
		}
		
	}

}
