package smartCityPackage;

public class Colleges_universities {
	private String CU_Name,Address,Email,Website;
	private long Contact;


	Colleges_universities(String name, String address,String email,String website,long contact){
	this.CU_Name=name;
	this.Address= address;
	this.Email=email;
	this.Website=website;
	this.Contact=contact;
}

public long getContact(){
	return Contact;
}
public String getAddress(){
	return Address;
}
public String getWebsite(){
	return Website;
}
public String getEmail() {
	return Email;
}


public void setAddress(String address) {
	Address=address;
}
public void setWebsite(String website) {
	this.Website=website;
	}
public void setContact(long contact) {
	Contact=contact;
}
public void setEmail(String email) {
	this.Email=email;
}

public void displayInfo() {
	System.out.println(CU_Name);
	System.out.println("*******************");
	System.out.println("Address :"+ Address);
	System.out.println("e-mail  :" + Email);
	System.out.println("Contact : 04146-" + Contact);
	System.out.println("Website :" + Website);
	System.out.println("");
}
}