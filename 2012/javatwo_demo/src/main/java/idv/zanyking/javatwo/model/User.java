/**
 * 
 */
package idv.zanyking.javatwo.model;


/**
 * @author Ian YT Tsai (zanyking)
 *
 */

public class User {
	private String firstName = "";
	private String lastName = "";
	private boolean married;
	public User() {}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName(){
		return firstName + " " + lastName; 
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public boolean isMarried() {
		return married;
	}
	
	
	
}


