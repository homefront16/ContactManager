
public class BusinessContact extends BaseContact{
	
		private String businessHours;
		private String businessDays;
		private String websiteURL;
		
		public BusinessContact(String businessHours, String businessDays, String websiteURL) {
			super();
			this.businessHours = businessHours;
			this.businessDays = businessDays;
			this.websiteURL = websiteURL;
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
