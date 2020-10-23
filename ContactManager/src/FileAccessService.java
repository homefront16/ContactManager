import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
	Name: Raymond Popsie
	Date: 9/28/2020
	File: FileAccessService.Java
	Purpose: This class will be responsible for sending and receiving data from a 
	other files such as a text file.  
*/
public class FileAccessService implements DataAccessService{

	@Override
	public List<BaseContact> readAllContacts() {

		try {
			ObjectMapper mapper = new ObjectMapper();
			//InputStream inputStream = new FileInputStream(new File("PersonContactCorrect.json"));
			mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

			ContactsWrapper contactsWrapper = new ObjectMapper().readerFor(ContactsWrapper.class).readValue(new File("PersonContactCorrect.json"));

			//TypeReference<List<BaseContact>> typeReference = new TypeReference<List<BaseContact>>() {};
			//List<BaseContact> personContacts = mapper.readValue(new File("PersonContactCorrect.json"), typeReference);
			
			return contactsWrapper.getContactList();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		return null;
		
	}
	
	/*
	 * public List<Location> readAllPersonContacts() throws FileNotFoundException{
	 * 
	 * 
	 * 
	 * try { ObjectMapper mapper = new ObjectMapper(); InputStream inputStream = new
	 * FileInputStream(new File("locations.json"));
	 * 
	 * TypeReference<List<Location>> typeReference = new
	 * TypeReference<List<Location>>() {}; List<Location> locations =
	 * mapper.readValue(inputStream, typeReference);
	 * 
	 * return locations; } catch (JsonParseException e) { // TODO Auto-generated
	 * catch block e.printStackTrace();
	 * 
	 * } catch (JsonMappingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * return null;
	 * 
	 * }
	 */
	
	/*
	 * public List<BaseContact> readContacts() throws FileNotFoundException{
	 * 
	 * 
	 * 
	 * try { ObjectMapper mapper = new ObjectMapper(); //InputStream inputStream =
	 * new FileInputStream(new File("PersonContactCorrect.json"));
	 * mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	 * 
	 * ContactsWrapper contactsWrapper = new
	 * ObjectMapper().readerFor(ContactsWrapper.class).readValue(new
	 * File("PersonContactCorrect.json"));
	 * 
	 * //TypeReference<List<BaseContact>> typeReference = new
	 * TypeReference<List<BaseContact>>() {}; //List<BaseContact> personContacts =
	 * mapper.readValue(new File("PersonContactCorrect.json"), typeReference);
	 * 
	 * return contactsWrapper.getContactList(); } catch (JsonParseException e) { //
	 * TODO Auto-generated catch block e.printStackTrace();
	 * 
	 * } catch (JsonMappingException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * return null;
	 * 
	 * }
	 */
	
		public void writeAllData(AddressBook theBook) {
		ObjectMapper om = new ObjectMapper();
		
		
		ContactsWrapper contactsWrapper = new ContactsWrapper();
		contactsWrapper.setContactList(theBook.getContactList());
		
		try {
			om.writerWithDefaultPrettyPrinter().writeValue(new File("PersonContactCorrect.json"), contactsWrapper);
		} catch (JsonGenerationException e) {
		
			e.printStackTrace();
		} catch (JsonMappingException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}

	public void saveAllContacts(AddressBook theBook) {

		ObjectMapper om = new ObjectMapper();
		
		ContactsWrapper contactsWrapper = new ContactsWrapper();
		contactsWrapper.setContactList(theBook.getContactList());
		
		try {
			om.writerWithDefaultPrettyPrinter().writeValue(new File("PersonContactCorrect.json"), contactsWrapper);
		} catch (JsonGenerationException e) {
		
			e.printStackTrace();
		} catch (JsonMappingException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}

	@Override
	public void saveAllContacts() {
		// TODO Auto-generated method stub
		
	}

}
