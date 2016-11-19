/**
 * 
 */
package jyosh.udacity.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Subash
 *
 */
public class DictionariesImpl {
	
	HashMap<String, Map<String, List<String>>> continent = new HashMap<String, Map<String, List<String>>>();
	HashMap<String, List<String>> countries = null;
	
	public DictionariesImpl() {
		countries = new HashMap<String, List<String>>();
		countries.put("India", Arrays.asList("Bangalore","Delhi","Mumbai"));
		continent.put("Asia", countries);
		
		countries = new HashMap<String, List<String>>();
		countries.put("USA", Arrays.asList("Atlanta","Jersey City","New york"));
		continent.put("NorthAmerica", countries);
		
		countries = new HashMap<String, List<String>>();
		countries.put("Egypt", Arrays.asList("Cairo"));
		continent.put("Africa", countries);
		
		continent.get("Asia").put("China", Arrays.asList("Shangai"));
	}
	
	public  List<String> getCities(){
		List<String> cities = new ArrayList<String>();
		
		for(String continentKey: continent.keySet()){
			Map<String, List<String>> countries = continent.get(continentKey);
			for(String countryKey: countries.keySet()){
				cities.addAll(countries.get(countryKey));
			}
		}
		String[] citiesArray = new String[cities.size()];
		citiesArray = cities.toArray(citiesArray); 
		Arrays.sort(citiesArray);
		return Arrays.asList(citiesArray);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> cities = new DictionariesImpl().getCities();
		System.out.println(cities);

	}

}
