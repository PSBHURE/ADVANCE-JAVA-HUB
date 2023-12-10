package dao;

import java.sql.SQLException;

import pojos.User;

public interface UserDAO {
public String RegisterVoter(User voter) throws SQLException;
public String DeleteData(String email) throws SQLException;
public User ValidateUser(String email,String password) throws SQLException;
public String UpdateVoterStatus(int VoterID) throws SQLException;
}
