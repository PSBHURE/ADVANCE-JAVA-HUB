package tester;
import java.util.Scanner;

import dao.UserDAOImple;
public class UpdateVoterStatus {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		UserDAOImple UDI=new UserDAOImple();
		System.out.println("enter voterID");
		System.out.println(UDI.UpdateVoterStatus(sc.nextInt()));
		UDI.cleanUp();
	}catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
