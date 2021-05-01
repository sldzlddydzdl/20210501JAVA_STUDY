package day20210501.ex03;

public class UserCheck {
	
	public boolean check(String userId, String password) throws InvalidUserIdException, InvalidUserPwException {
		userId = userId.trim();
		if(userId.length() < 8 ) {
			throw new InvalidUserIdException();
		}
		password = password.trim();
		if(password.length() < 8) {
			throw new InvalidUserPwException("비번이 문제!");
		}
		
		return true;
	}
	
}
