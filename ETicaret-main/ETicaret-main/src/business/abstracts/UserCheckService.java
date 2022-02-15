package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {
	
	boolean IsEmpty(User user);
	boolean nameAndLastNameCheck(User user);
	boolean regexMailCheck(User user);
	boolean passwordLengthCheck(User user);
	boolean unusedMailCheck(User user);
	
}
