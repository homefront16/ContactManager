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
	
	public void displayPerson() {
		
	}
	
	public void changePersonName() {
		
	}
	
	public void addPerson() {
		
	}
	
	public void removePerson() {
		
	}
	
	public void personSort() {
		
	}
	
	public void searchpersonByName() {
		
	}
	
	public void searchPersonByCity() {
		
	}
	

}
