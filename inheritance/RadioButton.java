package week3.day1.homeassignments.inheritance;

public class RadioButton extends Button {

	//sub class method
			public void selectRadioButton() {
				System.out.println("grandchild Subclass method selectRadioButton is called");
			}
			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			RadioButton grandchild = new RadioButton();
			//calling grandparent (WebElement) methods
			grandchild.click();
			grandchild.setText("grandchild RadioButton" );
			//calling parent (Button) methods
			grandchild.submit();
			//calling own methods
			grandchild.selectRadioButton();

		}

}
