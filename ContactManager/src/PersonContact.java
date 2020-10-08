
public class PersonContact extends BaseContact{
	
	private String dateOfBirth;
	private String description;
	private PersonContact[] relatives;
	
	
	public PersonContact(String dateOfBirth, String description) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.description = description;
	}
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public PersonContact[] getRelatives() {
		return relatives;
	}
	public void setRelatives(PersonContact[] relatives) {
		this.relatives = relatives;
	}
	
	
}
