package tester;
import java.util.Scanner;

import dao.UserDAOImple;
public class DeleteData {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		UserDAOImple UDI=new UserDAOImple();
		System.out.println("Enter email");
		System.out.println(UDI.DeleteData(sc.next()));
		UDI.cleanUp();
	}catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
