package net.avansasjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUsersDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String firstName) 
			throws UsernameNotFoundException {
		User user = repo.getUserByFirstName(firstName);
		if(user == null) {
			throw new UsernameNotFoundException("Kullanıcı Bulunamadı");
		}
		return new CustomUsersDetails(user);
	}

}
 

