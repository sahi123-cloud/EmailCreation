package emailAp;
import java.util.*;
public class Email {
     private String firstName;
     private String lastName;
     private String department;
     private String password;
     private int mailBoxCapacity;
     private String alternateEmail;
     private int defaultpasswordLength=10;
     private String email;
     private String commonsuffix="TryU.com";
     
     public Email(String firstName,String lastName) {
    	 this.firstName=firstName;
         this.lastName=lastName;
         System.out.println(this.firstName +"."+ this.lastName);
         this.department=setDepartment();
//         System.out.println("your department is "+department);
         this.password=randomPassword(defaultpasswordLength);
         System.out.println("your password  -- "+this.password);
         email=firstName.toLowerCase() + "."+ lastName.toLowerCase() +"@"+department+ "."+commonsuffix; 
//         System.out.println("Your Email -- "+ email);
     }
     private String setDepartment() {
    	 System.out.println("Department codes \n 1 for sales \n 2 for development \n 3 for accounting \n 0 for none \nEnter the department code");
    	 Scanner s=new Scanner(System.in);
    	 int depChoice=s.nextInt();
    	 if(depChoice==1) {
    		 return "sales";
    	 }
    	 if(depChoice == 2) {
    		 return "development";
    	 }
    	 if(depChoice ==3) {
    		 return "accoumting";
    	 }
    	 return "";
     }
     private String randomPassword(int length) {
    	 String passwordSet="abcdefghijklmnopqrstuvwxyz0123456789@!#$%";
    	 char[] password=new char[length];
    	 for(int i=0;i<length;i++) {
    		 int rand=(int)(Math.random()*passwordSet.length());
    		 password[i]=passwordSet.charAt(rand);
    	 }
    	 return new String(password);
     }
     public void setmailBoxCapacity(int capacity) {
    	 this.mailBoxCapacity=capacity;
     }
     public void ssetaltEmail(String altEmail) {
    	 this.alternateEmail=altEmail;
     }
     public void changepassword(String password) {
    	 this.password=password;
     }
     public int getmailBoxCapacity() {
    	 return mailBoxCapacity;
     }
     public String getaltEmail() {
    	 return alternateEmail;
     }
     public String showInfo() {
    	 return "Name -- " + firstName +" " + lastName +"\n"+
    			 "Company Email -- " + email +"\n"+
    			 "Mail box capacity -- " + mailBoxCapacity;
    			 
     }
}
