/*
	Name: Raymond Popsie
	Date: 9/28/2020
	File: BaseContact.Java
	Purpose: This abstract class is the base for Conctact classes. Contact classes
	will have a number, name, phone, list of photographs, and a location. 
*/

import java.util.List;

public abstract class BaseContact {
	protected String name;
	protected int phoneNumber;
	protected List<Photo> photographs;
	protected Location location;
	
}
