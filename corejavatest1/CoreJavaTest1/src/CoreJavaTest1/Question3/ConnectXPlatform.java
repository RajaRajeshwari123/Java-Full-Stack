package CoreJavaTest1.Question3;


public class ConnectXPlatform {
	public static void main(String[] args) {
		DigitalService streamingService = new StreamingService();
		DigitalService cloudStorageService = new CloudStorageService();

		streamingService.login("User-1", "password@123");
		streamingService.accessContent("abc123");
		streamingService.updateProfile("Xyz", "Uvw", "wxy@gmail.com");
		streamingService.logout();
		
		cloudStorageService.login("User-1", "password*123");
		cloudStorageService.accessContent("movie123");
		cloudStorageService.updateProfile("Xyz", "Uvw", "xyz.uvw@example.com");
		cloudStorageService.logout();
}
}