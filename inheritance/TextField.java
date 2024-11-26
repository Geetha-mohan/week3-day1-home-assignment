package week3.day1.homeassignments.inheritance;

public class TextField extends WebElement {

	//sub class method
		public void getText() {
			System.out.println("Subclass getText method is called");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField textfield = new TextField();
		textfield.click();           //calling super class method from child object
		textfield.setText("TextField"); //calling super class method from child object
		textfield.getText();		  //calling sub class (own) method from child object
		
		//textfield.submit(); // this throws "undefined type" compile error as button class methods not visible to TextField class 
	}

}
