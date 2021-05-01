package day20210501.ex02;

public class UserIdCheck {
	public boolean check(String userId) throws InvalidUserIdException {
		// 길이를 판단
		// 8자이상 인가?
		userId = userId.trim();
		if(userId.length() <= 8) {
			throw new InvalidUserIdException();
		}
		
		return true;
	}

}
