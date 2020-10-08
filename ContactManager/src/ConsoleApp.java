import java.util.LinkedList;
import java.util.List;

/*
	Name: Raymond Popsie
	Date: 9/28/2020
	File: ConsoleApp.Java
	Purpose: This class will be responsible for testing various methods throughout
	the program. It will act as the GUI until one is made at a later date. 
*/
public class ConsoleApp {

	public static void main(String[] args) {
		
		Photo testPhoto = new Photo(1, "profilePhoto.jpg", "01-10-2020", "Photo for profile");
		List<Photo> testListPhotographs = new LinkedList<Photo>();
		testListPhotographs.add(testPhoto);
		
		Location testLocation = new Location(0, "Recker Rd", "Gilbert", "Arizona");
		PersonContact testPerson = new PersonContact("Frank Lucas", 5763243, "10-1-1991", testListPhotographs,
				testLocation, "This is my test persons description");
		
		List<PersonContact> myPersonContactList = new LinkedList<PersonContact>();
		myPersonContactList.add(testPerson);
		AddressBook myAddressBook = new AddressBook(myPersonContactList);
		
		myAddressBook.displayPerson(0);
		System.out.println("=================================");
		myAddressBook.changePersonName(0, "Whitney Houston");
		myAddressBook.displayPerson(0);
		System.out.println("=================================");
		System.out.println(myAddressBook.getPersonContacts().size());
		System.out.println("=================================");
		myAddressBook.removePerson(0);
		System.out.println(myAddressBook.getPersonContacts().size());
		System.out.println("=================================");
		myAddressBook.addPerson(testPerson);
		System.out.println(myAddressBook.getPersonContacts().size());
		System.out.println("=================================");
		myAddressBook.searchpersonByName(0, "Whitney Houston");
		System.out.println("=================================");
		myAddressBook.searchPersonByCity(0, "Gilbert");
		
		
		
		
	}

}
