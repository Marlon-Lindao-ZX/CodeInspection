package labcodeinspection;

import java.util.Locale;

public class Email {

	private transient final String myfirstName; 
	private transient final String mylastName;
	private transient String password;
	private transient String department;
	private transient final int defaultpassLength = 8;
	private transient String email;

	/**
	 * This is constructor
	 * @param firstName
	 * @param lastName
	 */
	public Email(final String firstName, final String lastName) {
		this.myfirstName = firstName;
		this.mylastName = lastName;
	}
	
	/**
	 * This is method showInfo
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + myfirstName + "\nLAST NAME= " + mylastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * This is method setDepartment
	 * @param depChoice new id department to be set
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
	 * This is method generateEmail
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpassLength);
		this.email = this.myfirstName.toLowerCase(Locale.US) + this.mylastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
