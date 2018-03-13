/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import boot.spring.mvcweb.model.User;
import boot.spring.mvcweb.repository.UserRepository;

/**
 * @author ashish.adhikari
 *
 */
@Configuration
public class UserRepositoryConfig {
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryConfig.class);
	@Autowired
	private UserRepository userRepository; 
	@PostConstruct
	public void init() {
		log.info("Initialising repository!");
		userRepository.save( new User("1", "Tommy", "Wiseauooo", "I don't really know", 25));
		userRepository.save( new User("2", "Kathryn", null, "Janeway", 26));
		userRepository.save( new User("3", "Jean-Luc", null, "Picard", 27));
		userRepository.save( new User("4", "Benjamin", null, "Sisko", 28));
		userRepository.save( new User("5", "James", "Tiberius", "Kirk", 29));
		userRepository.save( new User("6", "Khan", "Noonien", "Singh", 21));
		log.info("Repo init complete!");
	}
	
}
