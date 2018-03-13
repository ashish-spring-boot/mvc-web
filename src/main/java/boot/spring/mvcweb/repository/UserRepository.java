/**
 * @author ashish.adhikari
 */
package boot.spring.mvcweb.repository;

import org.springframework.data.repository.CrudRepository;

import boot.spring.mvcweb.model.User;

/**
 * @author ashish.adhikari
 *
 */
public interface UserRepository extends CrudRepository<User, String>{
	User findByUserId(String userId);
 	
}
