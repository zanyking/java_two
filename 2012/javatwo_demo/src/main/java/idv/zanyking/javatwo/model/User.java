/**
 * 
 */
package idv.zanyking.javatwo.model;

import org.zkoss.bind.annotation.NotifyChange;

/**
 * @author Ian YT Tsai (zanyking)
 *
 */

public class User {
	private String firstName = "";
	private String lastName = "";
	private boolean married;
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	@NotifyChange({"firstName", "fullName"})
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@NotifyChange({"firstName", "fullName"})
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName(){
		return firstName + " " + lastName; 
	}
	@NotifyChange("married")
	public void setMarried(boolean married) {
		this.married = married;
	}
	public boolean isMarried() {
		return married;
	}
	
	
	
}


