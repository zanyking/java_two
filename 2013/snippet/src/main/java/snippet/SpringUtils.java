/**
 * 
 */
package snippet;

/**
 * @author Ian YT Tsai(Zanyking)
 * @since 2013/8/2
 */
public class SpringUtils {

	
	
	@SuppressWarnings("unchecked")
	public static<T> T getBean(Class<T> class1) {

		if(class1==UserManager.class){
			return (T) new UserManager(){
				private User user;
				public boolean login(String userName, String password) {
					boolean result = ("zanyking".equals(userName)&& "test".equals(password));
					if(result){
						user = new User("zanyking");
					}
					return result;
				}

				public User getUser() {
					return user;
				}

				public boolean isAuthenticated() {
					return user!=null;
				}
			};
		}
		
		return null;
	}

}
