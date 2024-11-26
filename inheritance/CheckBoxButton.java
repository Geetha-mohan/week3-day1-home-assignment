package week3.day1.homeassignments.inheritance;

public class CheckBoxButton extends Button {
	
	//sub class method
		public void clickCheckButton() {
			System.out.println("grandchild Subclass method clickSubmitButton is called");
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton grandchild = new CheckBoxButton();
		//calling grandparent (WebElement) methods
		grandchild.click();
		grandchild.setText("grandchild CheckBoxButton" );
		//calling parent (Button) methods
		grandchild.submit();
		//calling own methods
		grandchild.clickCheckButton();

	}

}
