package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P005_UniqueEmailAddresses {

	/*https://leetcode.com/problems/unique-email-addresses/
	 * 
	 * +ve test.test+leaf@aig.com -> testtest@aig.com
	 * -ve ........+@gmail.com
	 * 
	 * 1. Get the substring length is index of @
	 * 2. replace all the. in this substring
	 * 3. get the localname with length +
	 * concat localname + domain name
	 * 
	 * 
	 *  
	 * */
	
	
	 public static int numUniqueEmails(String[] emails) {
		
		 HashSet<String> mailSet = new HashSet<String>();
		 
		 String localName = "";
		 for (String eachEmail : emails) {
			 String domainNm = eachEmail.substring(eachEmail.indexOf("@"), eachEmail.length());
			 localName = eachEmail.substring(0, eachEmail.indexOf("@"));
			if(localName.indexOf("+") != - 1) {
				localName = localName.substring(0, eachEmail.indexOf("+"));
			}
			localName = localName.replaceAll("[.]", "");
			 //System.out.println(localName+domainNm);
			 //System.out.println(eachEmail.substring(0, eachEmail.indexOf("@")));
			 mailSet.add(localName+domainNm);
		 }
		 
		return mailSet.size();
	        
	    }
	
	
	
	public static void main(String[] args) {
		
		
		//numUniqueEmails(new String[] {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
		//numUniqueEmails(new String[] {"a@leetcode.com\",\"b@leetcode.com\",\"c@leetcode.com"});
		numUniqueEmails(new String[] {"test.email+alex@leetcode.com", "test.email@leetcode.com"});
		
		//["test.email+alex@leetcode.com", "test.email@leetcode.com"]
		
		
	}

}
