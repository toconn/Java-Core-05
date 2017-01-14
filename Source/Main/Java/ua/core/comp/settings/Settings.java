package ua.core.comp.settings;

import java.util.List;
import java.util.Set;

import ua.core.base.ExceptionInvalidValue;

public interface Settings {

	public Set <String> getKeys();
	
	public boolean getBoolean (String name) throws ExceptionInvalidValue;
	public int getInt (String name) throws ExceptionInvalidValue;
	public long getLong (String name) throws ExceptionInvalidValue;
	public String getString (String name);
	public List <String> getStrings (String name);
	
	public boolean hasBoolean (String name);
	public boolean hasInt (String name);
	public boolean hasLong (String name);
	public boolean hasProperty (String name);
	
	public void set (String name, boolean value);
	public void set (String name, int value);
	public void set (String name, long value);
	public void set (String name, String value);
}
