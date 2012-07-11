/**
 * 
 */
package idv.zanyking.javatwo;

import idv.zanyking.javatwo.model.City;
import idv.zanyking.javatwo.model.DummyVariableResolver;
import idv.zanyking.javatwo.model.User;

import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;


/**
 * @author Ian YT Tsai (zanyking)
 *
 */

@VariableResolver(DummyVariableResolver.class)
public class UserVM {
	
	@WireVariable
	private List<City> cities;

	public List<City> getCities() {
		return cities;
	}
	
	private User user;
	@Init
	public void doInit(){
		user = new User("Ian", "Tsai");
	}
	public User getUser() {
		return user;
	}
	
}



