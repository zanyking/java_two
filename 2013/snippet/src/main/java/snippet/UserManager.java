/**
 * 
 */
package snippet;

/**
 * @author Ian YT Tsai(Zanyking)
 * @since 2013/8/2
 */
public interface UserManager {

	public boolean login(String userName, String password);

	public User getUser();

	public boolean isAuthenticated();

}
