package net.avansasjava;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("ali@gmail.com");
		user.setFirstName("ali");
		user.setLastName("doğru");
		user.setBirthDate("10.07.2003");
		user.setPhoneNumber("71248567819");
		user.setPassword("ali19");
		
		User savedUser = repo.save(user);
		
		User existUser = entityManager.find(User.class, savedUser.getId());


		assertThat(existUser.getFirstName()).isEqualTo(user.getFirstName());
	}
	
	@Test
	public void testFindUserByFirstName() {
		String firstName = "seda";
		User user = repo.getUserByFirstName(firstName);
		
		assertThat(user).isNotNull(); 
	}

		
}
