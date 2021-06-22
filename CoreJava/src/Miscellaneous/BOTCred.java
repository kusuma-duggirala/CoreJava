package Miscellaneous;

import java.util.Base64;

public class BOTCred {

	public static void main(String[] args) 
	{
		String faUserName="exmvs.emp1";
		String faPassword="Welcome1";
		
		byte[] bytesEncoded = Base64.getEncoder().encode((faUserName+":"+faPassword).getBytes());
				//((faUserName+":"+faPassword).getBytes());
		String credentials="Basic "+new String(bytesEncoded);
		System.out.println(credentials);

	}

}
