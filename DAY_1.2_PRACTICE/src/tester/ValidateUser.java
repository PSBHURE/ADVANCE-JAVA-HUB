package tester;
import java.util.Scanner;

import dao.UserDAOImple;
import pojos.User;
public class ValidateUser {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		UserDAOImple UDI=new UserDAOImple();
		System.out.println("enter email,password");
		User voter=UDI.ValidateUser(sc.next(), sc.next());
		if(voter==null)
		{
			System.out.println("sorry either email or password is incorrect");
		}
		else
		{
			System.out.println("login is sucsessfull");
			System.out.println("voter details=>"+voter);
		}
		UDI.cleanUp();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
