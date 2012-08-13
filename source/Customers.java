/**
 * @author Aravind
 * @date 10-Aug-2012
 *
 */


package source;

import java.util.HashMap;

public class Customers {
	private String CustomerId;
	private String FirstName;
	private String LastName;
	private String Gender;
	private String YearOfBirth;
	private String MaritalStatus;
	private String StreetAddress;
	private String PostalCode;
	private String City;
	private String CityId;
	private String StateProvince;
	private String StateProvinceId;
	private String CountryId;
	private String MainPhoneNumber;
	private String IncomeLevel;
	private String CreditLimit;
	private String Email;
	private String Total;
	private String TotalId;
	private String SrcId;
	private String EffFrom;
	private String EffTo;
	private String Valid;

	public Customers() {
		
	}
	
	public Customers(HashMap<String, Object> custMap) {
		this.CustomerId = (String) custMap.get("CUST_ID");
		this.FirstName = (String) custMap.get("CUST_FIRST_NAME");
		this.LastName = (String) custMap.get("CUST_LAST_NAME");
		this.Gender = (String) custMap.get("CUST_GENDER");
		this.YearOfBirth = (String) custMap.get("CUST_YEAR_OF_BIRTH");
		this.MaritalStatus = (String) custMap.get("CUST_MARITAL_STATUS");
		this.StreetAddress = (String) custMap.get("CUST_STREET_ADDRESS");
		this.PostalCode = (String) custMap.get("CUST_POSTAL_CODE");
		this.City = (String) custMap.get("CUST_CITY");
		this.CityId = (String) custMap.get("CUST_CITY_ID");
		this.StateProvince = (String) custMap.get("CUST_STATE_PROVINCE");
		this.StateProvinceId = (String) custMap.get("CUST_STATE_PROVINCE_ID");
		this.CountryId = (String) custMap.get("COUNTRY_ID");
		this.MainPhoneNumber = (String) custMap.get("CUST_MAIN_PHONE_NUMBER");
		this.IncomeLevel = (String) custMap.get("CUST_INCOME_LEVEL");
		this.CreditLimit = (String) custMap.get("CUST_CREDIT_LIMIT");
		this.Email = (String) custMap.get("CUST_EMAIL");
		this.Total = (String) custMap.get("CUST_TOTAL");
		this.TotalId = (String) custMap.get("CUST_TOTAL_ID");
		this.SrcId = (String) custMap.get("CUST_SRC_ID");
		this.EffFrom = (String) custMap.get("CUST_EFF_FROM");
		this.EffTo = (String) custMap.get("CUST_EFF_TO");
		this.Valid = (String) custMap.get("CUST_VALID");		
	}
	
	public void assignValues(HashMap<String, Object> custMap) {
		this.CustomerId = (String) custMap.get("CUST_ID");
		this.FirstName = (String) custMap.get("CUST_FIRST_NAME");
		this.LastName = (String) custMap.get("CUST_LAST_NAME");
		this.Gender = (String) custMap.get("CUST_GENDER");
		this.YearOfBirth = (String) custMap.get("CUST_YEAR_OF_BIRTH");
		this.MaritalStatus = (String) custMap.get("CUST_MARITAL_STATUS");
		this.StreetAddress = (String) custMap.get("CUST_STREET_ADDRESS");
		this.PostalCode = (String) custMap.get("CUST_POSTAL_CODE");
		this.City = (String) custMap.get("CUST_CITY");
		this.CityId = (String) custMap.get("CUST_CITY_ID");
		this.StateProvince = (String) custMap.get("CUST_STATE_PROVINCE");
		this.StateProvinceId = (String) custMap.get("CUST_STATE_PROVINCE_ID");
		this.CountryId = (String) custMap.get("COUNTRY_ID");
		this.MainPhoneNumber = (String) custMap.get("CUST_MAIN_PHONE_NUMBER");
		this.IncomeLevel = (String) custMap.get("CUST_INCOME_LEVEL");
		this.CreditLimit = (String) custMap.get("CUST_CREDIT_LIMIT");
		this.Email = (String) custMap.get("CUST_EMAIL");
		this.Total = (String) custMap.get("CUST_TOTAL");
		this.TotalId = (String) custMap.get("CUST_TOTAL_ID");
		this.SrcId = (String) custMap.get("CUST_SRC_ID");
		this.EffFrom = (String) custMap.get("CUST_EFF_FROM");
		this.EffTo = (String) custMap.get("CUST_EFF_TO");
		this.Valid = (String) custMap.get("CUST_VALID");		
	}
	
	public void setCustomerId(String custId) {
		this.CustomerId = custId;
	}
	
	public String getCustomerId() {
		return this.CustomerId;
	}
	
	public void setFirstName(String fName) {	
		this.FirstName = fName;
	}
	
	public String getFirstName() {
		return this.FirstName;
	}
	
	public void setLastName(String lName) {
		this.LastName = lName;
	}
	
	public String getLastName() {
		return this.LastName;
	}
	
	public void setGender(String gender) {
		this.Gender = gender;
	}
	
	public String getGender() {
		return this.Gender;
	}
	
	public void setYearOfBirth(String yob) {
		this.YearOfBirth = yob;
	}
	
	public String getYearOfBirth() {
		return this.YearOfBirth;
	}
	
	public void setMaritalStatus(String mStatus) {
		this.MaritalStatus = mStatus;
	}
	
	public String getMaritalStatus() {
		return this.MaritalStatus;
	}
	
	public void setStreetAddress(String addr) {
		this.StreetAddress = addr;
	}
	
	public String getStreetAddress() {
		return this.StreetAddress;
	}
	
	public void setPostalCode (String pCode) {
		this.PostalCode = pCode;
	}
	
	public String getPostalCode() {
		return this.PostalCode;
	}
	
	public void setCity(String city) {
		this.City = city;
	}
	
	public String getCity() {
		return this.City;
	}
	
	public void setCityId(String id) {
		this.CityId = id;
	}
	
	public String getCityId() {
		return this.CityId;
	}
	
	public void setStateProvince(String province) {
		this.StateProvince = province;
	}
	
	public String getStateProvince() {
		return this.StateProvince;
	}
	
	public void setStateProvinceId(String provinceId) {
		this.StateProvinceId = provinceId;
	}
	
	public String getStateProvinceId() {
		return this.StateProvinceId;
	}
	
	public void setCountryId(String ctryId) {
		this.CountryId = ctryId;
	}
	
	public String getCountryId() {
		return this.CountryId;
	}
	
	public void setMainPhoneNumber(String pNumber) {
		this.MainPhoneNumber = pNumber;
	}
	
	public String getMainPhoneNumber() {
		return this.MainPhoneNumber;
	}
	
	public void setIncomeLevel(String income) {
		this.IncomeLevel = income;
	}
	
	public String getIncomeLevel() {
		return this.IncomeLevel;
	}
	
	public void setCreditLimit(String limit) {
		this.CreditLimit = limit;
	}
	
	public String getCreditLimit() {
		return this.CreditLimit;
	}
	
	public void setEmail(String mail) {
		this.Email = mail;
	}
	
	public String getEmail() {
		return this.Email;
	}
	
	public void setTotal(String total) {
		this.Total = total;
	}
	
	public String getTotal() {
		return this.Total;
	}
	
	public void setTotalId(String totalId) {
		this.TotalId = totalId;
	}
	
	public String getTotalId() {
		return this.TotalId;
	}
	
	public void setSrcId(String srcId) {
		this.SrcId = srcId;
	}
	
	public String getSrcId() {
		return this.SrcId;
	}
	
	public void setEffFrom(String from) {
		this.EffFrom = from;
	}
	
	public String getEffFrom() {
		return this.EffFrom;
	}
	
	public void setEffTo(String to) {
		this.EffTo = to;
	}
	
	public String getEffTo() {
		return this.EffTo;
	}
	
	public void setValid(String valid) {
		this.Valid = valid;
	}
	
	public String getValid() {
		return this.Valid;
	}

}
