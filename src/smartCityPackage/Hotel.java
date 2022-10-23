package smartCityPackage;

public class Hotel {
	private String Name,Address;
	private String AC;
	private long Contact;
int SerialNo,Rooms;

Hotel(String name,int serialno, String ac,int rooms,String address,long contact){
	this.Name=name;
	this.SerialNo=serialno;
	this.AC=ac;
	this.Rooms=rooms;
	this.Address= address;
	this.Contact=contact;	
	
}
	
public long getContact(){
	return Contact;
}
public int getRooms(){
	return Rooms;
}
public void setRooms(int rooms) {
	Rooms=rooms;
}
public int getSerialNo(){
	return SerialNo;
}
public void getSerialNo(int serialno) {
	SerialNo=serialno;
	}
public void setContact(long contact) {
	Contact=contact;
}
public String isAC() {
	return AC;
}
public void setAC(String ac) {
	AC=ac;
}
public void displayHotelInfo() {
	System.out.println("Hotel no     :"+ SerialNo);
	System.out.println("Name         :" + Name);
	System.out.println("Ac and Non Ac:" + AC);
	System.out.println("Address      :" + Address);
	System.out.println("Contact      :" + Contact);
	System.out.println("");
}
}

