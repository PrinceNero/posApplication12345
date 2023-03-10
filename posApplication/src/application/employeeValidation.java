package application;

public class employeeValidation {

	private String employees = "Employee1";
	private String  passwords = "Password1";
	private boolean manager;
	private boolean success;
	
	public String getEmployees(){
		return employees;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setEmployees(String employees) {
		 this.employees = employees;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public boolean isSuccess(String username, String password) {
		if(username.equals(employees) && password.equals(passwords)) {
			Tables.display("StarFire Grill");
			//Tables();
			return success = true;
			//remember to use .equals() to match strings neroooooo!!!!!!!!!!!!!
		}
		else if(username.equals(employees) || password.equals(passwords)) {
			alertBox.display("Wrong password!!", "Please enter the correct password.");
			return success = false;
		}
		else {
			alertBox.display("Log in failed", "Please enter the correct information, or contact a manager.");
			return success = false;
		}
		
	}
	
	
}
