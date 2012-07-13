/* UserVM2.java

	Purpose:
		
	Description:
		
	History:
		Jul 13, 2012, Created by Ian Tsai(Zanyking)

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under ZOL in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package idv.zanyking.javatwo;

import java.util.List;

import idv.zanyking.javatwo.model.City;
import idv.zanyking.javatwo.model.DummyVariableResolver;
import idv.zanyking.javatwo.model.User;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

/**
 * @author Ian Y.T Tsai(zanyking)
 *
 */
@VariableResolver(DummyVariableResolver.class)
public class UserVM2 {

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
