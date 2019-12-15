package hib;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("is exists username: along. should return false");
		System.out.println("   " + isExistUsername("along"));
		System.out.println("is exists username: test2. should return true");
		System.out.println("   " + isExistUsername("test2"));
		
//		
//		System.out.println("insert user should return number");
//		System.out.println("   " + insertUser("alontest","alonpass","alon","gal","9","5","1985") );
//		System.out.println("insert user should return null");
//		System.out.println("   " +  insertUser("alontest","alonpass","alon","gal","9","5","1985") );
//		
//		System.out.println("getTopNItems(6)");
//		List<Mediaitems> list = getTopNItems(6);
//		System.out.println("The Shawshank Redemption = " + list.get(0).getTitle());
//		System.out.println("The Godfather = " + list.get(1).getTitle());
//		System.out.println("The Godfather: Part II = " + list.get(2).getTitle());
//		System.out.println("The Dark Knight = " + list.get(3).getTitle());
//		System.out.println("Pulp Fiction = " + list.get(4).getTitle());
//		System.out.println("Schindler's List = " + list.get(5).getTitle());
//		
//		System.out.println("validateUser test3 pass3 should return true");
//		System.out.println("   " + validateUser("test3" , "pass3"));
//		System.out.println("validateUser test3 pass4 should return true");
//		System.out.println("   " + validateUser("test3" , "pass4"));
//
//		System.out.println("validateAdministrator admin adminpass should return 123");
//		System.out.println("   " + validateAdministrator("admin","adminpass"));
//		System.out.println("validateAdministrator admin adminpasss added s to password should return null");
//		System.out.println("   " + validateAdministrator("admin","adminpasss"));
//		
//		
//		System.out.println("insertToHistory userid= 6 mid=8   userid=6 mid= 20");
//		//insertToHistory("6", "8");  insertToHistory("6", "20");
//		System.out.println("insertToHistory userid=9 test14 mid=4   userid=9 mid= 29");
//		//insertToHistory("9", "20");   insertToHistory("9", "29");
//		
//		System.out.println("getHistory for user 6 ");
//		List<Pair<String, Timestamp>> l = getHistory("6");
//		for(Pair<String, Timestamp> p:l){
//			System.out.print("   " + p.getFirst());
//			System.out.println("   " + p.getSecond());
//		}
//		System.out.println("getHistory for user 9 ");
//		l = getHistory("9");
//		for(Pair<String, Timestamp> p:l){
//			System.out.print("   " + p.getFirst());
//			System.out.println("   " + p.getSecond());
//		}
//		System.out.println("getHistory for user 200 ");
//		l = getHistory("200");
//		if (l == null)
//		{
//			System.out.println("no user name in database users");
//		} else {
//			for(Pair<String, Timestamp> p:l){
//				System.out.print(p.getFirst());
//				System.out.println(p.getSecond());
//			}	
//		}
//		
//		System.out.println("insertToLog(8)");
//		insertToLog("8");
//		System.out.println("insertToLog(9)");
//		insertToLog("9");
//		System.out.println("getNumberOfRegistredUsers(0)");
//		System.out.println("   " + getNumberOfRegistredUsers(0));
//		System.out.println("getNumberOfRegistredUsers(3) = 2");
//		System.out.println("   " + getNumberOfRegistredUsers(3));
//		System.out.println("getNumberOfRegistredUsers(5)");
//		System.out.println("   " + getNumberOfRegistredUsers(5));
//		System.out.println("getNumberOfRegistredUsers(9)");
//		System.out.println("   " + getNumberOfRegistredUsers(9));
//		System.out.println("getNumberOfRegistredUsers(-1)");
//		System.out.println("   " + getNumberOfRegistredUsers(-1));
//		
//		System.out.println("getUsers");
//		List<Users> listUser = getUsers();
//		for(Users user:listUser){
//			System.out.println("   " + user.getFirstName() + " " +user.getLastName());
//		}
//		
//		System.out.println("getUser 5");
//		Users user = getUser("5");
//		System.out.println("   " + user.getFirstName() + " " +user.getLastName());
//		
//		


	}

	/**
	 *  The function returns true if the received username exist in the table USERS otherwise false.
	 * @param username
	 * @return
	 */
	public static boolean isExistUsername (String username){
		return true ; 
	} 
	/**
	 * The function checks if the username exist in the USERS table, in case of positive answer returns null else insert the user to the table USERS including registration_date field and returns the user id (USERID).
	 Use generator class="increment" for USERID.
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param day_of_birth
	 * @param month_of_birth
	 * @param year_of_birth
	 * @return
	 */
	public static String insertUser(String username, String password, String first_name, String last_name, String day_of_birth, String month_of_birth, String year_of_birth){
		return "" ; 
	}
	/**
	 * The function retrieves from the table MediaItems first top_n items
		(mid descending order).
	 * @param top_n
	 * @return
	 */
	public static List<Mediaitems> getTopNItems (int top_n){
		
		return  null ; 
	}
	/**
	 * The function compares received values with existing in the data base.
		The function return USERID if the values are equal to the values in the table otherwise return “Not Found”.
	 * @param username
	 * @param password
	 * @return
	 */
	public static String validateUser (String username, String password)
	{
		return "" ; 
	}
	/**
	 * The function compares received values with existing in the data base.
	 * The function return ADMINID if the values are equal to the values in the table otherwise “Not Found”.
	 * @param username
	 * @param password
	 * @return
	 */
	public static String validateAdministrator (String username, String password)
	{
		return "" ; 
	} 
	/**
	 * 	The function insert the row to the History table with current server time.
	Print The insertion to history table was successful <server time>.
	 * @param userid
	 * @param mid
	 */
	public static void insertToHistory (String userid, String mid)
	{}


	/**
	 * 	The function retrieves from the tables History and MediaItems users's items.
		The function return List of pairs <title,viewtime> sorted by VIEWTIME in
		ascending order.
	 * @param userid
	 * @return
	 */
//	public static List<String, Date> getHistory (String userid)
//	{
//		return null ; 
//	}


	/**
	 * 	The function insert the row to the LoginLog table with current server time
		Print “The insertion to log table was successful <server time>“.
	 * @param userid
	 */
	public static void insertToLog (String userid)
	{} 

	/**
	 * 	The function receives an integer number n
		The function retrieves from the table Users number of registered users in the past n days
	 	The function return integer number
	 * @param n
	 * @return
	 */
	public static int getNumberOfRegistredUsers(int n)
	{}


	/**
	 * The function retrieves from the table Users all users
	 * @return
	 */
	public static List<Users> getUsers ()
	{
		return null ; 
	}

	/**
	 * The function retrieves from the table Users user's information
		The function return objects Users
	 * @param userid
	 * @return
	 */
	public static Users getUser (String userid){
		return null ; 
	}




}
