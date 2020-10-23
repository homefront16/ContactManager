import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

/*
	Name: Raymond Popsie
	Date: 9/28/2020
	File: ConsoleApp.Java
	Purpose: This class will be responsible for testing various methods throughout
	the program. It will act as the GUI until one is made at a later date. 
*/
public class ConsoleApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		//List<Location> theLocations = new ArrayList<Location>();
		//Location theLocation = new Location();
		
		 List<BaseContact> theList = new ArrayList<BaseContact>(); 
		 FileAccessService FAS = new FileAccessService();
		 
		 theList = FAS.readAllPersonContacts2();
		  
			/*
			 * for(int i = 0; i < theList.size(); i++) {
			 * System.out.println(theList.get(i).name);
			 * System.out.println("==============================================="); }
			 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Photo testPhoto = new Photo(1, "profilePhoto.jpg", "01-10-2020",
		"Photo for profile"); 
		List<Photo> testListPhotographs = new LinkedList<Photo>(); 
		testListPhotographs.add(testPhoto);
		
		 Location testLocation = new Location(0, "Recker Rd", "Gilbert", "Arizona");
		 
		 PersonContact testPerson = new PersonContact("Frank Lucas", "4763243", "10-1-1991", testListPhotographs, testLocation, "This is my test persons description");
		 
		List<BaseContact> myPersonContactList = new LinkedList<BaseContact>();
		myPersonContactList.add(testPerson); 
		AddressBook myAddressBook = new AddressBook(myPersonContactList);
		 
		myAddressBook.displayPerson(0);
		
		//FileAccessService FAS = new FileAccessService();
		
		
		
		//System.exit(0);
		//System.out.println("=================================");
		
		/*
		 * File file = new File("testFile.txt"); try { List lines =
		 * FileUtils.readLines(file, "UTF-8"); for(int i = 0; i < lines.size(); i++) {
		 * System.out.println(lines.get(i)); lines.spliterator(); } } catch (IOException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		
		/*
		 * myAddressBook.changePersonName(0, "Whitney Houston");
		 * myAddressBook.displayPerson(0);
		 * System.out.println("=================================");
		 * System.out.println(myAddressBook.getPersonContacts().size());
		 * System.out.println("=================================");
		 * myAddressBook.removePerson(0);
		 * System.out.println(myAddressBook.getPersonContacts().size());
		 * System.out.println("=================================");
		 * myAddressBook.addPerson(testPerson);
		 * System.out.println(myAddressBook.getPersonContacts().size());
		 * System.out.println("=================================");
		 * myAddressBook.searchpersonByName(0, "Whitney Houston");
		 * System.out.println("=================================");
		 * myAddressBook.searchPersonByCity(0, "Gilbert");
		 */
		
		/* This myScanner will be opened to receive input from a user */
		Scanner myScanner = new Scanner(System.in);
		
		// User working is true until the user chooses to exit the program
		boolean userWorking = true;
		int userInput = 5; // default value of 5 so that if no input is received it will exit the program
		while(userWorking) {
			
			System.out.println("Choose 1: for adding a contact");
			System.out.println("Choose 2: for listing all contacts");
			System.out.println("Choose 3: for selecting a Contact by ID number");
			System.out.println("Choose 4: for contacts by their name, City, State etc...");
			System.out.println("Choose 5: to exit the program");
		
			userInput = myScanner.nextInt();

			/* The switch statement gives the user 5 choice. 
			 * The user can add a contact, get a list of all contact, 
			 * select a contact by ID, or search by their name, city, or state.  */
			switch (userInput) 
			{
			case 1: userInput = 1;
				int counter = 0;
				
				System.out.println("Please enter your street address ");
				String streetAddress = myScanner.next();
				System.out.println("Please enter your City ");
				String city = myScanner.next();
				System.out.println("Please enter your State ");
				String state = myScanner.next();
				Location userLocation = new Location(counter + 1, streetAddress, city, state);
				
				System.out.println("Please enter the file path for your Photograph");
				String filePath = myScanner.next();
				System.out.println("Please enter the date of the photograph");
				String dateOfPhoto = myScanner.next();
				System.out.println("Please enter the description of your photograph");
				String description = myScanner.next();
				
				Photo userPhoto = new Photo(counter + 1, filePath, dateOfPhoto, description);
				List<Photo> userPhotographs = new LinkedList<>();
				userPhotographs.add(userPhoto);
				
				System.out.println("Please enter the name of your contact");
				String name = myScanner.next();
				System.out.println("Please enter your phone number");
				String phoneNumber = myScanner.next();
				System.out.println("Please enter the date of birth of your contact");
				String userDateOfBirth = myScanner.next();
				System.out.println("Please enter a description of your contact");
				String contactDescription = myScanner.next();
				
				PersonContact userContact = new PersonContact(name, phoneNumber, userDateOfBirth, 
						userPhotographs, userLocation, contactDescription);
				
				myPersonContactList.add(userContact);
				
				
				
				break;
				
			case 2: userInput = 2;
				if (myPersonContactList.size() < 1) {
					System.out.println("There is no one in your contact list. Please "
							+ "add a contact before listing all of your contacts");
					break;
				}
				for(int i = 0; i < myPersonContactList.size(); i++) {
					System.out.println(myPersonContactList.get(i).getName());
					System.out.println(myPersonContactList.get(i).getPhoneNumber());
					System.out.println(myPersonContactList.get(i).getLocation().getStreet());
					System.out.println(myPersonContactList.get(i).getLocation().getCity());
					System.out.println(myPersonContactList.get(i).getLocation().getState());
					System.out.println("==============");
				}
				break;
				
			case 3: userInput = 3;
				System.out.println("Please provide ID number of your Contact");
				int personID = myScanner.nextInt();
				myAddressBook.displayPerson(personID);
				System.out.println("Would you like to edit this person? " +
				 "enter 1 to Edit and 2 to return to the main menu");
				int editChoice = myScanner.nextInt();
				if(editChoice == 1) {
					System.out.println("Please enter the new name for your contact");
					String updatedName = myScanner.next();
					myAddressBook.changePersonName(personID, updatedName);
					System.out.println("You have updated the name to " + updatedName);
				}
				else if(editChoice == 2){
					break;
				}
				else {
					System.out.println("That is not a valid selection. Returning to main menu");
				}
				
				break;
				
			case 4: userInput = 4;
				System.out.println("Enter an option:");
				System.out.println("1 Search by name");
				System.out.println("2 Search by City");
				System.out.println("3 Search by State");
				
				int userSearchChoice = myScanner.nextInt();
				System.out.println("Please enter your search word");
				String searchWord = myScanner.next();
				myAddressBook.displayFullList(myAddressBook.searchForPeople(searchWord, userSearchChoice));
				break;
			
			case 5: userInput = 5;
			userWorking = false; 
			myScanner.close(); 
			break;
		}

		
		
			
		
	}
		FAS.writeAllData(myAddressBook);

}}
