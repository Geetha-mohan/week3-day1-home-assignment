package week3.day1.homeassignments.singleinheritance;

public class LoginTestData extends TestData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData child = new LoginTestData();
		
		child.navigateToHomePage();
		
		child.enterCredentials(child.enterUsername(), child.enterPassword());
		

	}
	
	public String enterUsername() {
		return "Testleaf2024";
	}
	public String enterPassword() {
		return "crms@123";
	}

}
