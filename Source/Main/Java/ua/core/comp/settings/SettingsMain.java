package ua.core.comp.settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ua.core.utils.MapIgnoreCase;

public class SettingsMain extends SettingsBase implements Settings {

	private Map <String, String> appPropsMap = new MapIgnoreCase <String>();

	
	public SettingsMain() {
	}

	public SettingsMain (String [][] appPropsArray) {
		
		for (String[] appPropPair : appPropsArray) {
			setItem (appPropPair[0], appPropPair[1]);
		}
	}
	
	/**
	 * Return the matching item in a list. Item lists are not supported in this version of App Properties Type.
	 * 
	 * Inefficient hack (time constraints).
	 * 
	 */
	@Override
	public List <String> getStrings (String name) {
		
		List <String> matchingStrings = new ArrayList<>();
		String value;

		value = getItem (name);
		
		if (value != null) {
			matchingStrings.add (value);
		}
		
		return matchingStrings;
	}

	
	@Override
	public Set <String> getKeys() {
		
		return appPropsMap.keySet();
	}
	
	@Override
	String getItem (String name) {

		return appPropsMap.get (name);
	}
		
	@Override
	boolean hasItem (String name) {

		return appPropsMap.containsKey (name);
	}
	
	@Override
	void setItem (String name, String value) {

		appPropsMap.put (name, value);
	}
}
