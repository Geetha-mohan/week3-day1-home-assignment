package week3.day1.homeassignments.singleinheritance;

public class TestData {
	
	public void enterCredentials(String Username,String Password) {
		System.out.println("Welcome "+Username+" reset password "+Password);
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigated to New page");
	}
	
	public static void main(String[] args) {
		TestData parent = new TestData();
		parent.navigateToHomePage();
		parent.enterCredentials("Testleaf123","33srfes");
		
	}
}
