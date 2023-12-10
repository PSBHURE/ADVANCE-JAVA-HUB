package pojos;

import java.sql.Date;

public class User {
//| id | first_name | last_name | email             | password | dob        | status | role
private int UserID;
private String FirstName;
private String LastName;
private String email;
private String password;
private Date DOB;
private boolean status;
private String role;
public User(int userID, String firstName, String lastName, String email, String password, Date dOB, boolean status,
		String role) {
	super();
	UserID = userID;
	FirstName = firstName;
	LastName = lastName;
	this.email = email;
	this.password = password;
	DOB = dOB;
	this.status = status;
	this.role = role;
}
public User(String firstName, String lastName, String email, String password, Date dOB) {
	super();
	FirstName = firstName;
	LastName = lastName;
	this.email = email;
	this.password = password;
	DOB = dOB;
}
public int getUserID() {
	return UserID;
}
public void setUserID(int userID) {
	UserID = userID;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [UserID=" + UserID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
			+ ", password=" + password + ", DOB=" + DOB + ", status=" + status + ", role=" + role + "]";
}

}
