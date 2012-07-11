/**
 * 
 */
package idv.zanyking.javatwo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.zkoss.xel.VariableResolver;
import org.zkoss.xel.XelException;

/**
 * @author Ian YT Tsai (zanyking)
 *
 */
public class DummyVariableResolver implements VariableResolver{

	private Map<String, Object> map = new HashMap<String, Object>();
	
	public DummyVariableResolver(){
		map.put("user", new User("Ian", "Tsai"));
		ArrayList<City> cities = new ArrayList<City>();
		cities.add(new City("Taipei", "A lot of good restaurants, a lot of scooters."));
		cities.add(new City("Shanghai", "New highrise are everywhere, goods are over priced."));
		cities.add(new City("Seoul", "Traditional BBQ is expensive, but worth a try."));
		cities.add(new City("Mumbai", "City side by desert, only rich people can live there."));
		cities.add(new City("Tokyo", "Capital of Japan, Haven for shopping."));
		map.put("cities", cities);
	}
	/* (non-Javadoc)
	 * @see org.zkoss.xel.VariableResolver#resolveVariable(java.lang.String)
	 */
	public Object resolveVariable(String name) throws XelException {
		return map.get(name);
	}

}
