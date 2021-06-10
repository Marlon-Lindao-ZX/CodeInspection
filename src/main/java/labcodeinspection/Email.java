package labcodeinspection;

import java.util.Locale;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int passwordLength = 8;
	private String email;
	
	/**
	*
	*
	* @author MarlonLindao
	*/
	public Email(final String firstName, final String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	*
	*
	* @author MarlonLindao
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	*
	*
	* @author MarlonLindao
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "default";
			break;
		}
		
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	*
	*
	* @author MarlonLindao
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.passwordLength);
		this.email = this.firstName.toLowerCase(Locale.ROOT) + this.lastName.toLowerCase(Locale.ROOT) + "@" + this.department
				+ ".espol.edu.ec";
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

	public int getPasswordLength() {
		return passwordLength;
	}

	public void setPasswordLength(final int passwordLength) {
		this.passwordLength = passwordLength;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}
	
	
}
