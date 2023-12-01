package date_time;

public class Date_Time {

	public static void main(String[] args) {
		long millis=System.currentTimeMillis();
		 java.sql.Date date=new java.sql.Date(millis);
		 java.sql.Time time=new java.sql.Time(millis);
		 System.out.println(date+"and time"+time);
	}

}
