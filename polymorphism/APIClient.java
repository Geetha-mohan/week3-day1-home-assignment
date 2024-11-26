package week3.day1.homeassignments.polymorphism;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint is "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint is "+endpoint+"& requestbody is "+requestBody+" & requestStratus received is "+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient client = new APIClient();
		client.sendRequest("www.google.com");
		client.sendRequest("www.facebook.come", "facebookAPI", true);
	}

}
