/*
	Name: Raymond Popsie
	Date: 9/28/2020
	File: BusinessContact.Java
	Purpose: This class will be responsible business contacts. Business contacts
	will have a business hours, days, business phone number, and photographs. 
*/

import java.math.BigInteger;
import java.util.List;

public class BusinessContact extends BaseContact{
	
		private String businessHours;
		private String businessDays;
		private String websiteURL;
		
		public BusinessContact(String businessHours, String businessDays, String websiteURL, int phoneNumber, List<Photo> photographs) {
			
			this.businessHours = businessHours;
			this.businessDays = businessDays;
			this.websiteURL = websiteURL;
			this.phoneNumber = phoneNumber;
			this.photographs = photographs;
		}
		
		public String getBusinessHours() {
			return businessHours;
		}
		public void setBusinessHours(String businessHours) {
			this.businessHours = businessHours;
		}
		public String getBusinessDays() {
			return businessDays;
		}
		public void setBusinessDays(String businessDays) {
			this.businessDays = businessDays;
		}
		public String getWebsiteURL() {
			return websiteURL;
		}
		public void setWebsiteURL(String websiteURL) {
			this.websiteURL = websiteURL;
		}
		
		
}
