package smartCityPackage;

import java.util.*;

public class smartCity {

	public static void main(String[] args) {
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		ArrayList<BookingHotel> bookings = new ArrayList<BookingHotel>();
		
//		Hotel(String name,int serialno, String ac,int rooms,String address,long contact)
		
		hotels.add(new Hotel("Archanas", 1, "Both Available", 5, "No:2,Tiruchi main road, near new BusStand", 9595695956L));
		hotels.add(new Hotel("Star", 2, "Both Available", 5, "No:101,Gandhiji road opp to Hanuman temple", 8901012020l));
		hotels.add(new Hotel("ES", 3, "Both Available", 2, "No:3 Tiruchi main road, near new BusStand, ", 9597769109L));
		hotels.add(new Hotel("Selvi", 4, "Both Available", 6, "No: 105, Chennai to tiruchi MainRoad near ES school ", 8005070050l));

		ArrayList<Bankdetails> bank = new ArrayList<Bankdetails>();
		
	//	Bankdetails(String name,String address, String IFSC,String MICR,String BranchName,String branchcode,long contact){

		bank.add(new Bankdetails("Indian Bank","793,Nehtuji Road,Villupuram-605602","IDIB000V024","605019098","Villupuram","00V024",222820) );
		bank.add(new Bankdetails("State Bank of India","No:2,KK Road,Villupuram-605602","SBI0000949","605002888","Villupuram","000949",222809) );
		bank.add(new Bankdetails("Indian Overseas Bank","719,Nehtuji Road,Villupuram-605602","IOB0001278","60520016","Villupuram","001278",223622) );
		bank.add(new Bankdetails("Central Bank of Indaia","No:13,Kandasamy layout,KK Road,Villupuram-605602","CBI0280890","Not provided","Villupuram","280890",22612008) );
		bank.add(new Bankdetails("Axis bank","No:2,Trichy Road,opp to New BusStand,Villupuram-605602","UTI0000467","605211999","Villupuram","000467",222561) );
		bank.add(new Bankdetails("HDFC","TPK Nagar,Trichy Road,Villupuram-605602","HDFC0001075","605240102","Villupuram","000949",000000000) );

		ArrayList<HospitalDetails> Hos = new ArrayList<HospitalDetails>();
		//HospitalDetails(String name,String Type, String address, String hours,String email,long contact){
		
		Hos.add(new HospitalDetails("Government Hospital Villipuram and Medical college","Hospital and college","Mundiyampaakam,Vikaravandi Taluk, Villpuram","24 hrs daily","vpmmc_tn@yahoo.com",232400l));
		Hos.add(new HospitalDetails("Government Hospital Villipuram","Hospital","Near Signal,Villpuram-605602","24 hrs daily","villupuramgh@gmail.com",220400));
		Hos.add(new HospitalDetails("E.S Hospital","General Medical & Surgical Hospital(Private)","No:32b,Trichy Main Road, Villpuram-605602","24 hrs daily","esvpm@gmail.com",251035));
		Hos.add(new HospitalDetails("Maragadam Hospital","General Medical & Surgical Hospital(Private)","Mandhakarai Villpuram-605602","24 hrs daily","maragadamvpm@gmail.com",225456));
		Hos.add(new HospitalDetails("Devaki Hospital","Paediatric & Urology (Private)","No:1,chairman chidambaram street, Villpuram-605602","24 hrs daily","devakivpmhos@gmail.com",251023));
		
		ArrayList<Colleges_universities> CU = new ArrayList<Colleges_universities>();
		//Colleges_universities(String name, String address,String email,String website,long contact){

		CU.add(new Colleges_universities("Arignar Anna Government Arts College","Avenue Road, Keezperum Pakkam, Villupuram T.K & DT","vpmgac@gmail.com","http://www.aagacvpm.com",240681) );
		CU.add(new Colleges_universities("Dr.M.G.R Govt Arts and Science College for Women's","Napalaya Street,Villupuram 605602","vpmmgr@gmail.com","http://www.mgrvpm.com",223858) );
		CU.add(new Colleges_universities("Government Law College Villupuram ","Old Taulk Office, THiru.vi.ka Street Villupuram","vpmlaw@gmail.com","http://www.vpmlaw.com",227566) );
		CU.add(new Colleges_universities("University College Of Engineering Tindivannam","Melpakkam College Road Tindivanam T.K \r\n"
				+"	 Viluppuram District Tamil Nadu - 604001","dean@aucet.com","http://www.aucet.in",238477) );
		CU.add(new Colleges_universities("University College Of Engineering Villupuram","Kakuppam Villupuram Taluk and District Tamil Nadu 605103","auc@yahoo.com","http://www.aucev.edu.in",224500) );

		int choice, useroption;
		useroption = 1;
		Scanner in = new Scanner(System.in);
	
		do {
			System.out.println("WELCOME TO VILLUPURAM");
			System.out.println("");
			System.out.println("1.ABOUT DISTRICT");
			System.out.println("2.HOTELS");
			System.out.println("3.CAB SERVICES");
			System.out.println("4.HOSPITALS");
			System.out.println("5.BANKS");
			System.out.println("6.COLLEGES/UNIVERSITIES");
			System.out.println("ENTER YOUR CHOICE : ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("");
				System.out.println("History");
				System.out.println("");
				About a=new About();
				a.history();
				break;
			case 2:
				int userin;
				do {
				for (Hotel h : hotels)
					h.displayHotelInfo();
				
					System.out.println("For hotel booking enter 1");
					int input = in.nextInt();
					if (input == 1) {
						BookingHotel booking = new BookingHotel();
						if (booking.isAvailable(bookings, hotels)) {
							bookings.add(booking);
							System.out.println("your booking is confirmed");
						} else
							System.out.println("sorry rooms not available, try another room or date");
					}
					System.out.println("press 1 to Booking and 0 to exist from booking");
					userin = in.nextInt();
				} while (userin == 1);
				break;

			case 3:
				System.out.println("");
				System.out.println("CAB SERVICE");
				System.out.println("");
				CabService obj = new CabService();
					obj.accept();
					obj.calculate();
					obj.display();
				break;
			case 4:
				System.out.println("");
				System.out.println("Hospitals in Villupuram");
				System.out.println("");
				
				for(HospitalDetails H : Hos)
					H.displayHosInfo();
				break;
			case 5:
				System.out.println("");
				System.out.println("Banks in Villupuram");
				System.out.println("");

				for(Bankdetails b : bank)
					b.displayBankInfo();
				break;
			case 6:
				System.out.println("");
				System.out.println("COLLEGES AND UNIVERSITIES");
				System.out.println("");
				
				for(Colleges_universities C : CU)
					C.displayInfo();
				break;
			}
			System.out.println("Enter 1 to home page or 0 to exit"); 
			useroption = in.nextInt();
		} while (useroption == 1);
System.out.println("thank you");
	}
	
}
