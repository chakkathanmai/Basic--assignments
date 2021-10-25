package sessiontask;

public class SavingsAccount extends Account {
              private String orgName;

			public SavingsAccount() {
				super();
			}

			public SavingsAccount(String accName, String accNo, String bankName,String orgName) {
				super(accName,accNo,bankName);
				this.orgName = orgName;
			}
            void display() {
            	super.display();
            	System.out.println("Organization Name: "+orgName);
            }
			
              
}
