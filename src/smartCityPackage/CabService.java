package smartCityPackage;
import java.util.*;
public class CabService {
String car_type,Pickup_place,Drop_place; 
double km,bill;

public CabService() {
	 car_type = "";
	 km = 0.0;
	 bill = 0.0;
}
public void accept() {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter Pickup place");
	Pickup_place = in.nextLine();
	System.out.println("Enter Drop Place");
	Drop_place = in.nextLine();
	System.out.println("Enter car type (AC or Non_AC)");
	car_type = in .nextLine();
	System.out.println("Enter Kilometer: ");
	km=in.nextDouble();
}
public void calculate () {
	if (km <=5) {
		if (car_type.equals("AC"))
			bill=150;
		else
			bill = 120;
	}
	else {
		if (car_type.equals("AC"))
			bill = 150+10*(km-5);
		else
			bill = 120+8*(km-5);
		
	}
}
public void display () {
	System.out.println("PickUp Place: " + Pickup_place );
	System.out.println("Drop Place: " + Drop_place);
	System.out.println("Car Type: " + car_type);
	System.out.println("Kilometer Travelled: " + km);
	System.out.println("Total Bill: " + bill);
}
}
