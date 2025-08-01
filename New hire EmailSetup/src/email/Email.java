package email;
import java.util.Scanner;

public class Email {

	
		
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity =500;
    private int  defaultPasswordLength =10;
    private String alternateEmail;
    private String companySuffix = " aeycompany.com";
    
    // contructor to receive the first name and last name 
    public Email(String firstName,String lastName) {
	   this.firstName = firstName;
	   this.lastName =  lastName;
	   
    //call a method asking for departmenty  - return the department
	   this.department = setDepartment();
       
       //call a method that return a random password
       this.password = randomPassword(defaultPasswordLength);
       System.out.println("your password is: "+ this. password);
      
       //combine elements to generate email
       email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@"
+ department +"." + companySuffix;
     
    }
    // ask for department 
	 private String setDepartment() {
		 System.out.println(" New Worker:" + firstName + " . department codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
         Scanner in = new Scanner(System.in);
         System.out.println("Enter Department code:");
         int depChoice= in.nextInt();
         if (depChoice ==1) {return "sales";}
         else if (depChoice ==2){return "dev";}
         else if (depChoice == 3) {return"acct";}
         else { return "";}
         
	 }  
      // Generate the random password
	 private String randomPassword(int length){
		 String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	     char[]password =new char [length];
	     for (int i=0; i<length; i++) {
	    	 int rand = (int)(Math.random()* passwordSet.length());
	    	 password[i] = passwordSet.charAt(rand);
	     }
	     return new String(password);
	 }
	 
    
    // set the mailbox capacity
	 public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity = capacity;
	 }
	 // set the alternate email
	 public void  setAlternateEmail(String altEmail) {
		 this.alternateEmail= altEmail;
	 }
    // change the password
    public void changePassword(String password) {
    	this.password = password;
    }
    public int getMailboxCapacity(){ return mailboxCapacity;}
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password;}
  
    public String showInfo() {
    	return "Display Name:" + firstName + ""
+ lastName + "\nCOMPANY EMAIL:" + email +"\nMAILBOX CAPACITY:" + mailboxCapacity + "mb"; 
}
    
    
    }
    

