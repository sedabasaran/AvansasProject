package net.avansasjava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("")
	public String anaSayfa() {
		return "index";
	}
	
	@GetMapping("/kayıt")
	public String kullanıcıKayıtForm(Model model) {
		model.addAttribute("user", new User());
		
		return "kullanıcıKayıt";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		repo.save(user);
		return "basarılıKayıt";
		
	}
	
	@GetMapping("/list_users")
	public String viewUsersList(Model model) {
		List<User> listUsers = repo.findAll();
		model.addAttribute("listUsers", listUsers);
		return "kullanıcılar";
	}

}
