package uipack;


import java.util.Scanner;

import layeredarchitectureexample.model.Login;
import layeredarchitectureexample.service.LoginService;
import layeredarchitectureexample.service.LoginServiceImpl;

public class LoginDriver {

	public static void main(String[] args) {
		//Created an object of customer class
		Login login = new Login();
		
		Scanner sc = new Scanner(System.in);
		//Reading input and setting it to login class object
		login.setUserName(sc.next());
		login.setPassword(sc.next());

		//Verify whether username and password matches with data from the database
		LoginService loginService = new LoginServiceImpl();
		String message = loginService.verifyUserNameAndPassword(login);
		System.out.println(message);
	}

}
