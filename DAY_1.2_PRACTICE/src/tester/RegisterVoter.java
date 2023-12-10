package tester;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import dao.UserDAOImple;
import pojos.User;
public class RegisterVoter {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		UserDAOImple UDI=new UserDAOImple();
		System.out.println("first_name,last_name,email,password,dob");
		User voter=new User(sc.next(),sc.next(),sc.next(),sc.next(),Date.valueOf(sc.next()));
		int age=Period.between(voter.getDOB().toLocalDate(),LocalDate.now()).getYears();
		if(age>=21)
		{
			System.out.println(UDI.RegisterVoter(voter));
		}
		else
			System.out.println("invalid age for voating!!!");
		UDI.cleanUp();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
