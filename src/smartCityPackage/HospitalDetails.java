package smartCityPackage;

public class HospitalDetails {
	private String HospitalName,Type,Address,Hours,Email;
	private long Contact;


HospitalDetails(String name,String type, String address, String hours,String email,long contact){
	this.HospitalName=name;
	this.Address= address;
	this.Hours=hours;
	this.Email=email;
	this.Contact=contact;	
	this.Type=type;
}

public long getContact(){
	return Contact;
}
public String getAddress(){
	return Address;
}
public String getHours(){
	return Hours;
}
public String getEmail() {
	return Email;
}
public String getType() {
	return Type;
}

public void setAddress(String address) {
	Address=address;
}
public void setHours(String hours) {
	this.Hours=hours;
	}
public void setContact(long contact) {
	Contact=contact;
}
public void setEmail(String email) {
	this.Email=email;
}
public void setType(String type) {
this.Type=type;
}

public void displayHosInfo() {
	System.out.println(HospitalName);
	System.out.println("*******************");
	System.out.println(Type);
	System.out.println("Address :"+ Address);
	System.out.println("Open    :" + Hours);
	System.out.println("Contact : 04146-" + Contact);
	System.out.println("e-mail  :" + Email);
	System.out.println("");
}


}



