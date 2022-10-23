package smartCityPackage;

public class Bankdetails {
		private String BankName,Address,IFSC,MICR,BranchCode;
		private String BranchName;
		private long Contact;


	Bankdetails(String name,String address, String IFSC,String MICR,String BranchName,String branchcode,long contact){
		this.BankName=name;
		this.Address= address;
		this.IFSC=IFSC;
		this.MICR=MICR;
		this.BranchName=BranchName;
		this.BranchCode=branchcode;
		this.Contact=contact;	
		
	}
	
	public long getContact(){
		return Contact;
	}
	public String getAddress(){
		return Address;
	}
	public String getIFSC(){
		return IFSC;
	}
	public String getMICR() {
		return MICR;
	}
	public String getBranchName() {
		return BranchName;
	}
	public String getBranchCode() {
		return BranchCode;
	}
	public void setAddress(String address) {
		Address=address;
	}
	public void setMICR(String MICR) {
		this.MICR=MICR;
		}
	public void setContact(long contact) {
		Contact=contact;
	}
	public void setIFSC(String IFSC) {
		this.IFSC=IFSC;
	}
	public void setBranchName(String BranchName) {
		this.BranchName = BranchName;
	}
	public void setBranchCode(String branchcode) {
		this.BranchCode = branchcode;
	}
	public void displayBankInfo() {
		System.out.println("Bank Name   :"+ BankName);
		System.out.println("Branch      :" + BranchName);
		System.out.println("Branch Code :" + BranchCode);
		System.out.println("IFSC        :" + IFSC);
		System.out.println("MICR        :" + MICR);
		System.out.println("Address     :"+ Address);
		System.out.println("Contact     : 04146-" + Contact);
		System.out.println("");
	}
	

	}


