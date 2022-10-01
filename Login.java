package MiniProject;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Login implements Serializable{
	private String  password,email;
	
 public Login(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}
  
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static void signUp(Login  user) throws IOException
	{ 
		 
		 FileOutputStream fout=new FileOutputStream("userdetails.txt" );
		ObjectOutputStream obout=new ObjectOutputStream(fout);
		obout.writeObject(user);
		obout.close();
		 
	}
	public static  int signIn(Login regUser ) throws IOException, ClassNotFoundException
	{
		int num=0;
		 FileInputStream fin=new FileInputStream("userdetails.txt");
		ObjectInputStream obin=new ObjectInputStream(fin);
		Login user = (Login)obin.readObject();
		obin.close();
		
		if(regUser.getEmail(). equals(user.getEmail() ) && (regUser.getPassword().equals(user.getPassword()) ) )
		{
			num=1;
		}else {
			num=0;
		 }
		
		return num ; 
	 }
 
	
	
}
