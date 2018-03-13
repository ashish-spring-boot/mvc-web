/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.repository;

import java.util.HashMap;
import java.util.Map;

import boot.spring.mvcweb.model.User;

/**
 * @author ashish.adhikari
 *
 */
public class UserRepository {
	Map<String, User> users;
 	public void saveAll() {
		users = new HashMap<>();
		users.put("1", new User("1", "Tommy", "Wiseauooo", "I don't really know", 25) );
		users.put("2", new User("2", "Kathryn", null, "Janeway", 26));
		users.put("3", new User("3", "Jean-Luc", null, "Picard", 27));
		users.put("4", new User("4", "Benjamin", null, "Sisko", 28));
		users.put("5", new User("5", "James", "Tiberius", "Kirk", 29));
		users.put("6", new User("6", "Khan", "Noonien", "Singh", 21));
	}
 	
 	public User findByUserId(String userId) {
 		return users.get(userId);
 	}
}
