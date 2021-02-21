package oops;
class Address{
	private String addressLine;
	private String city;
	public Address(String addressLine, String city) {
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	void getAddressDetails(){
		System.out.println(addressLine + ", " + city);
	}
	
}
class Customer{
	private String customerName;
	Address residentialAddress;
	Address officialAddress;
	public Customer(String customerName, Address residentialAddress) {
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress= officialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress() {
		this.residentialAddress = residentialAddress;
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	void getCustomerDetails()
	{
		System.out.println("Customer: " +customerName);
		System.out.println("Residential Address: " + residentialAddress);
		System.out.println("oficial address is: " + officialAddress);
		
	}
	
	
	
}

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("1st Main HSR Layout","Bangalore");
		Customer c1=new Customer("john",address1);
		c1.getCustomerDetails();

	}

}
