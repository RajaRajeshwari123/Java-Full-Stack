package layeredarchitectureexample.dao;
import layeredarchitectureexample.model.Login;

public class LoginDAOImpl implements LoginDAO{

	@Override
	public Login getUserDetail(String UserName) {
		Login login=new Login("admin","password");
//		Login login=new Login("Raji","raji1234");
		if(login.getUserName().equals(UserName)) {
			return login;
		}
		// TODO Auto-generated method stub
		return null;
	}
	

}

