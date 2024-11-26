package week3.day1.homeassignments.inheritance;

public class Button extends WebElement{

	//sub class method
	public void submit() {
		System.out.println("Subclass method submit is called");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		button.click();           //calling super class method from child object
		button.setText("Button"); //calling super class method from child object
		button.submit();		  //calling sub class (own) method from child object	
		

	}

}
