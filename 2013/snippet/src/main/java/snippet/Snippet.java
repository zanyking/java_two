/**
 * 
 */
package snippet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ian YT Tsai(Zanyking)
 * @since 2013/8/1
 */
public class Snippet implements Filter {
	private static final Logger logger = LoggerFactory.getLogger(Snippet.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		
		
		long start = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		logger.info("service ["+req.getRequestURI()+"] elapsed time: "+
			(System.currentTimeMillis()-start) +" ms");
	
		
		
		
		
		doFilter1(request, response, chain);
	}

	private void doFilter1(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		Thread.currentThread().getStackTrace();
		
		try{
			
			Blackbox.tracePush("request URL: "+req.getRequestURI());
			
			filterChain.doFilter(req, response);
		}finally{
			Blackbox.tracePop("End of request");
			Blackbox.flush();// output to Console...
		}
		
		
		
	}

	
	
	
	private void doMethod(){

		try {
			Blackbox.tracePush(">> start method ");

			// Original code...

		} finally {
			Blackbox.tracePop("End method");
		}
	}
	
	private void binarySearch(String userName){
		
		
		
		try{
			Blackbox.tracePush(">> getUserInfo() user: "+userName);
			// input check and authorization
			
			Blackbox.trace("step0");
			// init Service Object
			
			Blackbox.trace("step1");
			// retrieve UserInfo from Service Object
			
			Blackbox.trace("step2");
			// bla bla bla...
			
		}finally{
			Blackbox.tracePop("End of getUserInfo()");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
