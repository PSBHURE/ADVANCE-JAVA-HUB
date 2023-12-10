package dao;

import java.sql.*;
import static utils.DBUtils.*;
import pojos.User;

public class UserDAOImple implements UserDAO {

	private Connection cn;
	private PreparedStatement pst1,pst2,pst3,pst4;
	public UserDAOImple() throws SQLException
	{
		cn = openConnection();
		pst1=cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		pst2=cn.prepareStatement("delete from users where email=?");
		pst3=cn.prepareStatement("select * from users where email=? and password=?");
		pst4=cn.prepareStatement("update users set status=? where id=? ");
		System.out.println("user DAO created");
	}
	@Override
	public String RegisterVoter(User voter) throws SQLException {
//id | first_name | last_name | email             | password | dob        | status | role
		pst1.setString(1,voter.getFirstName());
		pst1.setString(2, voter.getLastName());
		pst1.setString(3, voter.getEmail());
		pst1.setString(4, voter.getPassword());
		pst1.setDate(5,voter.getDOB());
		pst1.setBoolean(6, false);
		pst1.setString(7, "voter");
		int rowUpdated=pst1.executeUpdate();
		if(rowUpdated==1)
			return "registration Sucsessfull!!!!!";
		return "registration failed!!!!";
	}

	@Override
	public String DeleteData(String email) throws SQLException {
		pst2.setString(1, email);
		int rowUpdate=pst2.executeUpdate();
		if(rowUpdate==1)
			return "deletion occur sucsessfully!!!!";
		return "deletion failure!!!!";
	}

	@Override
	public User ValidateUser(String email, String password) throws SQLException {
		pst3.setString(1, email);
		pst3.setString(2, password);
		try(ResultSet RS=pst3.executeQuery())
		{
//id | first_name | last_name | email             | password | dob        | status | role
			if(RS.next())
				return new User(RS.getInt(1),RS.getString(2),RS.getString(3),email,password,RS.getDate(6),RS.getBoolean(7),RS.getString(8));
		}
		return null;
	}

	@Override
	public String UpdateVoterStatus(int VoterID) throws SQLException {
		pst4.setBoolean(1, true);
		pst4.setInt(2, VoterID);
		int rowUpdate=pst4.executeUpdate();
		if(rowUpdate==1)
			return "voter's voting status is updated!!!!";
		return "voting is not done yet!!!!";
	}
	public void cleanUp() throws SQLException
	{
		if(pst1!=null)
			pst1.close();
		if(pst2!=null)
			pst2.close();
		if(pst3!=null)
			pst3.close();
		if(pst4!=null)
			pst4.close();
		closeConnection();
		System.out.println("user DAO clean up");
		
	}

}
