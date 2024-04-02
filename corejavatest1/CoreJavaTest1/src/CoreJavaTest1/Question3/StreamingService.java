package CoreJavaTest1.Question3;

public class StreamingService implements DigitalService{

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Logged in to Streaming Service with username: " + username);
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Logged out from Streaming Service.");
	}

	@Override
	public void accessContent(String contentId) {
		// TODO Auto-generated method stub
		System.out.println("Accessing content with ID: " + contentId + " on Streaming Service.");
	}

	@Override
	public void updateProfile(String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		System.out.println("Profile updated on Streaming Service for: " + firstName + " " + lastName);
	}

}
