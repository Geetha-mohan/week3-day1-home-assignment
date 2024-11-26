package week3.day1.homeassignments.inheritance;

public class Elements extends RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements element = new Elements();
		//calling WebElement methods
		element.click();
		element.setText("Element Execution class" );
		//calling Button methods
		element.submit();
		//calling RadioButton methods
		element.selectRadioButton();
	}

}
