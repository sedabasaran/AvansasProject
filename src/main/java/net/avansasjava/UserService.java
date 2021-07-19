package net.avansasjava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository UserRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	public void saveUserWithDefaultRole(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		Role role= roleRepo.findByName("User");
		user.addRole(role);
		
		UserRepo.save(user);
	}
	
	public void save(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		UserRepo.save(user);
	}
 
	public List<User> listAll() {
		return UserRepo.findAll();
	}
	
    public User get(Long id){
       return UserRepo.findById(id).get();
    }
    
    public List<Role> getRoles() {
    	return roleRepo.findAll();
    }
    
    public void delete(long id) {
        UserRepo.deleteById(id);
    }
}
