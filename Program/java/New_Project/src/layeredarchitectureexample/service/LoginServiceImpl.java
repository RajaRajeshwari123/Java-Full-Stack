
package layeredarchitectureexample.service;

import layeredarchitectureexample.dao.LoginDAO;
import layeredarchitectureexample.dao.LoginDAOImpl;
import layeredarchitectureexample.model.Login;

public class LoginServiceImpl implements LoginService {

	@Override
	public String verifyUserNameAndPassword(Login login) {
		LoginDAO loginDAO = new LoginDAOImpl();
		try {
		Login loginFromDB = loginDAO.getUserDetail(login.getUserName());
		if(loginFromDB !=null) {
		if(login.getPassword().equals(loginFromDB.getPassword())) {
			return "User logged in successfully";
		}else {
			throw new PasswordMismatchException("User Details mismatch");
		}
		}else {
			throw new UserNotFoundException();
		}
		}catch(UserNotFoundException e) {
			return "Username doesn't exists in our system";
		}
		catch(Exception e) {
			return "User doesn't exists in our system";
		}catch(PasswordMismatchException pme) {
			return pme.getMessage();
		}
		return "User details mismatch";
		
	}
}
