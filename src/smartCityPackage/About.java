package smartCityPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class About{
public void history() {
	File file = new File("C:\\Users\\Hp\\eclipse-workspace\\SmartCity_miniProject\\Villupuram_History.txt");
	Scanner Scan = null;
	try {
		Scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while (Scan.hasNextLine()) {
		System.out.println(Scan.nextLine());
	}

	
}
}