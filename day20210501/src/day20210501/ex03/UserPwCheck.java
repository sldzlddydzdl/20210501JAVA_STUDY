package day20210501.ex03;

public class UserPwCheck {
	public boolean PwCheck(String pw) throws InvalidUserPwException {
		
		if(pw.length() >= 8)
			throw new InvalidUserPwException(pw);
		
		return true;
	}
}
