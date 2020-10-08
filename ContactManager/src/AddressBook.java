/*
	Name: Raymond Popsie
	Date: 9/28/2020
	File: AddressBook.Java
	Purpose: This class will be responsible for adding, removing, editing, and searching
	for contacts. The class will perform most of the actions related to the Contact classes.
*/
import java.util.List;

public class AddressBook {
	private List<PersonContact> personContacts;
	private List<BusinessContact> businessContacts;
	
	
	public AddressBook(List<PersonContact> personContacts) {
		this.personContacts = personContacts;
	}
	
	public AddressBook() {
		
	}
	
	public List<PersonContact> getPersonContacts() {
		return personContacts;
	}
	public void setPersonContacts(List<PersonContact> personContacts) {
		this.personContacts = personContacts;
	}
	public List<BusinessContact> getBusinessContacts() {
		return businessContacts;
	}
	public void setBusinessContacts(List<BusinessContact> businessContacts) {
		this.businessContacts = businessContacts;
	}
	
	/* Method will return a Persons name, description, and date of birth.
	 * The personID integer is used as the index for the list of person contacts. */
	public void displayPerson(int personID) {
		System.out.println(personContacts.get(personID).getName());
		System.out.println(personContacts.get(personID).getDescription());
		System.out.println(personContacts.get(personID).getDateOfBirth());
	}
	
	/* Method will change a persons name given their index in the list
	 * and will use the String value entered as the updated name value. */
	public void changePersonName(int index, String updatedName) {
		personContacts.get(index).setName(updatedName);
	}
	
	// Method will add a person to the given list of person contacts
	public void addPerson(PersonContact person) {
		personContacts.add(person);
	}
	
	// Method will remove a person to the given the index number of the person
	public void removePerson(int index) {
		personContacts.remove(index);
	}
	
	public void personSort() {
		
	}

	/* Method will search the list of contacts given by name. Currently
	 * the search is case sensitive. It will then display the name, description
	 * and date of birth properties if the name is found.*/
	public void searchpersonByName(int index, String searchWord) {
		if(personContacts.get(index).getName() == searchWord) {
			System.out.println(personContacts.get(index).getName());
			System.out.println(personContacts.get(index).getDescription());
			System.out.println(personContacts.get(index).getDateOfBirth());
		}
	}
	
	/* Method will search the list of contacts given by City. Currently
	 * the search is case sensitive. It will then display the name, description
	 * and date of birth properties if the name is found.*/
	public void searchPersonByCity(int index, String searchWord) {
		if(personContacts.get(index).location.getCity() == searchWord) {
			System.out.println(personContacts.get(index).getName());
			System.out.println(personContacts.get(index).getDescription());
			System.out.println(personContacts.get(index).getDateOfBirth());
		}
	}
	

}
