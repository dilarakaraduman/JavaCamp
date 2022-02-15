package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import business.abstracts.UserCheckService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService {
    UserDao userDao;
	public UserCheckManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean IsEmpty(User user) {
		if (user.getName().equals(null) || user.getLastName().equals(null) || user.getEmail().equals(null) 
				|| user.getPassword().equals(null) )
		{
			return false; 
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean nameAndLastNameCheck(User user) {
		if (user.getName().length()<2 || user.getLastName().length()<2  ) {
			return false;
		}
		else {
			return true;
		}
		
	}
		
	

	@Override
	public boolean regexMailCheck(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches()==true) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean passwordLengthCheck(User user) {
		if (user.getPassword().length()<6) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean unusedMailCheck(User user) {
for (User userBeingRead : userDao.getAll()) {
			
			if (user.getEmail() == userBeingRead.getEmail()) {
			
				return false;
			}	
		}
			return true;
	}

  }
