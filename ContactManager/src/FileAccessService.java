import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
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
	public void readAllContacts() {
		
		//AddressBook theAddressBook = new AddressBook();
		/*
		 * List<PersonContact> listOfPersonContacts = new ArrayList<PersonContact>();
		 * 
		 * try { listOfPersonContacts = new
		 * ObjectMapper().readerFor(PersonContact.class).readValue(new
		 * File("MOCK_DATA.json"));
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * 
		 * }
		 */
		
	}
	
	public List<Location> readAllPersonContacts() throws FileNotFoundException{

		
	
		try {
			ObjectMapper mapper = new ObjectMapper();
			InputStream inputStream = new FileInputStream(new File("locations.json"));

			TypeReference<List<Location>> typeReference = new TypeReference<List<Location>>() {};
			List<Location> locations = mapper.readValue(inputStream, typeReference);
			
			return locations;
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
	
	public List<BaseContact> readAllPersonContacts2() throws FileNotFoundException{

		
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			InputStream inputStream = new FileInputStream(new File("PersonContactCorrect3.json"));

			TypeReference<List<BaseContact>> typeReference = new TypeReference<List<BaseContact>>() {};
			List<BaseContact> personContacts = mapper.readValue(inputStream, typeReference);
			
			return personContacts;
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
	
		public void writeAllData(AddressBook theBook) {
		ObjectMapper om = new ObjectMapper();
		
		try {
			om.writerWithDefaultPrettyPrinter().writeValue(new File("PersonContactCorrect.json"), theBook);
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
