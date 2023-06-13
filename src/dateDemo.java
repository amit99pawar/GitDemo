import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		System.out.println(d.toString());	// Printing the date value from d object using toString method
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss"); // We need date in M/D/YYYY format so using SimpleDateFormat class.  
		System.out.println(sdf.format(d));  
		System.out.println(sd.format(d));
			
		
	}

}
