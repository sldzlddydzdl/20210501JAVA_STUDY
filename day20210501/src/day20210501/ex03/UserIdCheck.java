package day20210501.ex03;

public class UserIdCheck {
	public boolean IdCheck(String id) throws InvalidUserIdException {
		
		if(id.length() >= 8) {
			throw new InvalidUserIdException();
		}
		return true;
	}
}
