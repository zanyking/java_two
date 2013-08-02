/**
 * 
 */
package snippet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ian YT Tsai(Zanyking)
 * @since 2013/8/2
 */
public class Slf4jDemo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		try{
			logger.trace(" ");
			
			
			
		}finally{
			
		}
		
		
		String userName = "";
		String password = "";
		new Slf4jDemo().doLogin(userName, password);
		
	}
	
	
	
	
	
	
	public User doLogin(String userName, String password){
		
		UserManager userMg = SpringUtils.getBean(UserManager.class);
		
		try{
			logger.info("login by given user name: {}",userName);
			
			if(userMg.login(userName, password)){
				// login success...
			}else{
				//login failed...
			}
			
		}finally{
			logger.info(" is Login successful? {}",
					userMg.isAuthenticated());
		}
		
		return userMg.getUser();
		
	}

	
	
	
	
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);
	
	private UserManager userMg = SpringUtils.getBean(UserManager.class);
	/**
	 * @param userName
	 */
	public void demo(String userName){
		try{
			logger.info("login by given user name: {}",userName);
			
			// do login logic
			
		}finally{
			logger.info(" is Login successful? {}",
					userMg.isAuthenticated());
		}
	}
	
	
	
	
	
	
	
	
	
}
