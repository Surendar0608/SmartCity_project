package smartCityPackage;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class BookingHotel {
	String GuestName;
	int Hotel;
	int Rooms;
	Date date;
	BookingHotel(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name :");
		GuestName = in.next();
		System.out.println("Enter hotel number(mentioned above) :");
		Hotel = in.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateinput = in.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
		try {
			date = dateFormat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable( ArrayList<BookingHotel> bookings, ArrayList <Hotel> hotels) {
		int Rooms = 0;
				for(Hotel r :hotels ) {
					if(r.getSerialNo()== Hotel)
						Rooms=r.getRooms();
			}
				int booked=0;
	for(BookingHotel h: bookings) {
		if(h.Hotel== Hotel && h.date.equals(date)) {
			booked++;
			
		}
	}
	if (booked<Rooms)
		return true;
	else
		return false;
	}
	
}
