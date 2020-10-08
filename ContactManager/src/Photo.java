
public class Photo {
	private int photoID;
	private String fileName;
	private String dateOfPhoto;
	private String description;
	
	public Photo(int photoID, String fileName, String dateOfPhoto, String description) {
		super();
		this.photoID = photoID;
		this.fileName = fileName;
		this.dateOfPhoto = dateOfPhoto;
		this.description = description;
	}
	
	public int getPhotoID() {
		return photoID;
	}
	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDateOfPhoto() {
		return dateOfPhoto;
	}
	public void setDateOfPhoto(String dateOfPhoto) {
		this.dateOfPhoto = dateOfPhoto;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
