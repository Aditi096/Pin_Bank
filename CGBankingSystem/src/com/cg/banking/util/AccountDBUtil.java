package com.cg.banking.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;
import com.cg.banking.beans.Account;

public class AccountDBUtil {
/*private static Connection con=null;
	
	public static Connection getDBConnection() {
		if(con==null) {
			Properties payrollProperties= new Properties();
			try {
				payrollProperties.load(new FileInputStream(new File(".//resources//payroll.properties")));
				String driver=payrollProperties.getProperty("driver");
				String url=payrollProperties.getProperty("url");
				String user=payrollProperties.getProperty("user");
				String password=payrollProperties.getProperty("password");
				
				//1st load driver
				Class.forName(driver);
				//2nd open connection
				con=DriverManager.getConnection(url,user,password);
			}catch(FileNotFoundException e) {
				
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return con;
		
	}
	
	
}*/
				
				
				
				
	public static HashMap<Long,Account> accountDetails = new HashMap<>();
	static private int n=9999-1000;
	static Random ran=new Random();
	public static long accountNumber = 100;
	public static int pinNumber=ran.nextInt(9999)%n;
	public static String accountStatus = "Active";

	public static long getACCOUNT_NUMBER() {
		return ++accountNumber;
	}
	public static int getPIN_NUMBER() {
		return ++pinNumber;
	}
	public static String getACCOUNT_STATUS() {
		return accountStatus;
	}
}